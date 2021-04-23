package stepDefinitions;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;


public class Register extends TestBase {
	RegisterPage rp;
	@Before
	public void openBrowser() {
		initialization();
		rp=new RegisterPage();
	}
	
	@After
	public void closeBrowser() {
		tearDown();
	}
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.out.println(rp.getRegisterPageTitle());
	}

	@When("user clicks on Profile button")
	public void user_clicks_on_profile_button() {
		rp.clickProfileLink();
	}

	@And("user is navigated to register page")
	public void user_is_navigated_to_register_page() {
	    System.out.println(rp.getRegisterPageTitle());
	}
	
	@When("user provides email, username & password")
	public void user_provides_email_username_password() {
	   System.out.println("email, username and password is good");
	}

//	@When("user provides {string}, {string} and {string}")
//	public void user_provides_and(String reg_username, String reg_email, String reg_password) {
//		 rp.enterUserName(reg_username);
//		    rp.enterEmail(reg_email);
//		    rp.enterPassword(reg_password);
//	}

	@When("user clicks on Register")
	public void user_clicks_on_register() {
	  rp.clickRegister();
	}
	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	   Assert.assertEquals(driver.getTitle(), "Profile → Dashboard - Transfotech Academy");
	}

	
}
