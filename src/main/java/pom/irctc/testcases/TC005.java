package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC005";
		testCaseDescription="To Verify IRCTC Registration For The New User";
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void irctcRegistration() {
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("rajakosna01")
		.enterPassword("Pa$$w0rd")
		.enterConfirmPassword("Pa$$w0rd")
		.clickOnPreferredLanguage()
		.clickOnEnglish()
		.clickOnSecurityQuestion()
		.clickOnSecurityOption("Who was your Childhood hero?")
		.enterSecurityAnswer("hero")
		.clickOnContinue()
		.enterFirstName("Raja")
		.enterMiddleName("Shekar")
		.enterLastName("Kosna")
		.clickOnOccupation()
		.clickSelectedOccupation("PROFESSIONAL")
		.clickOnDOB()
		.selectMonth("October")
		.selectYear("1995")
		.clickOnDay("1")
		.clickUnmarried()
		.clickOnMale()
		.selectResidenceCountry("India")
		.enterMobile("9010901088")
		.selectNationality("India")
		.clickOnContinue()
		.enterFlatNumber("1-34")
		.enterStreet("Gumlapur")
		.enterArea("Choppadandi")
		.enterPincode("505531")
		.enterState("Telangana")
		.selectCity("KARIM NAGAR")
		.selectPostOffice("Gumlapur B.O")
		.enterPhone("9010901088")
		.clickNoToCopyAddress()
		.enterOfficeFlatNumber("234")
		.enterOfficeStreet("Gumlapur")
		.enterOfficeArea("Choppadandi")
		.clickOnOfficeCountry()
		.selectOfficeCountry("India")
		.enterOfficePincode("505531")
		.enterOfficeState("Telangana")
		.enterOfficeCity("KARIM NAGAR")
		.enterOfficePostOffice("Ramadugu S.O")
		.enterOfficePhone("9898484823")
		.clickOnAcceptTermsAndConditions();
		
	}

}
