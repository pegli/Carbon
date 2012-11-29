//
//  CBStylesheet.m
//  carbon
//
//  Created by Paul Mietz Egli on 11/26/12.
//
//

#import "CBStylesheet.h"

extern NSMutableArray * stylesheet;
extern FILE * yyin;
extern int yyparse();

typedef enum {
    kSelectorTypeID,
    kSelectorTypeClass,
    kSelectorTypeType
} TssSelectorType;

typedef struct {
    TssSelectorType type;
    NSString * name;
    NSArray * predicates;
} TssSelector;

@interface CBStylesheet (PrivateMethods)
- (TssSelector)parseSelector:(NSString *)str;
@end

@implementation CBStylesheet

#pragma mark -
#pragma mark Lifecycle

+ (CBStylesheet *)stylesheetFromFile:(NSString *)path {
    @synchronized(stylesheet) {
        yyin = fopen([path cStringUsingEncoding:NSUTF8StringEncoding], "r");
        if (yyin <= 0) {
            NSLog(@"[ERROR] could not open stylesheet %@", path);
            return nil;
        }
        do {
            yyparse();
        } while (!feof(yyin));
        fclose(yyin);
        
        return stylesheet ? [[[CBStylesheet alloc] initWithArray:stylesheet] autorelease] : nil;
    }
}

- (CBStylesheet *)initWithArray:(NSArray *)arr {
    if (self = [super init]) {
        NSError * error;
        selectorRegex = [NSRegularExpression regularExpressionWithPattern:@"([\\.#])?([^\\[]+)(\\[[^\\]]+\\])?" options:0 error:&error];
        if (!selectorRegex || error) {
            NSLog(@"[ERROR] regex compilation error: %@", [error description]);
        }
        
        styles_by_id = [[NSMutableDictionary dictionary] retain];
        styles_by_class = [[NSMutableDictionary dictionary] retain];
        styles_by_type = [[NSMutableDictionary dictionary] retain];
        
        predicateSeparators = [NSCharacterSet characterSetWithCharactersInString:@" ,"];
        
        // array of dicts with single key == selector
        for (NSDictionary * rule in arr) {
            NSString * key = [[rule keyEnumerator] nextObject];
            NSMutableDictionary * style = [rule objectForKey:key];
            TssSelector selector = [self parseSelector:key];

            NSMutableDictionary * dest = styles_by_type; // default
            switch (selector.type) {
                case kSelectorTypeID:
                    dest = styles_by_id;
                    break;
                case kSelectorTypeClass:
                    dest = styles_by_class;
                    break;
                default:
                    ;
            }
            
            if (![selector.predicates containsObject:@"platform=android"]) {
                // TODO add formfactor predicate
                
                // merge into existing styles (the "cascading" part)
                NSMutableDictionary * existing = [dest objectForKey:selector.name];
                if (existing) {
                    [existing addEntriesFromDictionary:style];
                    style = existing;
                }
                [dest setObject:style forKey:selector.name];
            }
            
        }
    }
    return self;
}

- (void)dealloc {
    [styles_by_id release];
    [styles_by_class release];
    [styles_by_type release];
    [predicateSeparators release];
    [super dealloc];
}

#pragma mark Internals

- (TssSelector)parseSelector:(NSString *)str {
    TssSelector result = {0, nil, nil};

    NSArray * matches = [selectorRegex matchesInString:str options:0 range:NSMakeRange(0, [str length])];
    NSTextCheckingResult * match = [matches objectAtIndex:0]; // should only be one match
    
    NSRange dothashRange = [match rangeAtIndex:1];
    NSRange nameRange = [match rangeAtIndex:2];
    NSRange predicateRange = [match rangeAtIndex:3];
    
    if (dothashRange.location == NSNotFound) {
        result.type = kSelectorTypeType;
    }
    else if ([str characterAtIndex:dothashRange.location] == '.'){
        result.type = kSelectorTypeClass;
    }
    else if ([str characterAtIndex:dothashRange.location] == '#'){
        result.type = kSelectorTypeID;
    }
    
    if (nameRange.location != NSNotFound) {
        result.name = [str substringWithRange:nameRange];
    }
    
    // predicates
    if (predicateRange.location != NSNotFound) {
        NSString * preds = [str substringWithRange:predicateRange];

        // strip enclosing brackets
        preds = [preds substringWithRange:NSMakeRange(1, [preds length]-2)];
        NSArray * nvpairs = [preds componentsSeparatedByCharactersInSet:predicateSeparators];

        // TODO strip spaces?
        result.predicates = nvpairs;
    }
    
    return result;
}

#pragma mark -
#pragma mark Public API

- (void)applyStylesForKey:(NSString *)proxyName toParams:(NSMutableDictionary *)params {
    if (!params) return;
    
    NSString * proxyId = [params valueForKey:@"id"];
    NSString * proxyClass = [params valueForKey:@"class"];

    NSMutableDictionary * result = [NSMutableDictionary dictionary];

    // order of application is: type, class, ID
    [result addEntriesFromDictionary:[styles_by_type objectForKey:proxyName]];
    [result addEntriesFromDictionary:[styles_by_class objectForKey:proxyClass]];
    [result addEntriesFromDictionary:[styles_by_id objectForKey:proxyId]];
    
    // initialization parameters always override styles
    [result addEntriesFromDictionary:params];
    
    [params removeAllObjects];
    [params addEntriesFromDictionary:result];    
}

@end
