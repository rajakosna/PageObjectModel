package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC007";
		testCaseDescription="To Verify IRCTC Book Your Coach Registration For The New User";
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="irctc";
	}
	
	@Test
	public void irctcFtrSignup() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverAndClickOnLounge()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.clickOnNewUserSignUp()
		.enterUserID("rajakosna01")
		.enterPassword("Pa$$w0rd")
		.enterConfirmPassword("Pa$$w0rd")
		.selectSecurityQuestion("Who was your Childhood hero?")
		.enterSecurityAnswer("Hero")
		.clickOnDOB()
		.selectMonth("Oct")
		.selectYear("1995")
		.clickOnDay("1")
		.clickOnMale()
		.clickOnUnmarried()
		.enterEmail("rajakosna@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Raja")
		.enterMiddleName("Shekar")
		.enterLastName("Kosna")
		.selectNationality("Indian")
		.enterFlatNumber("1-34")
		.enterStreet("Gumlapur")
		.enterArea("Choppadandi")
		.selectCountry("India")
		.enterMobile("9010901088")
		.enterPincode("505531")
		.selectCity("Karim Nagar")
		.selectState("ANDHRA PRADESH")
		.selectPostOffice("Gumlapur B.O")
		.clickOnNo()
		.enterOfficeFlatNumber("234")
		.enterOfficeStreet("Gumlapur")
		.enterOfficeArea("Choppadandi")
		.selectOfficeCountry("India")
		.enterOfficeMobile("8090809012")
		.enterOfficePincode("505531")
		.selectOfficeCity("Karim Nagar")
		.selectOfficeState("ANDHRA PRADESH")
		.selectOfficePostOffice("Ramadugu S.O");
		
		
	}

}
