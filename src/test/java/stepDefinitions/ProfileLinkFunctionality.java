package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class ProfileLinkFunctionality extends TestBase {
	
	HomePage hp;
	
	public ProfileLinkFunctionality() {
		super();
		hp = new HomePage();
		
	}
	
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.out.println(hp.getHomePageTitle());
	}

	@When("user clicks on Profile button")
	public void user_clicks_on_profile_button() {
		hp.clickProfileLink();
	}

	@Then("user should be navigated to the Profile Page")
	public void user_should_be_navigated_to_the_profile_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed());
}
}
