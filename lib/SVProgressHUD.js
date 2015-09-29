/**
 * Created by zhuchao on 15/9/25.
 */
var React = require('react-native');
var Platform = require('Platform');
var RCProgressHUD = require('react-native').NativeModules.RCProgressHUD;

var SVProgressHUD = {
    MaskType:{
        None:"None",
        Black:"Black",
        Clear:"Clear",
        Gradient:"Gradient"
    },
    dismiss:()=>{
        RCProgressHUD.dismiss();
    },
    showWithMaskType:(maskType)=>{
        RCProgressHUD.showWithMaskType(maskType);
    },
    showSuccessWithStatus:(status)=>{
        RCProgressHUD.showSuccessWithStatus(status);
    },
    showSuccessWithStatusAndMaskType:(status,maskType)=>{
        RCProgressHUD.showSuccessWithStatusAndMaskType(status,maskType);
    },
    showErrorWithStatus:(status)=>{
        RCProgressHUD.showErrorWithStatus(status);
    },
    showErrorWithStatusAndMaskType:(status,maskType)=>{
        RCProgressHUD.showErrorWithStatusAndMaskType(status,maskType);
    },
    showInfoWithStatus:(status)=>{
        RCProgressHUD.showInfoWithStatus(status);
    },
    showInfoWithStatusAndMaskType:(status,maskType)=>{
        RCProgressHUD.showInfoWithStatusAndMaskType(status,maskType);
    }
};

module.exports = SVProgressHUD;