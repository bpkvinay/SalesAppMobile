package com.appium.stepdefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends DriverManagerCapabilities {

	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		
	
		if(scenario.isFailed()) {
			
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent,"image/png", "image");
		}}
}
