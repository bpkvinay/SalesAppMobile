package com.appium.Runner;


import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.appium.appiumUtils.AppiumServiceManager;
import com.appium.appiumUtils.DriverManagerCapabilities;
import com.appium.pageobjectrepo.LoginPage;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
           features = "src/test/java/com/appium/feature",
           glue = {"com.appium.stepdefinations"},
        //tags="login",
           monochrome=true,
       plugin= {   "pretty",


 		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
   		}


)


public class AppiumJunitTestRunner extends DriverManagerCapabilities{

	@BeforeClass
	public static void setup() throws InterruptedException, IOException
	{
	    //AppiumServiceManager.startserver();
	    devicemanager();


     }




	@AfterClass
	public static void Endserver()
	{
	  new LoginPage(driver).taponlogoutbutton();
     // AppiumServiceManager.stopserver();
	}




}
