//
//  CBProxyGenerator.h
//  carbon
//
//  Created by Paul Mietz Egli on 1/22/13.
//
//

#import "TiUITableViewProxy.h"
#import "CBStylesheet.h"

@protocol TiEvaluator;
@class TiViewProxy;

@interface TemplateSetter : NSObject
@property (nonatomic, strong) id target;
@property (nonatomic, strong) NSString * key;
+ (TemplateSetter *)setterForKey:(NSString *)key target:(id)target;
- (void)applyValue:(id)value;
@end


@interface CBProxyGenerator : NSObject
- (id)initWithExecutionContext:(id<TiEvaluator>)executionContext;
- (void)addStylesheet:(CBStylesheet *)stylesheet;
- (NSDictionary *)loadUIDefFromPath:(NSString *)path;
- (TiViewProxy *)constructViewProxy:(NSDictionary *)dict idCache:(NSMutableDictionary *)cache templateSetters:(NSMutableDictionary *)setters;
@end
