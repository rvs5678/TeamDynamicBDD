package stepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;


public class Register extends TestBase {
	RegisterPage rp;
	HomePage hp;
	
	public Register() {
		rp = new RegisterPage();
		hp = new HomePage();
	}
	
	@Given("user is in homepage of application")
	public void user_is_in_homepage_of_application() {
	    System.out.println(hp.getHomePageTitle());
	}
	@And("user clicks on the Profile button")
	public void user_clicks_on_the_profile_button() {
	    hp.clickProfileLink();
	}

	@When("user is navigated to Profile page")
	public void user_is_navigated_to_profile_page() {
	    System.out.println(driver.getTitle());
	}

	@And("user provides email, username & password")
	public void user_provides_email_username_password() {
	    rp.enterUserName();
	    rp.enterEmail();
	    rp.enterPassword();
	}

	@When("user clicks on Register")
	public void user_clicks_on_register() {
	    rp.clickRegister();
	}

	@Then("user should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {
	    Assert.assertTrue(driver.findElement(By.xpath("//li[@class='dashboard active']/a")).isDisplayed());
	}
	
}
