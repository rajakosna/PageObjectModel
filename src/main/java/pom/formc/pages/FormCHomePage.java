package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{
	
	public FormCRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCHomePage.SignUp.XPath"));
		return new FormCRegistrationPage();
	}

}
