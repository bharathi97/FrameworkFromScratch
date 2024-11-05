package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//WebEelements
	@FindBy(xpath="//input[@data-qa='signup-name']")
	WebElement signupName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement signupEmail;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement signupButton;
		
	//Action Methods
	
	public void registerName(String name) {
		signupName.sendKeys(name);
	}
	
	public void registerEmail(String email) {
		signupEmail.sendKeys(email);
	}
	
	public void clickSignUp() {
		signupButton.click();
	}
	
	

}
