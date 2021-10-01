package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoachPage extends GenericWrappers{

	public FTRNewUserRegistrationPage clickOnNewUserSignUp() {
		clickByXpath(prop.getProperty("BookYourCoachPage.NewUserSignUp.XPath"));
		return new FTRNewUserRegistrationPage();
	}
}
