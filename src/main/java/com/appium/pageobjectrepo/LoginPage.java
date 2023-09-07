package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.AppiumUtilsActions;
import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public  class LoginPage extends DriverManagerCapabilities {

	  public AndroidDriver driver;

	  AppiumUtilsActions Ac= new AppiumUtilsActions();
	  HomePage hompage= new HomePage(driver);

	  @AndroidFindBy(accessibility= "login screen input mobile number")
	  private WebElement txtFieldmobilenumber;

	  @AndroidFindBy(accessibility ="login screen button login with password")
	  private  WebElement btnpassword;

	  @AndroidFindBy(accessibility = "enter password screen input password")
	  private WebElement paswwordTextfeild;

	  @AndroidFindBy(accessibility = "enter password screen button login")
	  private WebElement btnLogin;



	  @AndroidFindBy(accessibility="more screen text consumer awareness")
	  private WebElement textfieldcunsumerawareness;

	  @AndroidFindBy(accessibility = "more screen text logout title")
	  private WebElement logoutBtn;

	  @AndroidFindBy(xpath = "//*[@text='Yes']")
	  private WebElement yesbuton;

       public LoginPage(AndroidDriver driver)
       {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);

	   }

	 public WebElement entermobilenumber()
	 {
		 return txtFieldmobilenumber;

     }


	 public WebElement taponpasswordbutn() {
		return  btnpassword;
	 }

	 public WebElement clickyesbutonfrompopup() {
		return yesbuton;
	 }

	 public WebElement enterpassword()
	 {
		return paswwordTextfeild;
	 }

	 public WebElement TaponLoginBtn()
	 {
		return  btnLogin;
	 }



	 public void taponlogoutbutton() {
		 new HomePage(driver).taponmorebutton().click();
		 Ac.mousescroll(textfieldcunsumerawareness);
		 clicklogout();
		 clickyesbutonfrompopup().click();
	 }


	 public void clicklogout()
	 {
		 logoutBtn.click();
	 }
}
