package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC008";
		testCaseDescription="To verify Charter Enquiry for the Saloon Request";
		
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="irctc";
	}

	@Test
	public void SaloonMandatoryCheck() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverAndClickOnLounge()
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnEnquiry()
		.enterName("Raja Shekar Kosna")
		.enterOrganisationName("The Organisation")
		.enterAddress("123 That St")
		.enterMobile("90109010")
		.enterEmail("Rajakosna@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginatingStation("Warangal")
		.enterDestinationStation("Hyderabad")
		.clickOnDepartureDate()
		.enterToSelectDepartureDate("30")
		.clickOnArrivalBackDate()
		.enterToSelectArrivalBackDate("30")
		.enterDuration("5")
		.enterNumbersAndCoachType("3 AC 2 Non-AC")
		.enterNumberOfPassengers("5")
		.enterPurpose("Family Vacation")
		.enterAdditionalServicesRequired("Mandatory Alcohol")
		.clickOnSubmit();
	}
}
