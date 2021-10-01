package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectWrappers extends GenericWrappers{
	
	public String browserName;
	public String appName;
	public String sheetName;
	
	@BeforeSuite
	public void beforeSuite() {
		
		startReport();
	}
	
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		switch(appName) {
		case "irctc":
			invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
			break;
			
		case "facebook" :
			invokeApp(browserName, "http://www.facebook.com");
			break;
			
		case "formc":
			invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
			break;
			
		case "ftr":
			invokeApp(browserName, "https://www.ftr.irctc.co.in/ftr/");
			break;
			
		case "pancard":
			invokeApp(browserName, "https://panind.com/india/new_pan/");
			break;
			
		case "php":
			invokeApp(browserName, "https://www.phptravels.org/register.php");
			break;
			
		case "irctc hotel otp":
			invokeApp(browserName, "https://www.irctc.co.in");
			break;
			
		case "irctc hotel gst":
			invokeApp(browserName, "https://www.irctc.co.in");
			break;
		}
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
		endTest();
	}
	
	@AfterTest
	public void afterTest() {
		unloadObject();
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	
	
	@DataProvider(name="fetchData")
	public String[][] getInputData() {
		return DataInputProvider.getData(sheetName);
	}
}
