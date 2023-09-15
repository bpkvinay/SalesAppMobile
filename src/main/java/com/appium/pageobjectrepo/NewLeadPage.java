package com.appium.pageobjectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.appium.appiumUtils.DriverManagerCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;

public class NewLeadPage {
	 public AndroidDriver driver;
	 public NewLeadPage(AndroidDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	 }

	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"new-lead-lead-source-dropdown\"]")
	private WebElement LeadSourceDropdown;
	
	@AndroidFindBy(accessibility = "new-lead-visit-date")
	private WebElement visitdatetextfield;
	
	@AndroidFindBy(accessibility ="new-lead-visit-location-dropdown")
	private WebElement visitlocationdropdown;
	
	@AndroidFindBy(accessibility = "new-lead-first-name-input")
	private WebElement firstnameTextfeildfromnewleadpage;
	
	@AndroidFindBy(accessibility = "new-lead-last-name-input")
	private WebElement lastnametextfieldfromnewleadpage;
	
	@AndroidFindBy(accessibility = "new-lead-mobile-number-input"
			)private WebElement mobilenumbertextfieldfromleadpage;
	
	@AndroidFindBy(accessibility ="new-lead-pan-number-input")
	private WebElement pannumbertextfieldfromleadpage;
	
	@AndroidFindBy(accessibility = "new-lead-email-input")
	private WebElement emailtextfeildfromleadpage;
	
	@AndroidFindBy(accessibility = "new-lead-merchant-name-input")
	private WebElement tradingnameTextfeild;
	@AndroidFindBy(accessibility = "new-lead-control-program-dropdown")
	private WebElement controlledprogramdropdown;
	
	@AndroidFindBy(accessibility = "new-lead-industry-dropdown")
	private WebElement industrydropdonw;
	
	@AndroidFindBy(accessibility = "new-lead-purpose-of-loan-dropdown")
	private WebElement purposeloaddropdwon;
	
	@AndroidFindBy(accessibility = "new-lead-business-entity-dropdown")
	private WebElement businessenitydropdown;
	
	@AndroidFindBy(accessibility = "new-lead-nature-of-business-dropdown")
	private WebElement natureofbuisnessdropdown;
	
	@AndroidFindBy(accessibility = "new-lead-business-years-input")
	private WebElement buisnessyeartf;
	
	@AndroidFindBy(accessibility = "new-lead-loan-amount-input")
	private WebElement loanamounttf;
	
	@AndroidFindBy(accessibility = "new-lead-average-sales-input")
	private WebElement Averagesalespermomthtf;
	
	@AndroidFindBy(accessibility = "new-lead-pincode-input")
	private WebElement postalcodetf;
	
	@AndroidFindBy(accessibility = "new-lead-city-dropdown")
	private WebElement citydropdown;
	
	@AndroidFindBy(accessibility = "new-lead-street-input")
	private WebElement StreetTF;
	
	@AndroidFindBy(accessibility = "submit-new-lead-button")
	private WebElement submitbtn;
	
	
	
	public WebElement leadsourcedropdown() {
		return LeadSourceDropdown;
	}
	public WebElement visitdatetextfeild() {
		return visitdatetextfield;
	}
	
	public WebElement visitlocationdropdwon() {
		return visitlocationdropdown;
	}
	
	public WebElement firstnametextfield() {
		return firstnameTextfeildfromnewleadpage;
	}
	
	public WebElement lastnametextfield() {
		return lastnametextfieldfromnewleadpage;
	}
	
	public WebElement mobilenumbertextfeild() {
		return mobilenumbertextfieldfromleadpage;
	}
	
	public WebElement pannumbertextfeild() {
		return pannumbertextfieldfromleadpage;
	}
	
	public WebElement emailtextfeild() {
		return emailtextfeildfromleadpage;
	}
	
	public WebElement tradingnametextfeild() {
		return tradingnameTextfeild;
	}
	
	public WebElement businessyearstextfeild() {
		return buisnessyeartf;
	}
	
	public WebElement loanamounttextfeild() {
		return loanamounttf;
	}
	
	public WebElement averagesalespermonthtextfeild() {
		return Averagesalespermomthtf;
	}
	
	public WebElement postalcodetextfeild() {
		return postalcodetf;
	}
	
	public WebElement streettextfeild() {
		return StreetTF;
	}
	
	public WebElement ControlledProgramdropdown() {
		return controlledprogramdropdown;
	}
	public WebElement Industrydropdown() {
		return industrydropdonw;
	}
	
	public WebElement PuproseofLoandropdown() {
		return purposeloaddropdwon;
	}
	
	public WebElement BuisnessEntitydropdown() {
		return businessenitydropdown;
	}
	
	public WebElement NatureofBuisnessdropdown() {
		return natureofbuisnessdropdown;
	}
	
	public WebElement SubmitButton() {
		return submitbtn;
	}
	
}
