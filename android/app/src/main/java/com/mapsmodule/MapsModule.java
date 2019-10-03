package com.mapsmodule;

import android.content.Context;
import android.telecom.Call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;

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

    @ReactMethod
    public void measureLayout(int tag, int ancestorTag, Callback errorCallback, Callback successCallback){
//        try {
//            measureLayout(tag, ancestorTag, mMeasureBuffer);
//            float relativeX = PixelUtil.toDIPFromPixel(mMeasureBuffer[0]);
//            float relativeY = PixelUtil.toDIPFromPixel(mMeasureBuffer[1]);
//            float width = PixelUtil.toDIPFromPixel(mMeasureBuffer[2]);
//            float height = PixelUtil.toDIPFromPixel(mMeasureBuffer[3]);
//            successCallback.invoke(relativeX, relativeY, width, height);
//        } catch (IllegalViewOperationException e) {
//            errorCallback.invoke(e.getMessage());
//        }
    }

    @ReactMethod
    private void sendEvents(ReactContext context, String eventName, @Nullable WritableMap map){
//        context.addActivityEventListener();
//        context.addWindowFocusChangeListener();
//        context.addLifecycleEventListener();
    }

}
