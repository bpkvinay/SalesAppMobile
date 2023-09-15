package com.appium.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public AndroidDriver driver;
	@AndroidFindBy(accessibility = "home-screen-fresh-lead-button")
	private WebElement homescreenfreshleadbutton;
	
	@AndroidFindBy(accessibility = "home-screen-add-button")
	private WebElement homescreenadditionbutton;
	
	public HomePage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	 public WebElement Clickadditionbutton() {
		 return homescreenadditionbutton;
	 }
	 
	 public WebElement ClickFreshleadbuttonfromhomescreenpage() {
		 return homescreenfreshleadbutton;
	 }
}
