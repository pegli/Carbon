//
//  CBStylesheet.h
//  carbon
//
//  Created by Paul Mietz Egli on 11/26/12.
//
//

#import <Foundation/Foundation.h>

@interface CBStylesheet : NSObject {
    NSRegularExpression * selectorRegex;
    
    NSMutableDictionary * styles_by_id;
    NSMutableDictionary * styles_by_class;
    NSMutableDictionary * styles_by_type;
    
    NSCharacterSet * predicateSeparators;
}
+ (CBStylesheet *)stylesheetFromFile:(NSString *)path;
- (void)applyStylesForKey:(NSString *)key toParams:(NSMutableDictionary *)params;
@end
