package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPersonalDetailsPage extends GenericWrappers{

	public RegistrationPersonalDetailsPage enterFirstName(String data) {
		enterByXpath("//input[@id='firstName']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterMiddleName(String data) {
		enterByXpath("//input[@id='middleName']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterLastName(String data) {
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnOccupation() {
		clickByXpath("//p-dropdown[@formcontrolname='occupation']");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickSelectedOccupation(String option) {
		clickByXpath("//span[text()='"+option+"']");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnDOB() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		waitProperty(3000);
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectMonth(String data) {
		selectVisibileTextByXpath("//select[contains(@class,'ui-datepicker-month')]", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectYear(String data) {
		selectVisibileTextByXpath("//select[contains(@class,'ui-datepicker-year')]", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnDay(String option) {
		clickByXpath("(//a[contains(@class,'ui-state-default')])[+option+]", option);
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectResidenceCountry(String data) {
		selectVisibileTextByXpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickMarried() {
		clickByXpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[1]");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickUnmarried() {
		clickByXpath("(//div[@class='ui-radiobutton-box ui-widget ui-state-default'])[2]");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnMale() {
		clickByXpath("//span[text()='Male']");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnFemale() {
		clickByXpath("//span[text()='Female']");
		return this;
	}
	
	public RegistrationPersonalDetailsPage clickOnTransgender() {
		clickByXpath("//span[text()='Transgender']");
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterEmail(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage enterMobile(String data) {
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	
	public RegistrationPersonalDetailsPage selectNationality(String data) {
		selectVisibileTextByXpath("(//select[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]", data);
		return this;
	}
	
	public RegistrationAddressPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return new RegistrationAddressPage();
	}
}
