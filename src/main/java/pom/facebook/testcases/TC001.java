package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.facebook.pages.LoginOrSignupPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC001";
		testCaseDescription="To verify Facebook Registration for the new user";
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="facebook";
		sheetName="TC001";
	}
	
	@Test()
	public void facebookRegistration() {
		new LoginOrSignupPage()
		.clickOnCreateNewAccount()
		.enterFirstname("Raja Shekar")
		.enterLastName("Kosna")
		.enterEmail("rajakosna@gmail.com")
		.reEnterEmail("rajakosna@gmail.com")
		.enterPassword("Pa$$w0rd")
		.selectMonth("Oct")
		.selectDay("1")
		.selectYear("1995")
		.clickOnGender("Male");
	}

}
