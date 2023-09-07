package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MorePage extends DriverManagerCapabilities {

	public AndroidDriver driver;



	@AndroidFindBy(accessibility = "more screen text queries title")
	private WebElement queriessection;

	@AndroidFindBy(accessibility = "queries screen text business details titlevalue")
	private WebElement titlesdropdown;

	@AndroidFindBy(xpath = "//*[@text='1003138']")
	private WebElement textbtn;


	@AndroidFindBy(accessibility ="queries screen button raise a query")
	private WebElement Raiseaquerybtn;






	public MorePage(AndroidDriver driver) {
		 this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	 }

	public WebElement clickqueries() {
		return queriessection;
	}

	public WebElement tabapplicationIDDropdown() {
		return titlesdropdown;
	}
    public WebElement textbtnclick() {
	return textbtn;
    }


	public WebElement taponraiseaquerybutton() {
		return Raiseaquerybtn;
	}




}
