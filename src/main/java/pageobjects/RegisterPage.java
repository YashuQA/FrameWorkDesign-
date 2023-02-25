package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v110.audits.model.TrustedWebActivityIssueDetails;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Register")
	WebElement registerLink;
	
	public WebElement registerLink() {
		return registerLink;
	}
	
	@FindBy(xpath="//div[@id='content']//h1[1]")
	WebElement registerAccount;
	
	public WebElement registerAccount() {
		return registerAccount;
	}
	
	@FindBy(id="input-firstname")
	WebElement firstName;
	
	public WebElement firstName() {
		return firstName;
	}
	
	@FindBy(id="input-lastname")
	WebElement lastName;
	
	public WebElement lastName() {
		return lastName;
	}
	
	@FindBy(id="input-email")
	WebElement email;
	
	public WebElement email() {
		return email;
	}
	
	@FindBy(id="input-telephone")
	WebElement telephone;
	
	public WebElement telephone() {
		return telephone;
	}
	
	@FindBy(id="input-password")
	WebElement password;
	
	public WebElement password() {
		return password;
	}
	
	@FindBy(id="input-confirm")
	WebElement passwordConfirm;
	
	public WebElement passwordConfirm() {
		return passwordConfirm;
	}
	
	@FindBy(xpath=" //div[@class='form-group']//div[1]//label[1]//input")
	WebElement yesRadioButton;
	
	public WebElement yesRadioButton() {
		return yesRadioButton;
	}
	
	@FindBy(xpath=" //div[@class='form-group']//div[1]//label[2]//input")
	WebElement noRadioButton;
	
	public WebElement noRadioButton() {
		return noRadioButton;
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement agreeCheckbox;
	
	public WebElement agreeCheckbox() {
		return agreeCheckbox;
	}
	
//	@FindAll({@FindBy(xpath="//input[@type='radio'][@name='newsletter']")})
//	List<WebElement> radioButtons;
//	
//	
//	public List<WebElement> radioButtons() {
//		return radioButtons;
//	}
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	public WebElement continueButton() {
		return continueButton;
	}
	
}
