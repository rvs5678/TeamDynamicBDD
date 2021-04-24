package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class RegisterPage extends TestBase{

	
	@FindBy(name="reg_username")
	WebElement usernameField;
	
	@FindBy(name="reg_email")
	WebElement emailField;
	
	@FindBy(name="reg_password")
	WebElement passwordField;
	
	@FindBy(xpath="//div[@class='learnpress']/div/div[2]/form/p/button")
	WebElement registerBtn;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName() {
		usernameField.sendKeys("Thomas");
	}
	
	public void enterEmail() {
		emailField.sendKeys("Thomasjefferson@nomail.com");
	}
	
	public void enterPassword() {
		passwordField.sendKeys("Jeffisthebest");
	}
	
	public void clickRegister() {
		registerBtn.click();
	}
	
	public String getLoginSuccessPage() {
		return driver.getTitle();
	}
	
	
	
}

