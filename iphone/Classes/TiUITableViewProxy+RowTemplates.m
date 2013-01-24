//
//  TiUITableViewProxy+RowTemplates.m
//  carbon
//
//  Created by Paul Mietz Egli on 1/20/13.
//
//

#define USE_TI_UITABLEVIEW

#import "TiUITableViewProxy+RowTemplates.h"
#import <objc/runtime.h>
#import "CBProxyGenerator.h"

static char ROW_TEMPLATE_KEY;
static char PARSED_ROW_TEMPLATES_KEY;

@implementation TiUITableViewProxy (RowTemplates)

/*
 http://codeshaker.blogspot.com/2012/01/calling-original-overridden-method-from.html
 
 replacing -(void)setData:(id)args withObject:(id)properties; with our own implementation
 and calling the original method.
 */

+ (void)load {
    method_exchangeImplementations(class_getInstanceMethod(self, @selector(setData:withObject:)), class_getInstanceMethod(self, @selector(setTemplateData:withObject:)));
}

- (void)setRowTemplate:(NSDictionary *)value {
    objc_setAssociatedObject(self, &ROW_TEMPLATE_KEY, value, OBJC_ASSOCIATION_RETAIN);
}

- (NSDictionary *)rowTemplate {
    NSDictionary * result = (NSDictionary *)objc_getAssociatedObject(self, &ROW_TEMPLATE_KEY);
    if (!result) {
        result = [NSDictionary dictionary];
        objc_setAssociatedObject(self, &ROW_TEMPLATE_KEY, result, OBJC_ASSOCIATION_RETAIN);
    }
    return result;
}

- (void)setParsedRowTemplates:(NSDictionary *)value {
    objc_setAssociatedObject(self, &PARSED_ROW_TEMPLATES_KEY, value, OBJC_ASSOCIATION_RETAIN);
}

- (NSDictionary *)parsedRowTemplates {
    return (NSDictionary *)objc_getAssociatedObject(self, &PARSED_ROW_TEMPLATES_KEY);
}


#pragma mark TiUITableViewProxy methods

/**
 If row templates have been defined on this table view, the "rows" parameter must be an array
 of dictionaries which contain template substitution data.  If no row templates have been defined,
 then this method uses the default behavior of TableView.setData().
 */
-(void)setTemplateData:(id)data withObject:(id)object {
    // rows is an array of dictionaries
    if (self.parsedRowTemplates) {
        CBProxyGenerator * proxyGenerator = [[CBProxyGenerator alloc] initWithExecutionContext:self.executionContext];
        NSMutableArray * tableViewRows = [NSMutableArray arrayWithCapacity:[data count]];
        for (NSDictionary * row in data) {
            NSString * className = [row objectForKey:@"className"];
            NSDictionary * uidef = [self.parsedRowTemplates objectForKey:className];
            if (!uidef) {
                NSLog(@"[WARNING] TableView row template class \"%@\" not found", className);
                continue;
            }
            
            NSMutableDictionary * templateSetters = [NSMutableDictionary dictionary];
            TiViewProxy * proxy = [proxyGenerator constructViewProxy:uidef idCache:nil templateSetters:templateSetters];

            for (NSString * key in row) {
                TemplateSetter * setter = [templateSetters objectForKey:key];
                [setter applyValue:[row objectForKey:key]];
            }
            
            [tableViewRows addObject:proxy];
        }
        [self setTemplateData:tableViewRows withObject:object];
    }
    else {
        NSLog(@"default call to setData");
        [self setTemplateData:data withObject:object];
    }
}

@end
