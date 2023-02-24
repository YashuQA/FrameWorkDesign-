package tests;



import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;
	LoginPage loginPage;
	Logger log;
//	public LoginTest() {
//		super();
//
//	}
	@BeforeMethod
	public void openApplication() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getClass());
		driver = initilizeDriver();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}

	@Test()
	public void Login() throws IOException, InterruptedException {

		

		//We need to call the constructor of landing page so we create an object
		//and send this class driver

		LandingPage landingPage = new LandingPage(driver);

		landingPage.myAccountDropDown().click(); //this will return the object of myAccount
		log.debug("Clicked on Account Drop Down");
		landingPage.loginOptions().click();
		log.debug("Clicked on Login Option");
		Thread.sleep(3000);

		loginPage = new LoginPage(driver);

		loginPage.emailAddress().sendKeys(prop.getProperty("email"));
		log.debug("Email Address got entered");
		loginPage.password().sendKeys(prop.getProperty("password"));
		log.debug("Password got entered");
		loginPage.loginButton().click();
		log.debug("Login button got clicked");

		AccountPage accountPage = new AccountPage(driver);
		Assert.assertTrue(accountPage.editAccountInformationLink().isDisplayed());
//		log.info("Assertion is Checked for display");


		/*
		 * String actualStatus = null ;
		 *
		 * try { if(accountPage.editAccountInformationLink().isDisplayed()) actualStatus
		 * = "Successful"; } catch (Exception e) { actualStatus = "Failure"; }
		 * Assert.assertEquals(actualStatus, expectedStatus);
		 */

	}


	@AfterMethod
	public void closure() {
		driver.quit();
		log.debug("Browser got closed");
	}


	/*
	 * @DataProvider public Object[][] getLoginData() {
	 *
	 * Object[][] data =
	 * {{"yashuqa001@gmail.com","yashu12345!","Successful"},{"yashu@gmail.com",
	 * "yashu!","Failure"}}; return data; }
	 */
}
