//
//  TiViewProxy+ElementAccess.h
//  uibuilder
//
//  Created by Paul Mietz Egli on 9/26/12.
//
//

#import "TiViewProxy.h"

@interface TiViewProxy (ElementAccess)
@property (nonatomic, retain) NSDictionary * childrenByID;
- (id)elementWithID:(id)args;
@end
