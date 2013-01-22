/**
 * Your Copyright Here
 *
 * Appcelerator Titanium is Copyright (c) 2009-2010 by Appcelerator, Inc.
 * and licensed under the Apache Public License (version 2)
 */
#import "AppersonlabsCarbonModule.h"
#import "TiBase.h"
#import "TiHost.h"
#import "TiUtils.h"
#import "TiViewProxy.h"
#import "JSONKit.h"
#import "CBStylesheet.h"

#define kTemplateValueDelimiter '%'

@interface TemplateSetter : NSObject
@property (nonatomic, retain) id target;
@property (nonatomic, retain) NSString * key;
+ (TemplateSetter *)setterForKey:(NSString *)key target:(id)target;
- (void)applyValue:(id)value;
@end

@implementation TemplateSetter
+ (TemplateSetter *)setterForKey:(NSString *)key target:(id)target {
    TemplateSetter * result = [[TemplateSetter alloc] init];
    result.key = key;
    result.target = target;
    return result;
}
- (void)applyValue:(id)value {
    [self.target setValue:value forKey:self.key];
}
@end


@interface AppersonlabsCarbonModule ()
@property (nonatomic, strong) NSRegularExpression * templateValueRegex;
- (TiViewProxy *)constructViewProxy:(NSDictionary *)dict idCache:(NSMutableDictionary *)cache templateSetters:(NSMutableDictionary *)setters;
@end


@implementation AppersonlabsCarbonModule

@synthesize uimodule;
@synthesize stylesheets;
@synthesize templateValueRegex;

#pragma mark Internal

// this is generated for your module, please do not change it
-(id)moduleGUID
{
	return @"153841ac-ef8d-4d93-b5c5-c57043ee570c";
}

// this is generated for your module, please do not change it
-(NSString*)moduleId
{
	return @"appersonlabs.carbon";
}

#pragma mark Lifecycle

- (id)init {
    if (self = [super init]) {
        self.stylesheets = [NSMutableArray array];

        NSError * error;
        self.templateValueRegex = [NSRegularExpression regularExpressionWithPattern:@"%([^%]+)%" options:0 error:&error];
        if (!self.templateValueRegex || error) {
            NSLog(@"[ERROR] template regex compilation error: %@", [error description]);
        }
    }
    return self;
}

-(void)startup {
	[super startup];
    
    self.uimodule = [[self.executionContext host] moduleNamed:@"UI" context:self.executionContext];
    
	NSLog(@"[INFO] %@ loaded",self);
}

-(void)shutdown:(id)sender {
	[super shutdown:sender];
}

#pragma mark Cleanup

-(void)dealloc {
    RELEASE_TO_NIL(tibs);
	[super dealloc];
}

#pragma mark -

-(NSDictionary*)tibs
{
    if(tibs == nil) {
        tibs = [[NSMutableDictionary alloc] init];
    }
    
	return tibs;
}

- (NSString*)LintDescription:(const char *) aString  length:(size_t) aLength error: (NSError*) aError
{
    NSMutableArray *sResult;
    NSArray        *sLines;
    NSInteger       sLine;
    NSInteger       sIndex;
    const char     *sBegin;
    int             i;
    
    sResult = [NSMutableArray array];
    sLines  = [[NSString stringWithUTF8String:aString] componentsSeparatedByString:@"\n"];
    sLine   = [[[aError userInfo] objectForKey:@"JKLineNumberKey"] integerValue];
    sIndex  = [[[aError userInfo] objectForKey:@"JKAtIndexKey"] integerValue] - 1;
    
    /*
     * error description
     */
    [sResult addObject:[NSString stringWithFormat:@"%@", [aError localizedDescription]]];
    
    /*
     * position of error
     */
    for (sBegin = aString + sIndex; ((sBegin > aString) && (*sBegin != '\n')); sBegin--);
    
    if (*sBegin == '\n')
    {
        sBegin++;
    }
        
    /*
     * json text lines
     */
    for (i = sLine - 1; ((i >= 0) && (i >= (sLine - 1))); i--)
    {
        [sResult addObject:[NSString stringWithFormat:@"On line %1d: %@", (i + 1), [[sLines objectAtIndex:i] stringByReplacingOccurrencesOfString:@"\t" withString:@" "]]];
    }
    
    return [[[sResult reverseObjectEnumerator] allObjects] componentsJoinedByString:@" "];
}

