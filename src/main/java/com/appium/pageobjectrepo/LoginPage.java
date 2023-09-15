package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage  {
	
	public AndroidDriver driver;
	@AndroidFindBy(accessibility = "splash-screen-login-button")
	private WebElement loginbtn;
	
	@AndroidFindBy(accessibility = "login-screen-employee-id-input")
	private WebElement employeeidtextfield;
	
	@AndroidFindBy(accessibility = "login-screen-send-otp-button")
	private WebElement sendotpbtn;
	
	@AndroidFindBy(accessibility = "login-screen-otp-input")
	private WebElement otpTextFeild;
	
	@AndroidFindBy(accessibility = "login-screen-verify-otp-button")
	private WebElement verifybutton;
	
	public  LoginPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	
	public WebElement LoginButton() 
	{
		return loginbtn;
	}
	public WebElement EmployeedIDTextFeild() {
		return employeeidtextfield;
	}
	public WebElement SendOTPButton() {
		return sendotpbtn;
	}
	public WebElement OTPTextFeild() {
		return otpTextFeild;
	}
	public WebElement VerifyButton() {
		return verifybutton;
	}
	

}
