package com.mapsmodule;

import android.graphics.Color;
import android.view.View;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

// I think this is the UI thing for android
// we have to implement simple view manager with the view

public class LayoutManager extends SimpleViewManager<View> {

    public static String name = "";
    private ThemedReactContext themedReactContext;
    private View view;
    @NonNull
    @Override
    public String getName() {
        return null;
    }

    // this is the game changer here, we have to change the view here
    // we set the new view here, change the context and do whatever we want, with the new view
    // simple example would be changing the background color for the view
    @NonNull
    @Override
    protected View createViewInstance(@NonNull ThemedReactContext reactContext) {
        themedReactContext = reactContext;
        view = new View(reactContext);
        // what's this? - research more
        // view.setAccessibilityDelegate(new View.AccessibilityDelegate());
        view.setBackgroundColor(Color.BLUE);

        return view;
    }

    // we make this a react prop method
    // we add a name parameter to it

    @ReactProp(name = "exampleProps")
    private void setExample(View view, String prop){
        
    }
}
