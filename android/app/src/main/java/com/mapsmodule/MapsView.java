package com.mapsmodule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;

@SuppressLint("AppCompatCustomView")
public class MapsView extends Button {

    public Boolean isOn = false;
    public ReadableArray array;
    public void setIsOn (Boolean initialBulbStatus){
        isOn = initialBulbStatus;
        updateButton();
    }
    public MapsView(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setOnClickListener(changeStatusListener);
        updateButton();
    }


    public MapsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MapsView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void changeStatus(){
        WritableMap events = Arguments.createMap();
//        events.putArray();
        events.putBoolean("on", isOn);
    }

    private OnClickListener changeStatusListener = new OnClickListener() {
        public void onClick(View v) {
            isOn = !isOn;
            updateButton();
        }
    };

    private void updateButton() {
        if (isOn){
            setBackgroundColor(Color.YELLOW);
            setText("Switch OFF");
        } else {
            setBackgroundColor(Color.BLACK);
            setText("Switch ON");
        }
    }

    // adds a button to the screen
    // dynamic addition to the UI screen android
    @ReactMethod
    private void addButton(){
        Button new_button = new Button(getContext());
        // we can only add in a layout or something
        // how do we add it to no layout??
        // we were changing the background, but what if we want to add components

        // LinearLayout ll = (LinearLayout)findViewById(R.id.buttonlayout);
        // LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        // ll.addView(myButton, lp);

    }

    @ReactMethod
    private void Layout(){
        LinearLayout layout = new LinearLayout(getContext());
        LinearLayout.LayoutParams full_layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

//        layout.setMinimumHeight(200);
//        layout.setMinimumWidth();
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams text_layout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 40);
        textView.setLayoutParams(text_layout);
        textView.setText("Sample button");
        layout.addView(new TextView(getContext()));
    }


    // method to show toast from the android code
    @ReactMethod
    private void toastShow(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG);
    }
}
