package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC009";
		testCaseDescription="To verify hotel room booking";
		
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="irctc";
	}

	@Test
	public void bookHotelsOTPValidation() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverAndClickOnLounge()
		.clickOnHotelsIcon()
		.clickOnLogin()
		.clickOnGuestLogin()
		.enterEmail("rajakosna@gmail.com")
		.enterMobileNumber("9010901088")
		.clickOnLogin()
		.enterCityName("Hyderabad")
		.clickOnHotel()
		.clickOnCheckInCalender()
		.clickOnCheckInDay(3)
		.clickOnCheckOutCalender()
		.clickOnCheckOutDay(6)
		.clickOnRoomsandGuests()
		.selectNumberOfAdults("2")
		.selectNumberOfChildren("1")
		.selectNumberOfRooms("1")
		.clickOnDone()
		.clickOnFindHotel()
		.clickOnFirstRoomVisible()
		.getHotelName()
		.getPrice()
		.selectTitle("Mr")
		.enterFirstName("Raja Shekar")
		.enterLastName("Kosna")
		.selectCountry("India")
		.selectState("TELANGANA")
		.selectGST("No")
		.clickOnContinue()
		.getHotelNameAndCompare()
		.getPriceAndCompare()
		.clickOnTermsAndConditionsCheckBox()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOTPRequired();
		
	}

}
