package pom.irctc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class CharterEnquiryPage extends GenericWrappers{
	
	public CharterEnquiryPage enterName(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Name.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterOrganisationName(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.OrganisationName.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterAddress(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Address.XPath"), data);
		pageDown();
		return this;
	}
	
	public CharterEnquiryPage enterMobile(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Mobile.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Email.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage selectRequestFor(String data) {
		selectVisibileTextByXpath(prop.getProperty("CharterEnquiryPage.Request.XPath"), data);
		
		return this;
	}
	
	public CharterEnquiryPage enterOriginatingStation(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.OriginatingStation.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterDestinationStation(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.DestinationStation.XPath"), data);
		waitProperty(6000);
		return this;
	}
	
	public CharterEnquiryPage clickOnDepartureDate() {
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickDepartutureDate.XPath"));
		waitProperty(5000);
		return this;
	}
	
	public CharterEnquiryPage enterToSelectDepartureDate(String option) {
		clickByXpath(prop.getProperty("CharterEnquiryPage.SelectDepartureDate.XPath"), option);
		waitProperty(5000);
		return this;
	}
	
	public CharterEnquiryPage clickOnArrivalBackDate() {
		clickByXpath(prop.getProperty("CharterEnquiryPage.ClickArrivalDate.XPath"));
		waitProperty(5000);
		return this;
	}
	
	public CharterEnquiryPage enterToSelectArrivalBackDate(String option) {
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[span[text()='"+day+"']]")));
		clickByXpath(prop.getProperty("CharterEnquiryPage.SelectArrivalDate.XPath"), option);
		return this;
	}
	
	public CharterEnquiryPage enterDuration(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Duration.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterNumbersAndCoachType(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.NumbersAndCoach.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterNumberOfPassengers(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Passengers.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterPurpose(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.Purpose.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage enterAdditionalServicesRequired(String data) {
		enterByXpath(prop.getProperty("CharterEnquiryPage.AdditionalServices.XPath"), data);
		return this;
	}
	
	public CharterEnquiryPage clickOnSubmit() {
		clickByXpath(prop.getProperty("CharterEnquiryPage.Submit.XPath"));
		return this;
		
	}
	
//	public void verfiyMobileNumber() {
//		verifyTextByXpath("", text);
//	}
}
