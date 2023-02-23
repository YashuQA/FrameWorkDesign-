package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class LoginTest extends Base {

//	public LoginTest() {
//		super();
//
//	}

	@Test
	public void Login() throws IOException {

		WebDriver driver = initilizeDriver();
		driver.get(prop.getProperty("url"));

	}
}
