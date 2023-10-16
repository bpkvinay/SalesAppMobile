package com.appium.appiumUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.CapabilityType;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverManagerCapabilities {

//  public AndroidDriver driver=getWebDriver();
//    private static ThreadLocal<AndroidDriver>threadDriver=new ThreadLocal<AndroidDriver>();
	public static AndroidDriver driver;
	@SuppressWarnings("deprecation")
	public void devicemanager() throws IOException
	{
		if(readprop("platformname").equalsIgnoreCase("android"))
		{
	 UiAutomator2Options androi= new UiAutomator2Options();
	 androi.setCapability(CapabilityType.PLATFORM_NAME, readprop("platformname"));
	//androi.setCapability(MobileCapabilityType.UDID, readprop("udid"));
	//androi.setCapability(MobileCapabilityType.DEVICE_NAME, readprop("DeviceName"));
	 driver= new AndroidDriver(new URL(readprop("URL")),androi);
	 Activity activity = new Activity(readprop("AppPackage"),readprop("AppActivity"));
	 driver.startActivity(activity);
	

		}
		else if(readprop("platformname").equalsIgnoreCase("ios")) {
			XCUITestOptions iosd = new XCUITestOptions();
		//	Ios.setCapability(null, null);
//			need to implement ios device

		}


	}





	public static String readprop(String key) throws IOException {

		try {

		Properties properties= new Properties();
		FileInputStream file = new FileInputStream(AppiumConstants.PROPERTYPATH);
		properties.load(file);
		return properties.getProperty(key);

	}
		catch(Exception e){
			return null;
		}



	}


//	 public  static AndroidDriver getWebDriver()
//	    {
//	        return threadDriver.get();
//	    }
}
