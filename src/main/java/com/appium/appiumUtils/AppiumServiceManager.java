package com.appium.appiumUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;




public class AppiumServiceManager {
	public static AppiumDriverLocalService Service;
	//public static AndroidDriver driver;
    
	public static void startserver() throws InterruptedException, IOException

	{
	 Service= new AppiumServiceBuilder().withAppiumJS(new File(AppiumConstants.appiumLibPath))
			.withIPAddress(AppiumConstants.APPIUM_SERVER_HOST)
		.usingPort(AppiumConstants.APPIUM_SERVER_PORT)
		.withLogFile(new File(AppiumConstants.AppiumLogFilepath))
				.build();
	Service.start();
	
	
	}

	
	
	public static void stopserver() 
	{
	Service.stop();
	}
}