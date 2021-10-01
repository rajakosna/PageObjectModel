package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationBasicDetailsPage extends GenericWrappers{

	public RegistrationBasicDetailsPage enterUserName(String data) {
		enterByXpath("//input[@id='userName']", data);
		return this;
	}
	
	public RegistrationBasicDetailsPage enterPassword(String data) {
		enterByXpath("//input[@id='usrPwd']", data);
		return this;
	}
	
	public RegistrationBasicDetailsPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='cnfUsrPwd']", data);
		pageDown();
		waitProperty(3000);
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnPreferredLanguage() {
		clickByXpath("//p-dropdown[@formcontrolname='prefLang']");
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnEnglish() {
		clickByXpath("//span[text()='English']");
		return this;
	}
	public RegistrationBasicDetailsPage clickOnSecurityQuestion() {
		clickByXpath("//p-dropdown[@formcontrolname='secque']");
		waitProperty(3000);
		return this;
	}
	
	public RegistrationBasicDetailsPage clickOnSecurityOption(String option) {
		clickByXpath("//span[text()='"+option+"']");
		return this;
	}
	
	public RegistrationBasicDetailsPage enterSecurityAnswer(String data) {
		enterByXpath("(//input[@type='text'])[4]", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return new RegistrationPersonalDetailsPage();
	}
}
