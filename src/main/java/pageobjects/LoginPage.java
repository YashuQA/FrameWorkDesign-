package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	//encapsulating web element by making them "private"
	@FindBy(id="input-email")
	private WebElement emailAddress;

	@FindBy(id="input-password")
	private WebElement password;

	@FindBy(css="input[value='Login']")
	private WebElement loginButton;

	@FindBy(linkText="Logout")
	private WebElement logOut;
	
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement emailAddress() {
		return emailAddress;
	}


	public WebElement password() {
		return password;
	}


	public WebElement loginButton() {
		return loginButton;
	}

	public void logOut() {
		logOut.click();
	}
}
