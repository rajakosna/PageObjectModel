package pom.facebook.pages;

import wrappers.GenericWrappers;

public class CreateNewAccountPage extends GenericWrappers{

	public CreateNewAccountPage enterFirstname(String data) {
		enterByXpath(prop.getProperty("CreateNewAccountPage.FistName.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage enterLastName(String data) {
		enterByXpath(prop.getProperty("CreateNewAccountPage.LastNAme.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CreateNewAccountPage.Email.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage reEnterEmail(String data) {
		enterByXpath(prop.getProperty("CreateNewAccountPage.Re-Email.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage enterPassword(String data) {
		enterByXpath(prop.getProperty("CreateNewAccountPage.Password.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage selectMonth(String data) {
		selectVisibileTextByXpath(prop.getProperty("CreateNewAccountPage.Month.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage selectDay(String data) {
		selectVisibileTextByXpath(prop.getProperty("CreateNewAccountPage.Day.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage selectYear(String data) {
		selectVisibileTextByXpath(prop.getProperty("CreateNewAccountPage.Year.XPath"), data);
		return this;
		}
	
	public CreateNewAccountPage clickOnGender(String option) {
		clickByXpath(prop.getProperty("CreateNewAccountPage.Gender.XPath"), option);
		return this;
		}
	
	
}
