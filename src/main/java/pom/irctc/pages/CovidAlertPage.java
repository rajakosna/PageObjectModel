package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{
	
	public HomePage clickOnOk() {
		clickByXpath(prop.getProperty("CovidAlertPage.ClickOK.XPath"));
		return new HomePage();
	}
	

}
