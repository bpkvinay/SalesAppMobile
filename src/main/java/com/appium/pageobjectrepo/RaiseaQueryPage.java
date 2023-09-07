package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RaiseaQueryPage  extends DriverManagerCapabilities{

	 public AndroidDriver driver;


	@AndroidFindBy(accessibility = "raise a query screen clickable business details titlevalue")
	private WebElement Raiseaquerybuttonappiddropdown;

	@AndroidFindBy(accessibility = "raise a query screen clickable topicvalue")
	private WebElement ChossetopicDropdown;

	@AndroidFindBy(accessibility = "raise a query screen clickable selected topicvalue")
	private WebElement ChooseSubTopicDropdown;

	@AndroidFindBy(xpath="//*[@text='Settlement']")
	private WebElement settlment;

	@AndroidFindBy(accessibility ="raise a query screen input description")
	private WebElement inputdescription;

	@AndroidFindBy(accessibility = "raise a query screen button submit query")
	private WebElement submitbtn;

	public RaiseaQueryPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	public WebElement taponApplicationIDDropdown() {
		return Raiseaquerybuttonappiddropdown;
	}

	public WebElement choosetopicdropdown() {
		return ChossetopicDropdown;
	}

	public WebElement choosesubtopicdropdown() {
		return ChooseSubTopicDropdown;
	}

	public WebElement choosesettlment() {
		return settlment;

	}
	public WebElement enterdescription() {
		return inputdescription;
	}

	public WebElement tapsubmitbtn() {
		return submitbtn;
	}

}
