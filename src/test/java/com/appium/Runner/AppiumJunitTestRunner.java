package com.appium.Runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.appium.appiumUtils.AppiumServiceManager;
import com.appium.appiumUtils.AppiumUtilsActions;
import com.appium.appiumUtils.DriverManagerCapabilities;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/appium/feature", glue = { "com.appium.stepdefinations" },
		// tags="@postivefreshlead",
		monochrome = true, plugin = { "pretty",
                "html:target/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/Failed_Scenarios.txt" }

)

public class AppiumJunitTestRunner extends DriverManagerCapabilities {

	static DriverManagerCapabilities drivermangercapa = new DriverManagerCapabilities();

	@BeforeClass
	public static void setup() throws InterruptedException, IOException {
		AppiumServiceManager.startserver();
		drivermangercapa.devicemanager();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		
	}

	@AfterClass
	public static void Endserver() {

		AppiumServiceManager.stopserver();
	}

}
