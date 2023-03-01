package tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.RegisterPage;
import resources.Base;

public class RegisterTest extends Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(dataProvider = "dataSetter")
	public void register(String firstname,String lastname,String email,String telephone,String password,String passConfirm) {
	
		LandingPage landingPage = new LandingPage(driver);
		
		landingPage.myAccountDropDown().click();
		
		RegisterPage registerPage = new RegisterPage(driver);
		
		registerPage.registerLink().click();
		
		String actualValue = "Register Account";
		
		String epectedValue = registerPage.registerAccount().getText();
		
		Assert.assertEquals(epectedValue, actualValue);
		
		
		registerPage.firstName().sendKeys(firstname);
		registerPage.lastName().sendKeys(lastname);
		registerPage.email().sendKeys(email);
		registerPage.telephone().sendKeys(telephone);
		registerPage.password().sendKeys(password);
		registerPage.passwordConfirm().sendKeys(passConfirm);
		
		boolean yesSelect = registerPage.yesRadioButton().isSelected();
		WebElement no = registerPage.noRadioButton();
		
		if(yesSelect==true) {
			registerPage.yesRadioButton().click();
		}else {
			no.click();
		}
		
		registerPage.agreeCheckbox().click();
		registerPage.continueButton().click();
		
		
	}
	
	@DataProvider
	public Object[][] dataSetter() {
		
		Object[][] data = {{"Nikki",
			"qa",
			"nikki@gmail.com",
			"7869374399",
			"nikki12345!",
			"nikki12345!"},{"yashu",
			"qa",
			"yashuqa001@gmail.com",
			"9550573030",
			"yashu12345!",
			"yashu12345!"
			}
			};
		return data;
	}
	
@AfterMethod
public void closure() {
	driver.quit();
}
}
