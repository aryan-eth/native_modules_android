package com.mapsmodule;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

public class DatabaseModule extends ReactContextBaseJavaModule {

    public DatabaseModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return null;
    }
    /**
     * Database relations
     * {
         * "AuditScheduleDetailID":5525,
         * "AuditAnswerId":33,
         * "LocalFindingID":1,
         * "LocalMediaID":1,
         * "ExtFiles":"jpg"
     * }
     * */

    // the method is void, and of the type react Method
    @ReactMethod
    public void insert(ReadableArray readableArray, String file){
//        DatabaseHandler db = new DatabaseHandler(getReactApplicationContext());
//        String a = "path to file";
//        for(int i=0 ; i<name.size(); i++){
//            //expected result
//            int audit  = 5525 //from AuditScheduleDetailID value
//            int answer = 33 // from AuditAnswerId value
//            int finding = 1 // from LocalFindingID value
//            int media = 1 // from LocalMediaID value
//            String exten = "jpg" // from ExtFiles value
//            db.addContact(new Contact(audit, answer, finding, media, exten));
//        }
    }
}
