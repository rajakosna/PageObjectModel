package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCRegistrationPage extends GenericWrappers {
	
	public FormCRegistrationPage enteruserID(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.userID.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage waitTime(long millis) {
		waitProperty(millis);
		return this;
	}
	
	public FormCRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectSecurityQuestion(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.SelectSecQuestion.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterSecurityAnswer(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecAnswer.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Name.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectGender(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.Gender.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterDOB(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.DOB.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Designation.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Email.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterMobile(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterPhone(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Phone.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectNationality(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.Nationality.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelName.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelCapacity(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelCapacity.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelAddress(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelAddress.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectState(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.HotelState.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectDistrict(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.HotelDistrict.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectAccomodationType(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.AccomodationType.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage selectAccomodationGrade(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.AccomodationGrade.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelEmail(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelEmail.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelMobile(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelMobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterHotelPhone(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HotelPhone.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerName(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerAddress(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress.XPath"), data);
		return this;
	}

	public FormCRegistrationPage selectOwnerState(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.OwnerState.XPath"), data);
		waitTime(3000);
		return this;
	}
	
	public FormCRegistrationPage selectOwnerDistrict(String data) {
		selectVisibileTextByXpath(prop.getProperty("FormCRegistrationPage.OwnerDistrict.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerEmail(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmail.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerPhone(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhone.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage enterOwnerMobile(String data) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobile.XPath"), data);
		return this;
	}
	
	public FormCRegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.Add.XPath"));
		return this;
	}
}
