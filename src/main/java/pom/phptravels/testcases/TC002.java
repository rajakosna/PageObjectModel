package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PHPRegistrationPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC002";
		testCaseDescription="To verify PHP Travels Registration for a new user";
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="php";
	}
	
	@Test
	public void PhpTravelsRegistration() {
		new PHPRegistrationPage()
		.enterFirstname("Raja")
		.enterLastname("Kosna")
		.enterEmail("rajakosna@gmail.com")
		.enterPhoneNumber("9090808070")
		.enterCompanyName("D Company")
		.enterStreetAddress1("123 That St.")
		.enterStreetAddress2("Unit 2021")
		.enterCity("London")
		.enterState("Ontario")
		.enterPostalCode("N5Y4V4")
		.selectCountry("Canada")
		.enterMobileWhatsappNumber("9010901023")
		.enterPassword("Pa$$w0rd")
		.enterConfirmPassword("Pa$$w0rd")
		.clickOnNo();
	}

}
