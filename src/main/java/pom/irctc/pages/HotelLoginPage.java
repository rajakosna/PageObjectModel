package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelLoginPage extends GenericWrappers{

	public HotelLoginPage clickOnGuestLogin() {
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}
	
	public HotelLoginPage enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	
	public HotelLoginPage enterMobileNumber(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}
	
	public HotelHomePage clickOnLogin() {
		clickByXpath("(//button[text()='Login'])[2]");
		waitProperty(5000);
		return new HotelHomePage();
	}
}
