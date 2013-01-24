/**
 * Your Copyright Here
 *
 * Appcelerator Titanium is Copyright (c) 2009-2010 by Appcelerator, Inc.
 * and licensed under the Apache Public License (version 2)
 */
#import "AppersonlabsCarbonModule.h"
#import "CBProxyGenerator.h"
#import "CBStylesheet.h"
#import "TiUITableViewProxy+RowTemplates.h"

@interface AppersonlabsCarbonModule ()
@property (nonatomic, retain) CBProxyGenerator * proxyGenerator;
@end

@implementation AppersonlabsCarbonModule

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

-(void)startup {
	[super startup];

    // execution context isn't set prior to call to startup
    self.proxyGenerator = [[CBProxyGenerator alloc] initWithExecutionContext:self.executionContext];

	NSLog(@"[INFO] %@ loaded",self);
}

-(void)shutdown:(id)sender {
	[super shutdown:sender];
}

#pragma mark Cleanup

-(void)dealloc {
	[super dealloc];
}

#pragma mark -

- (id)proxiesFromUIDefinition:(NSDictionary *)uiObject templateSetters:(NSMutableDictionary *)setters {
    NSMutableDictionary * cache = TiCreateNonRetainingDictionary();
    
    TiViewProxy * rootProxy = [self.proxyGenerator constructViewProxy:uiObject idCache:cache templateSetters:setters];
    if (!rootProxy) return nil;
    
    NSMutableDictionary * returnObject = TiCreateNonRetainingDictionary();
    
    [returnObject setObject:[rootProxy autorelease] forKey:@"root_element"];
    [returnObject setObject:[cache autorelease] forKey:@"proxy_cache"];
    
    return [returnObject autorelease];
}


#pragma mark Public APIs

- (id)createFromFile:(id)args {
    
    NSString * path = nil;
    
    ENSURE_ARG_AT_INDEX(path, args, 0, NSString)
    
    NSMutableDictionary * templateValues = nil;
    
    ENSURE_ARG_OR_NULL_AT_INDEX(templateValues, args, 1, NSDictionary)

    NSDictionary * uiObject = [self.proxyGenerator loadUIDefFromPath:path];
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
    
    NSDictionary * uiObject = nil;
    
    ENSURE_ARG_AT_INDEX(uiObject, args, 0, NSDictionary)
    
    NSDictionary * templateValues = nil;
    
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
    NSString * path = nil;
    ENSURE_ARG_AT_INDEX(path, args, 0, NSString)

    NSString * abspath = [[[NSBundle mainBundle] bundlePath] stringByAppendingPathComponent:path];
    
    if (![[NSFileManager defaultManager] fileExistsAtPath:abspath]) {
        NSLog(@"[WARN] TSS file '%@' not found", path);
        return;
    }
    
    NSLog(@"[INFO] Loading: %@", path);
    
    [self.proxyGenerator addStylesheet:[CBStylesheet stylesheetFromFile:abspath]];
}

@end
