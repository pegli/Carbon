//
//  TiViewProxy+ElementAccess.m
//  uibuilder
//
//  Created by Paul Mietz Egli on 9/26/12.
//  Adding properties to a category based on http://www.wē-mīer.com/?p=175
//

#import <objc/runtime.h>
#import "TiViewProxy+ElementAccess.h"

static char CHILDREN_BY_ID_KEY;

@implementation TiViewProxy (ElementAccess)

@dynamic childrenByID;

- (void)setChildrenByID:(NSDictionary *)dict {
    objc_setAssociatedObject(self, &CHILDREN_BY_ID_KEY, dict, OBJC_ASSOCIATION_RETAIN);
}

- (NSDictionary *)childrenByID {
    NSDictionary * result = (NSDictionary *)objc_getAssociatedObject(self, &CHILDREN_BY_ID_KEY);
    if (!result) {
        result = [NSDictionary dictionary];
        objc_setAssociatedObject(self, &CHILDREN_BY_ID_KEY, result, OBJC_ASSOCIATION_RETAIN);
    }
    return result;
}

#pragma mark Public API

- (id)elementWithID:(id)args {
    
    NSString * elid;
    ENSURE_ARG_AT_INDEX(elid, args, 0, NSString)
    
    return [self.childrenByID objectForKey:elid];
}

@end
