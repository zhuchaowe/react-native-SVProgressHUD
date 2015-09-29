package com.hud;

import android.app.Activity;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.hud.RCProgressHUD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zhuchao on 15/9/26.
 */
public class RNProgressHUDPackage implements ReactPackage {

    public Activity activity;

    public RNProgressHUDPackage(Activity activity) {
        this.activity = activity;
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new RCProgressHUD(reactContext,this.activity));
        return modules;
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}