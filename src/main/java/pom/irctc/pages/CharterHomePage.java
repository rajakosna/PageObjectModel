package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterHomePage extends GenericWrappers{

	public CharterEnquiryPage clickOnEnquiry() {
		clickByXpath(prop.getProperty("CharterHomePage.ClickEnquiry.XPath"));
		return new CharterEnquiryPage();
	}
}
