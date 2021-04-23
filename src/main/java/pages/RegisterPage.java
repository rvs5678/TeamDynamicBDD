package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPage extends TestBase{

	@FindBy(linkText="Profile")
	WebElement Profile;
	
	@FindBy(name="reg_username")
	WebElement usernameField;
	
	@FindBy(name="reg_email")
	WebElement emailField;
	
	@FindBy(name="reg_password")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\\\"learn-press-user-profile\\\"]/div[2]/form/p[2]/button")
	WebElement registerBtn;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickProfileLink() {
		Profile.click();
	}
	public void enterUserName(String reg_username) {
		usernameField.sendKeys(reg_username);
	}
	
	public void enterEmail(String reg_email) {
		emailField.sendKeys(reg_email);
	}
	
	public void enterPassword(String reg_password) {
		passwordField.sendKeys(reg_password);
	}
	
	public void clickRegister() {
		registerBtn.click();
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	public String getLoginSuccessPage() {
		return driver.getTitle();
	}
	
	
	
}

