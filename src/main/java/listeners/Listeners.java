package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import utilities.ExtentReporter;

public class Listeners extends Base implements ITestListener {

	WebDriver driver = null;
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();

		extentTest=extentReport.createTest(testName+ " execution started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String testName = result.getName();
		
		extentTest.log(Status.PASS, testName+ " got Passed!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String testMethodName = result.getName();
		extentTest.fail(result.getThrowable()); 
		  // WebDriver driver=null; 
		//getting the test method name 
		String testName =
			result.getName();

			try { // we need the driver of the test which is failing. to get that driver
				// we are writing below line of code
				driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
						.get(result.getInstance());
			} catch (Exception e) {

				e.printStackTrace();
			} // takeScreenshot method getting from base class 
			
			try {
			takeScreenshot(testName, driver);
		}catch(IOException e)
		{
			 e.printStackTrace();
			 }
		}
		 
		
	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//at the end or else it will not print anything to the report
		extentReport.flush();
		
	}

}
