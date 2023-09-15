package com.appium.stepdefinations;

import java.io.IOException;
import java.sql.SQLException;

import com.appium.appiumUtils.AppiumUtilsActions;
import com.appium.appiumUtils.DriverManagerCapabilities;
import com.appium.appiumUtils.SQLQueries;
import com.appium.pageobjectrepo.HomePage;
import com.appium.pageobjectrepo.LoginPage;
import com.appium.pageobjectrepo.NewLeadPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ReporterConfigurable;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SalesStepDefinations extends DriverManagerCapabilities {

	 LoginPage loginpage = new LoginPage(driver);
	 AppiumUtilsActions appiumactions= new AppiumUtilsActions();
	 NewLeadPage newleadpage= new NewLeadPage(driver);
	 String mobilenumber=appiumactions.getrandommobilenumber();
	@Given("when user click on LoginButton")
	public void when_user_click_on_login_button() {	
	    loginpage.LoginButton().click();
	}

	@When("user enter {string} in EmployeeID TextField")
	public void user_enter_in_employee_id_text_field(String string) {
		loginpage.EmployeedIDTextFeild().sendKeys(string);
	}

	@Then("user click on sendotp button")
	public void user_click_on_sendotp_button() {
		loginpage.SendOTPButton().click();
	}

	@Then("user enter {string} to OtpTextFeild")
	public void user_enter_to_otp_text_feild(String string) {
		loginpage.OTPTextFeild().sendKeys(string);
	}

	@Then("user click on verify button")
	public void user_click_on_verify_button() throws InterruptedException {
		Thread.sleep(6000);
		loginpage.VerifyButton().click();
		Thread.sleep(8000);
	}

	@Then("user should lands to homepage")
	public void user_should_lands_to_homepage() throws InterruptedException {
	  Thread.sleep(5000); 
	}
	
	@Then("user lands to homepage")
	public void user_lands_to_homepage() {
	   
	}

	
	

	@When("user click addition sign from dashboard page")
	public void user_click_addition_sign_from_dashboard_page() throws InterruptedException {
		
	    new HomePage(driver).Clickadditionbutton().click();
	}
	
	@When("Select  {string} from createoptiondropdown from dashboard page")
	public void select_from_createoptiondropdown_from_dashboard_page(String string) throws InterruptedException {
		Thread.sleep(3000);
	   new HomePage(driver).ClickFreshleadbuttonfromhomescreenpage().click();
	   
	   
	}

	@When("select {string} from choose an option dropdown")
	public void select_from_choose_an_option_dropdown(String string) {
		newleadpage.leadsourcedropdown().click();
		appiumactions.ScrollTOtextandClick(string);
		
	}

	@When("select {string} from visit date dropdown")
	public void select_from_visit_date_dropdown(String string) {
	  
	}

	@When("select {string} from visit location dropdown")
	public void select_from_visit_location_dropdown(String string) {
	   newleadpage.visitlocationdropdwon().click();
	   appiumactions.ScrollTOtextandClick(string);
	}

	@When("Enter {string} in Firstnametextfeild")
	public void enter_in_firstnametextfeild(String string) {
	    newleadpage.firstnametextfield().sendKeys(string);
	}

	@When("Enter {string} in lastnametextfeild")
	public void enter_in_lastnametextfeild(String string) {
	   newleadpage.lastnametextfield().sendKeys(string);
	}
     
	
	@When("Enter  mobilenumber in mobilenumbertextfeild")
	public void enter_mobilenumber_in_mobilenumbertextfeild() {
      newleadpage.mobilenumbertextfeild().sendKeys(mobilenumber);
	}
	
	
	
	@When("Enter  {string} in mobilenumbertextfeild")
	public void enter_in_mobilenumbertextfeild(String string) {
	    newleadpage.mobilenumbertextfeild().sendKeys(string);
	}

	@When("Enter {string} in pannumbertextfeild")
	public void enter_in_pannumbertextfeild(String string) {
	    newleadpage.pannumbertextfeild().sendKeys(string);
	}

	@When("Enter {string} in Emailtextfeild")
	public void enter_in_emailtextfeild(String string) {
	   newleadpage.emailtextfeild().sendKeys(string);
	   
	}

	@When("Enter {string} in Tradingnametextfeild")
	public void enter_in_tradingnametextfeild(String string) {
	   appiumactions.mousescroll(newleadpage.pannumbertextfeild());
	   newleadpage.tradingnametextfeild().sendKeys(string);
	}

	@When("Select {string} from controlledprogramdropdown")
	public void select_from_controlledprogramdropdown(String string) {
	   newleadpage.ControlledProgramdropdown().click();
	   appiumactions.ScrollTOtextandClick(string);
	}

	@When("Select {string} from Industrydropdown")
	public void select_from_industrydropdown(String string) {
	    newleadpage.Industrydropdown().click();
	    appiumactions.ScrollTOtextandClick(string);
	}

	@When("Select {string} from Purposeofloandropdown")
	public void select_from_purposeofloandropdown(String string) {
	    newleadpage.PuproseofLoandropdown().click();
	    appiumactions.ScrollTOtextandClick(string);
	}

	@When("Select {string} from buisnessenitydropdown")
	public void select_from_buisnessenitydropdown(String string) {
		appiumactions.mousescroll(newleadpage.PuproseofLoandropdown());
		newleadpage.BuisnessEntitydropdown().click();
		appiumactions.ScrollTOtextandClick(string);
	}

	@When("Select {string} from natureofbuisnessdropdown")
	public void select_from_natureofbuisnessdropdown(String string) {
	   newleadpage.NatureofBuisnessdropdown().click();
	   appiumactions.ScrollTOtextandClick(string);
	}

	@When("Enter {string} in buisnessyearstextfeild")
	public void enter_in_buisnessyearstextfeild(String string) {
	   newleadpage.businessyearstextfeild().sendKeys(string);
	}

	@When("Enter {string} in Loanamounttextfeild")
	public void enter_in_loanamounttextfeild(String string) {
	 newleadpage.loanamounttextfeild().sendKeys(string);
	}

	@When("Enter {string} in averagesalesmonthTF")
	public void enter_in_averagesalesmonth_tf(String string) {
	   newleadpage.averagesalespermonthtextfeild().sendKeys(string);
	}

	@When("Enter {string} in postalcodeTF")
	public void enter_in_postalcode_tf(String string) {
	appiumactions.mousescroll(newleadpage.loanamounttextfeild());
	   newleadpage.postalcodetextfeild().sendKeys(string);
	}

	@When("Select {string} from Citydropdown")
	public void select_from_citydropdown(String string) {
	   
	}

	@When("Enter {string} in streettextfeild")
	public void enter_in_streettextfeild(String string) {
	   newleadpage.streettextfeild().sendKeys(string);
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	   newleadpage.SubmitButton().click();
	}
   
	@Then("Fetching the leadid from CRM database using mobilenumber")
	public void fetching_the_leadid_from_crm_database_using_mobilenumber() throws SQLException, InterruptedException, IOException {
	    String leadid = appiumactions.executequery(new SQLQueries().leadidbymobilenumber(mobilenumber),"id");
	    ExtentCucumberAdapter.addTestStepLog("Lead_Mobile_Number is ="+mobilenumber);
	    ExtentCucumberAdapter.addTestStepLog("Lead_ID after Fetiching CRM ="+leadid);
	    
	}
}
