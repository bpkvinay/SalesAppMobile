package com.appium.appiumUtils;

import java.io.IOException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;


public class AppiumServiceManager {
	//public static AppiumDriverLocalService Service;
	public static AppiumDriverLocalService service ;

	public static void startserver() throws InterruptedException, IOException

	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("noReset", "false");

		//Build the Appium service
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		builder.withIPAddress("127.0.0.1");
		builder.usingPort(4723);
		builder.withCapabilities(cap);
		builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
		builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");

		//Start the server with the builder
		service= AppiumDriverLocalService.buildService(builder);
		service.start();
		// Code that involves file operations


//		String appiumJsPath=AppiumConstants.appiumLibPath;
//
//        System.out.println("Appium.js Path: " + appiumJsPath);
//
//        Service = new AppiumServiceBuilder()
//                .withAppiumJS(new File(appiumJsPath))
//                .withIPAddress("127.0.0.1")
//                .usingPort(4723)
//                .build();
//
//        System.out.println("Starting Appium server...");
//        Service.start();
//        System.out.println("Appium server started successfully.");
    }

//		Service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\vinay.gaonkar\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//				.withIPAddress("127.0.0.1")
//		.usingPort(4723).build();
//		Service.start();


	public static void stopserver() {

		service.stop();
	}
}