- (NSString *)contentsOfFileAtPath:(NSString *)path {
    NSString * abspath = [[[NSBundle mainBundle] bundlePath] stringByAppendingPathComponent:path];
    
    if (![[NSFileManager defaultManager] fileExistsAtPath:abspath]) {
        NSLog(@"[WARN] UIBuilder source file '%@' not found", path);
        return nil;
    }
    
    NSError * error = nil;
    NSString * result = [NSString stringWithContentsOfFile:abspath encoding:NSUTF8StringEncoding error:&error];
    if (error) {
        NSLog(@"error = %@", error);
        NSLog(@"[WARN] Cannot read UIBuilder source file '%@'", path);
        return nil;
    }
    
    return result;
}

- (NSDictionary *)loadUIDefFromPath:(NSString *)path {
    NSDictionary *tib = nil;
    
    // first check to see if we've already loaded the tib
	// and if so, return it
	if (tibs!=nil)
	{
		tib = [tibs objectForKey:path];
		if (tib!=nil)
		{
			return tib;
		}
	}
    
    NSString * data = [self contentsOfFileAtPath:path];
    if (!data) return nil;
    
    NSError * error;
    tib = [data objectFromJSONStringWithParseOptions: JKParseOptionComments error: &error];
    
    if (!tib) {
        const char* jsonString = [data UTF8String];
        [NSException raise:@"Invalid JSON file" format:@"JSON parse error in file %@ on line %@", path, [self LintDescription:jsonString length:strlen(jsonString) error:error]];

    } else {
        [tibs setObject:tib forKey:path];
    }
    
    return tib;
}

