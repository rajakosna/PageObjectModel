package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage clickOnMenuIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.ClickMenu.XPath"));
		return this;
	}
	
	public CharterHomePage clickOnCharter() {
		clickByXpath(prop.getProperty("AccommodationPage.ClickCharter.XPath"));
		return new CharterHomePage();
	}
	
	
	public BookYourCoachPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("AccommodationPage.ClickBookYourCoach.XPath"));
		switchToLastWindow();
		return new BookYourCoachPage();
	}
	
	public HotelHomePage clickOnHotelsIcon() {
		clickByXpath(prop.getProperty("AccommodationPage.ClickHotelsIcon.XPath"));
		switchToLastWindow();
		return new HotelHomePage();
	}
	

}
