package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PHPRegistrationPage extends GenericWrappers{
	
	public PHPRegistrationPage enterFirstname(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterLastname(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.Phone.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.CompanyName.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterStreetAddress1(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.StreetAddress1.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.StreetAddress2.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterCity(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.City.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterState(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.State.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterPostalCode(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.PostalCode.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage selectCountry(String data) {
		selectVisibileTextByXpath(prop.getProperty("PHPRegistrationPage.Country.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterMobileWhatsappNumber(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.MobileWhatsapp.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("PHPRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public PHPRegistrationPage clickOnNo() {
		clickByXpath(prop.getProperty("PHPRegistrationPage.ClickNo.XPath"));
		return this;
	}
}
