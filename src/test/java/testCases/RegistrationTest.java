package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class RegistrationTest extends BaseClass{
	
	@Test
	public void verifyAccountRegistration() {
		logger.info("**Starting the test**");
		HomePage home = new HomePage(driver);
		home.Login();
		LoginPage login = new LoginPage(driver);
		login.registerName(p.getProperty("name"));
		login.registerEmail(randomeString()+"@gmail.com");
		login.clickSignUp();
		RegistrationPage reg = new RegistrationPage(driver);
		reg.enterPassword(randomeAlphaNumberic());
		reg.enterFirstName(p.getProperty("firstName"));
		reg.enterLastName(p.getProperty("lastName"));
		reg.enterAddress(p.getProperty("address"));
		reg.enterCountry();
		reg.enterCity(p.getProperty("city"));
		reg.enterMobile(randomeNumber());
		reg.createAccount();
		
	}

}