- (TiViewProxy *)constructViewProxy:(NSDictionary *)dict idCache:(NSMutableDictionary *)cache templateSetters:(NSMutableDictionary *)setters {
    if (!dict || [dict count] < 1) {
        return nil;
    }
    else if ([dict count] > 1) {
        NSLog(@"[ERROR] UIBuilder source must contain a single object: %@", dict);
        return nil;
    }

    NSString * key = [[dict allKeys] objectAtIndex:0];
    
    // Clean the key for cleaner input
    key = [key stringByReplacingOccurrencesOfString:@"Ti" withString:@""];
    key = [key stringByReplacingOccurrencesOfString:@"Titanium" withString:@""];
    key = [key stringByReplacingOccurrencesOfString:@"." withString:@""];
    
    NSMutableDictionary * params = [NSMutableDictionary dictionaryWithDictionary:[dict objectForKey:key]];
    
    // Allow for platform specific UI, reject elements that dont exist on the platform
    NSArray* platforms = [params objectForKey:@"platforms"];
    if(platforms != nil) {
        
        if([TiUtils isIPad]) {
            if(![platforms containsObject: @"ipad"] && ![platforms containsObject: @"ios"]) {
                return nil;
            }
        } else {
            if(![platforms containsObject: @"iphone"] && ![platforms containsObject: @"ios"]) {
                return nil;
            }
        }
        
        [params removeObjectsForKeys:[NSArray arrayWithObjects:@"platforms", nil]];
    }
    
    
    // Ignoring elements that do not exist on this platform
    if([[key lowercaseString] rangeOfString:@"android"].location != NSNotFound) {
        NSLog(@"[DEBUG] Ignoring invalid %@, as it is an Android only element", key);
        return nil;
    }
    if([[key lowercaseString] rangeOfString:@"mobileweb"].location != NSNotFound) {
        NSLog(@"[DEBUG] Ignoring invalid %@, as it is an MobileWeb only element", key);
        return nil;
    }
    if([TiUtils isIPad]){
        if([[key lowercaseString] rangeOfString:@"iphone"].location != NSNotFound) {
            NSLog(@"[DEBUG] Ignoring invalid %@, as it is an iPhone only element", key);
            return nil;
        }
    } else {
        if([[key lowercaseString] rangeOfString:@"ipad"].location != NSNotFound) {
            NSLog(@"[DEBUG] Ignoring invalid %@, as it is an iPad only element", key);
            return nil;
        }
    }
    
    
    // save parameters that are not part of the UI object's constructor params
    NSArray * children = [params objectForKey:@"children"];
    [params removeObjectsForKeys:[NSArray arrayWithObjects:@"children", nil]];
    
    NSArray * tabs = [params objectForKey:@"tabs"];
    [params removeObjectsForKeys:[NSArray arrayWithObjects:@"tabs", nil]];
    
    NSArray * items = [params objectForKey:@"items"];
    [params removeObjectsForKeys:[NSArray arrayWithObjects:@"items", nil]];
    
    NSDictionary * window = [params objectForKey:@"window"];
    [params removeObjectsForKeys:[NSArray arrayWithObjects:@"window", nil]];
    
    //Now that the params are cleaned... lets replace any "constants" strings
    for (NSString* k in params.allKeys) {
        NSString* value = [params objectForKey:k];
        
        if([value isKindOfClass:[NSString class]]) {
            if([value hasSuffix:@"FILL"]) {
                [params setValue: kTiBehaviorFill forKey:k];
            } else if ([value hasSuffix:@"SIZE"]) {
                [params setValue: kTiBehaviorSize forKey:k];
            }
            
        }
    }

    // apply stylesheets
    for (CBStylesheet * stylesheet in self.stylesheets) {
        [stylesheet applyStylesForKey:key toParams:params];
    }
    
    // create objects that must be added at creation
    if( [items count] > 0 ) {
        NSMutableArray* newItems = TiCreateNonRetainingArray();
        for (NSDictionary * item in items) {
            [newItems addObject: [self constructViewProxy:item idCache:cache templateSetters:setters]];
        }
        [params setObject: newItems forKey:@"items"];
        [newItems release];
    }
    
    if( [tabs count] > 0 ) {
        NSMutableArray* newTabs = TiCreateNonRetainingArray();
        for (NSDictionary * tab in tabs) {
            [newTabs addObject: [self constructViewProxy:tab idCache:cache templateSetters:setters]];
        }
        [params setObject: newTabs forKey:@"tabs"];
        [newTabs release];
    }
    
    if( window != nil ) {
        [params setObject: [self constructViewProxy:[NSDictionary dictionaryWithObjectsAndKeys:
                                                     window, @"Window", nil] idCache:cache templateSetters:setters] forKey:@"window"];
    }
    
    
    // Lets start applying what we created
    if([key isEqualToString:@"Carbon"]) {
        // Pull in another file
        if([params objectForKey:@"path"] != nil) {
            NSDictionary * subuidict = [self loadUIDefFromPath:[params objectForKey:@"path"]];
            TiViewProxy * proxy = [self constructViewProxy:subuidict idCache:cache templateSetters:setters];
            
            if (!proxy) {
                NSLog(@"[WARN] Cannot create object of type %@", key);
                return nil;
            }
            
            return proxy;
        } else {
            NSLog(@"[WARN] A UI type of json requires a path key value set to a json file in the local file path");
        }
        
    } else if([key isEqualToString:@"Module"]) {
        
        // TODO: Do something to somehow include a CommonJS module...
        
    } else {
        NSString* name = [NSString stringWithFormat:@"create%@", key];
        TiViewProxy * proxy = [self.uimodule createProxy:[NSArray arrayWithObject:params] forName:name context:self.executionContext];
        
        if (!proxy) {
            NSLog(@"[WARN] Cannot create object of type %@", key);
            return nil;
        }
        
        NSString * proxyid = [params objectForKey:@"id"];
        
        if (proxyid) {
            [cache setObject:proxy forKey:proxyid];
        }
        
        for (NSDictionary * child in children) {
            id childProxy = [self constructViewProxy:child idCache:cache templateSetters:setters];
            if(childProxy != nil) {
                [proxy add:[self constructViewProxy:child idCache:cache templateSetters:setters]];
            }
        }
        
        // look for template keys and construct setter objects for later use
        for (NSString * k in params.allKeys) {
            NSObject * v = [params objectForKey:k];
            if ([v isKindOfClass:[NSString class]]) {
                NSString * vstr = (NSString *)v;
                NSArray * matches = [self.templateValueRegex matchesInString:vstr options:0 range:NSMakeRange(0, [vstr length])];
                if ([matches count] > 0) {
                    NSTextCheckingResult * match = [matches objectAtIndex:0]; // should only be one match
                    NSString * templateKey = [vstr substringWithRange:[match rangeAtIndex:1]];
                    TemplateSetter * setter = [TemplateSetter setterForKey:k target:proxy];
                    [setters setObject:setter forKey:templateKey];
                }
            }
        }
        
        return proxy;
    }
}

