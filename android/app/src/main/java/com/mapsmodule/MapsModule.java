package com.mapsmodule;

import android.content.Context;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class MapsModule extends ReactContextBaseJavaModule {

    ReactApplicationContext rcontext;
    public MapsModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
        this.rcontext = reactContext;
    }

//    public MapsModule(Context context){
//        super(context);
//        this.setTextColor();
//    }

    private void setTextColor() {
    }

    @NonNull
    @Override
    public String getName() {
        return "Maps Module";
    }

    //Each method that will be visible in the JavaScript code should have a @ReactMethod annotation.

    @ReactMethod
    public void keepScreenAwake(){
        getCurrentActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            }
        });
    }

    @ReactMethod
    public void removeScreenAwake(){
        getCurrentActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            }
        });
    }

    @ReactMethod
    public void changeBackgroundColor(){

    }

}
