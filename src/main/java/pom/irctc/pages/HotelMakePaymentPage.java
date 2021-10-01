package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelMakePaymentPage extends GenericWrappers{

	public HotelMakePaymentPage getHotelNameAndCompare() {
		verifyTextByXpath("//h5", HotelPersonalDetailsPage.hotelName);
		System.out.println("The hotel name is : "+HotelPersonalDetailsPage.hotelName);
		return this;
	}
	
	public HotelMakePaymentPage getPriceAndCompare() {
		verifyTextByXpath("//div[@class='faredetails-in faredetails-in-total']//following::strong", HotelPersonalDetailsPage.price);
		System.out.println("The hotel name is : "+HotelPersonalDetailsPage.price);
		return this;
	}
	
	public HotelMakePaymentPage clickOnTermsAndConditionsCheckBox() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	
	public HotelOTPValidationPage clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new HotelOTPValidationPage();
	}
	
	//if no make payment is page is available
	public HotelMakePaymentPage verifyGSTNumberRequired() {
		verifyTextByXpath("//span[text()='gstNumber is required.']", "gstNumber is required.");
		return this;
	}
}
