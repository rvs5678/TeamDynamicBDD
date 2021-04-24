package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(linkText="Profile")
	WebElement Profile;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProfileLink() {
		Profile.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
}


