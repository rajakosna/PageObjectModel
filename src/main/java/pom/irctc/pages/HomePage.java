package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public RegistrationBasicDetailsPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.ClickRegister.XPath"));
		return new RegistrationBasicDetailsPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverHolidays.XPath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("HomePage.MouseHoverStays.XPath"));
		return this;
	}
	
	public AccommodationPage mouseHoverAndClickOnLounge() {
		mouseHoverAndClickByXpath(prop.getProperty("HomePage.MouseHoverClickLounge.XPath"));
		switchToLastWindow();
		return new AccommodationPage();
	}
	
}
