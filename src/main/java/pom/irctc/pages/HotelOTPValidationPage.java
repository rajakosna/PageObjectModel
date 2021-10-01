package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelOTPValidationPage extends GenericWrappers{

	public HotelOTPValidationPage clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}

	public HotelOTPValidationPage verifyOTPRequired() {
		verifyTextByXpath("//span[text()='otp is required.']", "otp is required.");
		return this;
	}
}
