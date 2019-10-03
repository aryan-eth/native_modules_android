package com.mapsmodule;

import android.annotation.SuppressLint;
import android.widget.Button;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

@SuppressLint("AppCompatCustomView")
public class BulbView extends Button {
    public Boolean isOn = false;
    public void setIsOn (Boolean initialBulbStatus){
        isOn = initialBulbStatus;
        updateButton();
    }
    public BulbView(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setOnClickListener(changeStatusListener);
        updateButton();
    }


    public BulbView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BulbView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private OnClickListener changeStatusListener = new OnClickListener() {
        public void onClick(View v) {
            isOn = !isOn;
            updateButton();
        }
    };

    private void updateButton() {
        if (isOn) {
            setBackgroundColor(Color.YELLOW);
//            setBackgroundColor
            setText("Switch OFF");
        } else {
            setBackgroundColor(Color.BLACK);
            setText("Switch ON");
        }
    }

}