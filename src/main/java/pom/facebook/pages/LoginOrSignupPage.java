package pom.facebook.pages;

import wrappers.GenericWrappers;

public class LoginOrSignupPage extends GenericWrappers{
	public CreateNewAccountPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("LogInOrSignUpPage.CreateNewAccount.Xpath"));
		return new CreateNewAccountPage();
	}
}
