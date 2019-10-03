package com.mapsmodule;

import android.content.Context;
import android.telecom.Call;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.PixelUtil;

import java.util.HashMap;
import java.util.Map;

public class MapsModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactApplicationContext;
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


    // we add things to our map which eventually gets returned by this method
    // this is called in the js file and used for promises, maybe??
    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> map = new HashMap<>();
        map.put("","");
        return map;
    }

    @ReactMethod
    private void exampleMethod(){
        final WritableMap map = Arguments.createMap();
        map.putString("greetings", "Android command - coming from android");
        emitDeviceEvent("Example event", map);
    }

    private static void  emitDeviceEvent(String event, @Nullable WritableMap map) {
        reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit(event, map);
        // we use the .emit function
        // getJSModule
        // RCT Device Event Emitter
    }
}
