package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationAddressPage extends GenericWrappers{

	public RegistrationAddressPage enterFlatNumber(String data) {
		enterByXpath("//input[@id='resAddress1']", data);
		return this;
	}
	
	public RegistrationAddressPage enterStreet(String data) {
		enterByXpath("//input[@id='resAddress2']", data);
		return this;
	}
	
	public RegistrationAddressPage enterArea(String data) {
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
	}
	
	public RegistrationAddressPage enterPincode(String data) {
		enterByXpath("//input[@name='resPinCode']", data);
		return this;
	}
	
	public RegistrationAddressPage enterState(String data) {
		enterByXpath("//input[@id='resState']", data);
		waitProperty(5000);
		return this;
	}
	
	public RegistrationAddressPage selectCity(String data) {
		selectVisibileTextByXpath("//select[@formcontrolname='resCity']", data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage selectPostOffice(String data) {
		selectVisibileTextByXpath("//select[@formcontrolname='resPostOff']", data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage enterPhone(String data) {
		enterByXpath("//input[@id='resPhone']", data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage clickYesToCopyAddress() {
		clickByXpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[3]");
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage clickNoToCopyAddress() {
		clickByXpath("//label[text()='No']//preceding-sibling::div");
		return this;
	}
	
	public RegistrationAddressPage enterOfficeFlatNumber(String data) {
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	
	public RegistrationAddressPage enterOfficeStreet(String data) {
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	}
	
	public RegistrationAddressPage enterOfficeArea(String data) {
		enterByXpath("//input[@id='offAddress3']", data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage clickOnOfficeCountry() {
		clickByXpath("//p-dropdown[@formcontrolname='offCountry']");
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage selectOfficeCountry(String data) {
		clickByXpath("//span[text()='"+data+"']");
		return this;
	}
	
	public RegistrationAddressPage enterOfficePincode(String data) {
		enterByXpath("//input[@name='offPinCode']", data);
		waitProperty(5000);
		return this;
	}
	
	public RegistrationAddressPage enterOfficeState(String data) {
		enterByXpath("//input[@id='offState']", data);
		waitProperty(1000);
		return this;
	}
	
	public RegistrationAddressPage enterOfficeCity(String data) {
		enterByXpath("//input[@formcontrolname='offCity']", data);
		waitProperty(1000);
		return this;
	}
	
	public RegistrationAddressPage enterOfficePostOffice(String data) {
		enterByXpath("//input[@formcontrolname='offPostOff']", data);
		return this;
	}
	
	public RegistrationAddressPage enterOfficePhone(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationAddressPage clickOnAcceptTermsAndConditions() {
		clickByXpath("(//span[@class='col-xs-2'])[4]");
		return this;
	}
}
