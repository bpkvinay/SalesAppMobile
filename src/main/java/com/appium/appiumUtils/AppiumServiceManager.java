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
			.withIPAddress("127.0.0.1")
		.usingPort(4723)
		.withLogFile(new File(AppiumConstants.AppiumLogFilepath))
				.build();
	Service.start();
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	
	
	public static void stopserver() 
	{
	Service.stop();
	}
}