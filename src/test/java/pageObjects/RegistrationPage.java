package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//WebElements
	
	@FindBy(xpath="//input[@data-qa='password']")
	WebElement registrationPassword;
	
	@FindBy(xpath="//input[@data-qa='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@data-qa='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@data-qa='address']")
	WebElement address;
	
	@FindBy(xpath="//select[@data-qa='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@data-qa='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@data-qa='zipcode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@data-qa='mobile_number']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//button[@data-qa='create-account']")
	WebElement createAccountCTA;
	
	//Action Methods
	
	public void enterPassword(String pwd) {
		registrationPassword.sendKeys(pwd);
	}
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterAddress(String addr) {
		address.sendKeys(addr);
	}
	
	public void enterCountry() {
		Select selectCountry = new Select(country);
		selectCountry.selectByIndex(0);
	}
	
	public void enterCity(String c) {
		city.sendKeys(c);
	}
	
	public void enterMobile(String mobile) {
		mobileNumber.sendKeys(mobile);
	}
	
	public void createAccount() {
		createAccountCTA.click();
	}
	
	

}
