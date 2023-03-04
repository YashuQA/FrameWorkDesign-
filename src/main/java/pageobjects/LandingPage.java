package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	
	//encapsulating web element by making them "private"
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccountDropDown;
	
	@FindBy(linkText = "Login")
	private WebElement loginOptions;

	//this constructor will receive WebDriver from outside.
	public LandingPage(WebDriver driver) {

		this.driver = driver;
		//"this" means initilize the objects in this class
		PageFactory.initElements(driver, this);
	}


	//method to return the web element

	public WebElement myAccountDropDown() {

		return myAccountDropDown;
	}


	public WebElement loginOptions() {

		return loginOptions;
	}

}
