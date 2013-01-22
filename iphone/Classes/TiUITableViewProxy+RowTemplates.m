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

static char ROW_TEMPLATE_KEY;
static char TEMPLATE_SETTERS_KEY;

@implementation TiUITableViewProxy (RowTemplates)

/*
 http://codeshaker.blogspot.com/2012/01/calling-original-overridden-method-from.html
 
 replacing -(void)setData:(id)args withObject:(id)properties; with our own implementation
 and calling the original method.
 */

+ (void)load {
    method_exchangeImplementations(class_getInstanceMethod(self, @selector(setData:withObject:)), class_getInstanceMethod(self, @selector(setTemplateData:withObject:)));
}

- (void)setRowTemplate:(NSDictionary *)rowTemplate {
    objc_setAssociatedObject(self, &ROW_TEMPLATE_KEY, rowTemplate, OBJC_ASSOCIATION_RETAIN);
}

- (NSDictionary *)rowTemplate {
    NSDictionary * result = (NSDictionary *)objc_getAssociatedObject(self, &ROW_TEMPLATE_KEY);
    if (!result) {
        result = [NSDictionary dictionary];
        objc_setAssociatedObject(self, &ROW_TEMPLATE_KEY, result, OBJC_ASSOCIATION_RETAIN);
    }
    return result;
}

- (void)setTemplateSetters:(NSDictionary *)value {
    objc_setAssociatedObject(self, &TEMPLATE_SETTERS_KEY, value, OBJC_ASSOCIATION_RETAIN);
}

- (NSDictionary *)templateSetters {
    return (NSDictionary *)objc_getAssociatedObject(self, &TEMPLATE_SETTERS_KEY);
}


#pragma mark TiUITableViewProxy methods

-(void)setTemplateData:(id)args withObject:(id)rows {
    // rows is an array of dictionaries
    if (self.templateSetters) {
        NSLog(@"TODO substitute values into proxies");
    }
    [self setTemplateData:args withObject:rows];
}

@end
