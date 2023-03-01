package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class DemoTest extends Base {
	public WebDriver driver;
	@Test
	public void demo() throws IOException, InterruptedException {
		System.out.println("Demo Test for Listeners");
		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
