//
//  RNProgressHUD.m
//  medicalReact
//
//  Created by zhuchao on 15/9/29.
//  Copyright © 2015年 Facebook. All rights reserved.
//

#import "RCProgressHUD.h"

@implementation RCProgressHUD
RCT_EXPORT_MODULE();
RCT_EXPORT_METHOD(showWithMaskType:(NSString *)maskType){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showWithMaskType:[self convMaskType:maskType]];
    });
}
RCT_EXPORT_METHOD(showSuccessWithStatus:(NSString *)status){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showSuccessWithStatus:status];
    });
}

RCT_EXPORT_METHOD(showSuccessWithStatusAndMaskType:(NSString *)status type:(NSString *)maskType){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showSuccessWithStatus:status maskType:[self convMaskType:maskType]];
    });
}

RCT_EXPORT_METHOD(showErrorWithStatus:(NSString *)status){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showErrorWithStatus:status];
    });
}

RCT_EXPORT_METHOD(showErrorWithStatusAndMaskType:(NSString *)status type:(NSString *)maskType){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showErrorWithStatus:status maskType:[self convMaskType:maskType]];
    });
}

RCT_EXPORT_METHOD(showInfoWithStatus:(NSString *)status){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showInfoWithStatus:status];
    });
}

RCT_EXPORT_METHOD(showInfoWithStatusAndMaskType:(NSString *)status type:(NSString *)maskType){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD showInfoWithStatus:status maskType:[self convMaskType:maskType]];
    });
}

RCT_EXPORT_METHOD(dismiss){
    dispatch_async(dispatch_get_main_queue(), ^{
        [SVProgressHUD dismiss];
    });
}

-(SVProgressHUDMaskType)convMaskType:(NSString *)maskType{
    SVProgressHUDMaskType type = SVProgressHUDMaskTypeNone;
    if ([maskType isEqualToString:@"Black"]){
        type = SVProgressHUDMaskTypeBlack;
    }else if ([maskType isEqualToString:@"Clear"]){
        type = SVProgressHUDMaskTypeClear;
    }else if ([maskType isEqualToString:@"Gradient"]){
        type = SVProgressHUDMaskTypeGradient;
    }
    return type;
}
@end
