package pom.pan.pages;

import wrappers.GenericWrappers;

public class ApplicationForNewPanCardPage extends GenericWrappers{
	
	public ApplicationForNewPanCardPage selectTitle(String data) {
		selectVisibileTextByXpath("//select[@id='pan_title']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage scrollDown() {
		pageDown();
		return this;
	}
	
	public ApplicationForNewPanCardPage enterFirstName(String data) {
		enterByXpath("//input[@id='pan_firstname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterMiddleName(String data) {
		enterByXpath("//input[@id='pan_middlename']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterLastName(String data) {
		enterByXpath("//input[@id='pan_lastname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterFatherFirstName(String data) {
		enterByXpath("//input[@id='pan_fatherfirstname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterFatherMiddleName(String data) {
		enterByXpath("//input[@id='pan_fathermiddlename']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterFatherLastName(String data) {
		enterByXpath("//input[@id='pan_fatherlastname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterMobileNumber(String data) {
		enterByXpath("//input[@id='pan_mobilenumber']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterEmail(String data) {
		enterByXpath("//input[@id='pan_email']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectIncome(String data) {
		selectVisibileTextByXpath("//select[@id='pan_sourceofincome']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage clickOnOffice() {
		clickByXpath("//input[@id='office']");
		
		return this;
	}
	
	public ApplicationForNewPanCardPage clickOnResidence() {
		clickByXpath("//input[@id='residence']");
		return this;
	}
	
	public ApplicationForNewPanCardPage enterDOB(String data) {
		enterByXpath("//input[@id='pan_dob']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterResidenceHouseNo(String data) {
		enterByXpath("//input[@id='pan_addressline1']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterResidenceArea(String data) {
		enterByXpath("//input[@id='pan_addressline2']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterResidenceCity(String data) {
		enterByXpath("//input[@id='pan_cityname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectResidenceState(String data) {
		selectVisibileTextByXpath("//select[@id='pan_state']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterResidencePincode(String data) {
		enterByXpath("//input[@id='pan_pincode']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterOfficeName(String data) {
		enterByXpath("//input[@id='pan_officename']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterOfficeHouseNo(String data) {
		enterByXpath("//input[@id='pan_officeaddressline1']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterOfficeArea(String data) {
		enterByXpath("//input[@id='pan_officeaddressline2']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterOfficeCity(String data) {
		enterByXpath("//input[@id='pan_officecityname']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectOfficeState(String data) {
		selectVisibileTextByXpath("//select[@id='pan_officestate']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage enterOfficePincode(String data) {
		enterByXpath("//input[@id='pan_officepincode']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectIdentityProof(String data) {
		selectVisibileTextByXpath("//select[@id='pan_identityproof']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectAddressProof(String data) {
		selectVisibileTextByXpath("//select[@id='pan_addressproof']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectDOBproof(String data) {
		selectVisibileTextByXpath("//select[@id='pan_DOBproof']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectAadhaarProof(String data) {
		selectVisibileTextByXpath("//select[@id='pan_aadhaarproof']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage selectOfficeAddressProof(String data) {
		selectVisibileTextByXpath("//select[@id='pan_officeaddressproof']", data);
		return this;
	}
	
	public ApplicationForNewPanCardPage clickOnTermsAndConditionsCheckBox() {
		clickByXpath("//input[@id='pan_source']");
		return this;
	}

}
