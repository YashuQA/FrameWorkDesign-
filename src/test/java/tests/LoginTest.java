package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;
//	public LoginTest() {
//		super();
//
//	}

	@Test
	public void Login() throws IOException, InterruptedException {

		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
		
		//We need to call the constructor of landing page so we create an object 
		//and send this class driver 
		
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.myAccountDropDown().click(); //this will return the object of myAccount
		landingPage.loginOptions().click();

		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.emailAddress().sendKeys(prop.getProperty("email"));
		loginPage.password().sendKeys(prop.getProperty("password"));
		loginPage.loginButton().click();
		
		AccountPage accountPage = new AccountPage(driver);
		Assert.assertTrue(accountPage.editAccountInformationLink().isDisplayed());
		
	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
	}
}
