package com.hud;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.avos.avoscloud.AVOSCloud;
import com.bigkoo.svprogresshud.SVProgressHUD;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.medicalreact.MainActivity;

/**
 * Created by zhuchao on 15/9/29.
 */
public class RCProgressHUD extends ReactContextBaseJavaModule {
    public Activity activity;

    public RCProgressHUD(ReactApplicationContext reactContext,Activity activity) {
        super(reactContext);
        this.activity = activity;
    }
    @Override
    public String getName() {
        return "RCProgressHUD";
    }
    @ReactMethod
    public void dismiss(){

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.dismiss(activity);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showWithMaskType(final String maskType){
        final SVProgressHUD.SVProgressHUDMaskType type = this.convMaskType(maskType);
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showWithMaskType(activity,type);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showSuccessWithStatus(final String status){
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showSuccessWithStatus(activity, status);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showSuccessWithStatusAndMaskType(final String status,String maskType){
        final SVProgressHUD.SVProgressHUDMaskType type = this.convMaskType(maskType);
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showSuccessWithStatus(activity, status,type);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showErrorWithStatus(final String status){
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showErrorWithStatus(activity, status);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showErrorWithStatusAndMaskType(final String status,String maskType){

        final SVProgressHUD.SVProgressHUDMaskType type = this.convMaskType(maskType);
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showErrorWithStatus(activity, status, type);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showInfoWithStatus(final String status){
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showInfoWithStatus(activity, status);
            }
        };
        this.runInMainThread(myRunnable);
    }
    @ReactMethod
    public void showInfoWithStatusAndMaskType(final String status,String maskType){
        final SVProgressHUD.SVProgressHUDMaskType type = this.convMaskType(maskType);
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                SVProgressHUD.showInfoWithStatus(activity, status, type);
            }
        };
        this.runInMainThread(myRunnable);
    }

    public SVProgressHUD.SVProgressHUDMaskType convMaskType(String maskType){
        SVProgressHUD.SVProgressHUDMaskType type = SVProgressHUD.SVProgressHUDMaskType.None;
        if(maskType.equals("Black")){
            type =  SVProgressHUD.SVProgressHUDMaskType.Black;
        }else if(maskType.equals("Clear")){
            type =  SVProgressHUD.SVProgressHUDMaskType.Clear;
        }else if(maskType.equals("Gradient")){
            type =  SVProgressHUD.SVProgressHUDMaskType.Gradient;
        }
        return type;
    }

     public void runInMainThread(Runnable myRunnable){
        Handler mainHandler = new Handler(Looper.getMainLooper());
        mainHandler.post(myRunnable);
    }
}
