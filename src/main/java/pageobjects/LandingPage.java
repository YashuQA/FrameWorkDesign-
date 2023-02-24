package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	//this constructor will receive WebDriver from outside.
	public LandingPage(WebDriver driver) {

		this.driver = driver;
		//"this" means initilize the objects in this class
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title='My Account']")
	WebElement myAccountDropDown;

	//method to return the web element

	public WebElement myAccountDropDown() {

		return myAccountDropDown;
	}

	@FindBy(linkText = "Login")
	WebElement loginOptions;

	public WebElement loginOptions() {

		return loginOptions;
	}

}
