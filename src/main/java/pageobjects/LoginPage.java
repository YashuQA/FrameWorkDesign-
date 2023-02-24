package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-email")
	WebElement emailAddress;

	public WebElement emailAddress() {
		return emailAddress;
	}
	@FindBy(id="input-password")
	WebElement password;

	public WebElement password() {
		return password;
	}
	@FindBy(css="input[value='Login']")
	WebElement loginButton;

	public WebElement loginButton() {
		return loginButton;
	}
	@FindBy(linkText="Logout")
	WebElement logOut;
	public void logOut() {
		logOut.click();
	}
}
