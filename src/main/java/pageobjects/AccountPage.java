package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

	WebDriver driver;


	//encapsulating web element by making them "private"
	@FindBy(linkText="Edit your account information")
	private WebElement editAccountInformationLink;  
	
	//this constructor will receive WebDriver from outside.
	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}


	public WebElement editAccountInformationLink() {

		return editAccountInformationLink;
	}
}
