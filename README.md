## Android native modules

## Links
* https://hackernoon.com/first-experiences-with-react-native-bridging-an-android-native-module-for-app-authentication-501fec247b2b
* https://www.fullstackreact.com/react-native/p/native-modules/
* https://facebook.github.io/react-native/docs/0.60/native-modules-android

## Notes
* Index.android.js - file in the main system
* Both navigate to App folder which is there in the root directory
* App.js has a function reload() - which reloads the function using the * NativeModules.DevMenu.reload()
* There is an ArcGIS android.js file with some features related to the app like zoom out, in
* Coming to the android section,we don’t make any layouts in the android section, nothing in the layouts field
* We only make modules and packages and we have mainApplication.java and mainActivity.java - we’ll be using mainActivity.java in this case
* ArcGISMapModule extends ReactContextBaseJavaModule 
* We have the getName - override and setLevel, setCenter methods as @ReactMethod
* We have a manager in this case, I don’t know why though
* ArcGISMapPackage implements ReactPackage 
* We have createNativeModules, createJSModules, createViewManagers as the override methods and we have to write code in these - not all but the createNativeModules - we return the list of modules
* We can return empty lists at other places
* Main Activity has the main method to connect the packages and the model
* Making a pie chart app with native code
* We define the props in the app.js so that both the native sides use that

## Starting
* Go in the android directory of your application
* Create a new java class - device module.java
* The custom native module class should extend ReactContextBaseJavaModule. After this, we will have to implement the getName() method.
* We have to return all the packages we make as  a list in the mainApplication.java
* Every package implements the React Package which has some methods to implement - like create Native Modules and create View Managers
* NativeModules.Device.getDeviceName((err, name) => console.log(err, name)); - this is what comes in the app/index.js to initialize the react modules which were created
* NativeModules.Bulb.on or off - this is the call we’re concerned with and we can interact with the modules in this way
* Package just adds the module and then mainApplication adds the package finally
* Trying something with ArcGIS - the code has to go in ArcGIS module - then package gets it and then finally the mainApplication
* There is kotlin support - https://proandroiddev.com/react-native-bridge-with-kotlin-b2afde2f70b