package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//WebElements
	@FindBy(xpath="//a[text()=' Signup / Login']")
	WebElement signupORlogin;
	
	
	
	//Action Methods
	public void Login() {
		signupORlogin.click();
	}

}