- (id)proxiesFromUIDefinition:(NSDictionary *)uiObject templateSetters:(NSMutableDictionary *)setters {
    NSMutableDictionary * cache = TiCreateNonRetainingDictionary();
    
    TiViewProxy * rootProxy = [self constructViewProxy:uiObject idCache:cache templateSetters:setters];
    if (!rootProxy) return nil;
    
    NSMutableDictionary * returnObject = TiCreateNonRetainingDictionary();
    
    [returnObject setObject:[rootProxy autorelease] forKey:@"root_element"];
    [returnObject setObject:[cache autorelease] forKey:@"proxy_cache"];
    
    return [returnObject autorelease];
}


#pragma mark Public APIs

- (id)createFromFile:(id)args {
    
    NSString * path;
    
    ENSURE_ARG_AT_INDEX(path, args, 0, NSString)
    
    NSMutableDictionary * templateValues;
    
    ENSURE_ARG_OR_NULL_AT_INDEX(templateValues, args, 1, NSDictionary)

    NSDictionary * uiObject = [self loadUIDefFromPath:path];
    if (!uiObject) {
        return nil;
    }
    
    NSMutableDictionary * templateSetters = [NSMutableDictionary dictionary];
    id result = [self proxiesFromUIDefinition:uiObject templateSetters:templateSetters];
    
    for (NSString * key in [templateValues keyEnumerator]) {
        TemplateSetter * setter = [templateSetters objectForKey:key];
        [setter applyValue:[templateValues objectForKey:key]];
    }
    
    return result;
}

- (id)createFromObject:(id)args {
    
    NSDictionary * uiObject;
    
    ENSURE_ARG_AT_INDEX(uiObject, args, 0, NSDictionary)
    
    NSDictionary * templateValues;
    
    ENSURE_ARG_OR_NULL_AT_INDEX(templateValues, args, 1, NSDictionary)

    NSMutableDictionary * templateSetters = [NSMutableDictionary dictionary];
    id result = [self proxiesFromUIDefinition:uiObject templateSetters:templateSetters];
    
    for (NSString * key in [templateValues keyEnumerator]) {
        TemplateSetter * setter = [templateSetters objectForKey:key];
        [setter applyValue:[templateValues objectForKey:key]];
    }
    
    return result;
}

- (void)tssFromPath:(id)args {
    NSString * path;
    ENSURE_ARG_AT_INDEX(path, args, 0, NSString)

    NSString * abspath = [[[NSBundle mainBundle] bundlePath] stringByAppendingPathComponent:path];
    
    if (![[NSFileManager defaultManager] fileExistsAtPath:abspath]) {
        NSLog(@"[WARN] TSS file '%@' not found", path);
        return;
    }
    
    NSLog(@"[INFO] Loading: %@", path);
    
    [self.stylesheets addObject:[CBStylesheet stylesheetFromFile:abspath]];
}

@end
