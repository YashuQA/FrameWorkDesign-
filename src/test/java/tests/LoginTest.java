package tests;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;
	LoginPage loginPage;
//	public LoginTest() {
//		super();
//
//	}

	@Test(dataProvider = "getLoginData")
	public void Login(String email,String password,String expectedStatus) throws IOException, InterruptedException {

		
		//We need to call the constructor of landing page so we create an object 
		//and send this class driver 
		
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.myAccountDropDown().click(); //this will return the object of myAccount
		landingPage.loginOptions().click();

		Thread.sleep(3000);
		
		loginPage = new LoginPage(driver);
		
		loginPage.emailAddress().sendKeys(email);
		loginPage.password().sendKeys(password);
		loginPage.loginButton().click();
		
		AccountPage accountPage = new AccountPage(driver);
//		Assert.assertTrue(accountPage.editAccountInformationLink().isDisplayed());
		
		
		String actualStatus = null ;
		
		try {
			if(accountPage.editAccountInformationLink().isDisplayed())
			actualStatus = "Successful";
		} catch (Exception e) {
			actualStatus = "Failure";
		}
		Assert.assertEquals(actualStatus, expectedStatus);
		
	}
	@BeforeMethod
	public void openApplication() throws IOException {

		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closure() {
		driver.quit();
	}
	
 
	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data = {{"yashuqa001@gmail.com","yashu12345!","Successful"},{"yashu@gmail.com","yashu!","Failure"}};
		return data;
	}
}
