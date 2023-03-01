package tests;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import resources.Base;

public class DemoTest extends Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException {
		System.out.println("Demo Test for Listeners");
		driver = initilizeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void demo() throws IOException, InterruptedException {
		
	Assert.assertTrue(false);
	}
	@Test
	public void testSuccess() {
		System.out.println("Test Success");
	}
	
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
