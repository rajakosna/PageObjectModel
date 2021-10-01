package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRNewUserRegistrationPage extends GenericWrappers{

	public FTRNewUserRegistrationPage enterUserID(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.UserID.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage waitTime(long millis) {
		waitProperty(millis);
		return this;
	}
	
	public FTRNewUserRegistrationPage scrollDown() {
		pageDown();
		return this;
	}
	
	public FTRNewUserRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectSecurityQuestion(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.SecQuestion.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.SecAnswer.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnDOB() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickDOB.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage selectMonth(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.SelectMonth.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectYear(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.SelectYear.XPath"), data);
		waitProperty(3000);
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnDay(String option) {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickDay.XPath"), option);
		waitProperty(3000);
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnMale() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickMale.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnFemale() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickFemale.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnTransgender() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickTransgender.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnInstitution() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickInstitution.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnMarried() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickMarried.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnUnmarried() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickUnmarried.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectOccupation(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.Occupation.XPath"), data);
		scrollDown();
		return this;
	}
	
	public FTRNewUserRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectNationality(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.Nationality.XPath"), data);
		scrollDown();
		return this;
	}
	
	public FTRNewUserRegistrationPage enterFlatNumber(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.FlatNumber.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterStreet(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterArea(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectCountry(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.Country.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.Pincode.XPath"), data);
		waitTime(3000);
		pageDown();
		pageUp();
		return this;
	}
	
	public FTRNewUserRegistrationPage selectCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.City.XPath"), data);
		waitTime(5000);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectState(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.State.XPath"), data);
		scrollDown();
		waitTime(5000);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectPostOffice(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.PostOffice.XPath"), data);
		
		return this;
	}
	
	public FTRNewUserRegistrationPage clickOnNo() {
		clickByXpath(prop.getProperty("FTRNewUserRegistrationPage.ClickNo.XPath"));
		return this;
	}
	
	public FTRNewUserRegistrationPage enterOfficeFlatNumber(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeFlatNumber.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterOfficeStreet(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterOfficeArea(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeArea.XPath"), data);
		pageDown();
		return this;
	}
	
	public FTRNewUserRegistrationPage selectOfficeCountry(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeCountry.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterOfficeMobile(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeMobile.XPath"), data);
		return this;
	}
	
	public FTRNewUserRegistrationPage enterOfficePincode(String data) {
		enterByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficePincode.XPath"), data);
		pageDown();
		pageUp();
		waitTime(5000);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectOfficeCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeCity.XPath"), data);
		waitTime(5000);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectOfficeState(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficeState.XPath"), data);
		waitTime(5000);
		return this;
	}
	
	public FTRNewUserRegistrationPage selectOfficePostOffice(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRNewUserRegistrationPage.OfficePostOffice.XPath"), data);
		return this;
	}
}
