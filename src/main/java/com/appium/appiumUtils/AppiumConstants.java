package com.appium.appiumUtils;

import java.io.File;

public class AppiumConstants 
{


	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String RESOURCES_PATH = "src/test/resources";
	public static final String userHome = System.getProperty("user.home");
	public static final String appiumLibPath = userHome+"/AppData/Roaming/npm/node_modules/appium/build/lib/main.js";
    public static final String ANDROID_APK_PATH =
    		

		   PROJECT_PATH + File.separator + RESOURCES_PATH + File.separator + "app" + File.separator +
	     "ng_customer_app_2.0.0-universal-releasestaging (1).apk";
    public static final String AppiumLogFilepath=userHome+File.separator+"appium.log";
    public static final int APPIUM_SERVER_PORT = 4723;
    public static final String APPIUM_SERVER_HOST = "127.0.0.1";
    public static final String PROPERTYPATH=PROJECT_PATH + File.separator + RESOURCES_PATH + File.separator+"Config.properties";
}
