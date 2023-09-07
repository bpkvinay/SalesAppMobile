package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	 public AndroidDriver driver;

	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"More, tab, 4 of 4\"]/android.widget.TextView")
	  private WebElement morebtn;

	  public HomePage(AndroidDriver driver) {
		  {
				this.driver=driver;
				PageFactory.initElements(new AppiumFieldDecorator(driver),this);

			   }
	  }

	 public WebElement taponmorebutton()
	 {
		 return morebtn;
     }

}
