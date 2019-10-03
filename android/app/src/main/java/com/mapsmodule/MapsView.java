package com.mapsmodule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.facebook.react.bridge.Arguments;
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
    //
    private void addButton(){

    }
}
