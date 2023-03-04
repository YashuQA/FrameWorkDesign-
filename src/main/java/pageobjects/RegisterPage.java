package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;
	
	//encapsulating web element by making them "private"
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//div[@id='content']//h1[1]")
	private WebElement registerAccount;

	@FindBy(id = "input-firstname")
	private WebElement firstName;
	
	@FindBy(id = "input-lastname")
	private WebElement lastName;

	@FindBy(id = "input-email")
	private WebElement email;
	
	@FindBy(id = "input-telephone")
	private WebElement telephone;
	
	@FindBy(id = "input-password")
	private WebElement password;
	
	@FindBy(id = "input-confirm")
	private WebElement passwordConfirm;
	
	@FindBy(xpath = " //div[@class='form-group']//div[1]//label[1]//input")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = " //div[@class='form-group']//div[1]//label[2]//input")
	private WebElement noRadioButton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeCheckbox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement registerLink() {
		return registerLink;
	}



	public WebElement registerAccount() {
		return registerAccount;
	}


	public WebElement firstName() {
		return firstName;
	}


	public WebElement lastName() {
		return lastName;
	}


	public WebElement email() {
		return email;
	}


	public WebElement telephone() {
		return telephone;
	}


	public WebElement password() {
		return password;
	}


	public WebElement passwordConfirm() {
		return passwordConfirm;
	}


	public WebElement yesRadioButton() {
		return yesRadioButton;
	}


	public WebElement noRadioButton() {
		return noRadioButton;
	}


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
	
	public WebElement continueButton() {
		return continueButton;
	}

}
