package com.appium.stepdefinations;

import com.appium.appiumUtils.AppiumUtilsActions;
import com.appium.appiumUtils.DriverManagerCapabilities;
import com.appium.pageobjectrepo.HomePage;
import com.appium.pageobjectrepo.LoginPage;
import com.appium.pageobjectrepo.MorePage;
import com.appium.pageobjectrepo.RaiseaQueryPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class customerstepdefinations extends DriverManagerCapabilities {
	LoginPage loginpage= new LoginPage(driver);
	AppiumUtilsActions Au= new AppiumUtilsActions();
	MorePage morepage = new MorePage(driver);

	@Given("when user enter RegisterdMobileNumber {string}")
	public void when_user_enter_registerd_mobile_number(String string) throws InterruptedException {
		Thread.sleep(30000);
		loginpage.entermobilenumber().sendKeys(string);
	}



	@When("Click on Login With PasswordButton")
	public void click_on_login_with_password_button() {
		 loginpage.taponpasswordbutn().click();
	}

	@Then("User should navigate to PasswordPage")
	public void user_should_navigate_to_password_page() {

	}

	@When("User enter Password {string}")
	public void user_enter_password(String string) throws InterruptedException {
		Thread.sleep(3000);
	    loginpage.enterpassword().sendKeys(string);
	}

	@When("Click on Login button")
	public void click_on_login_button() throws InterruptedException {
	   loginpage.TaponLoginBtn().click();
	}

	@Then("User should navigate to HomePage")
	public void user_should_navigate_to_home_page() throws InterruptedException {

	}

	@Given("Click on More Section")
	public void click_on_more_section() {

		new HomePage(driver).taponmorebutton().click();
	}

	@Given("Click on Queries")
	public void click_on_queries() {
		morepage.clickqueries().click();
	}

	@Then("user should navigate to queries page")
	public void user_should_navigate_to_queries_page() {

	}

	@Then("User select AppId From Application ID dropdown")
	public void user_select_app_id_from_application_id_dropdown() {
		morepage.tabapplicationIDDropdown().click();
	   morepage.textbtnclick().click();
	}

	@Then("User should click Raise a query button")
	public void user_should_click_raise_a_query_button() throws InterruptedException {
		Thread.sleep(3000);
	    morepage.taponraiseaquerybutton().click();
	}

	@Then("User should select {string} {string} {string} {string}")
	public void user_should_select(String string, String string2, String string3, String string4) {
	     new RaiseaQueryPage(driver).taponApplicationIDDropdown().click();
	      Au.ScrollTOtextandClick(string);
	      new RaiseaQueryPage(driver).choosetopicdropdown().click();
		   Au.ScrollTOtextandClick(string2);
		   new RaiseaQueryPage(driver).choosesubtopicdropdown().click();
		   Au.ScrollTOtextandClick(string3);
		   new RaiseaQueryPage(driver).enterdescription().sendKeys(string4);

	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
      new RaiseaQueryPage(driver).tapsubmitbtn().click();
	}

	@Then("validate the query is created by {string} status")
	public void validate_the_query_is_created_by_status(String string) {

	}


}
