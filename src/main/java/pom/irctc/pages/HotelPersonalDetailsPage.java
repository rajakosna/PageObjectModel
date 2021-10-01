package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPersonalDetailsPage extends GenericWrappers{
	
	public static String hotelName, price;
	
	public HotelPersonalDetailsPage getHotelName() {
		 hotelName = getTextByXpath("//h5");
		System.out.println("The hotel name is : "+hotelName);
		return this;
	}
	
	public HotelPersonalDetailsPage getPrice() {
		 price = getTextByXpath("//div[@class='faredetails-in faredetails-in-total']//following::strong");
		System.out.println("The hotel name is : "+price);
		return this;
	}
	
	public HotelPersonalDetailsPage selectTitle(String data) {
		selectVisibileTextByXpath("//select[@name='title']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage enterFirstName(String data) {
		enterByXpath("//input[@name='firstName']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage enterLastName(String data) {
		enterByXpath("//input[@name='lastName']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage selectCountry(String data) {
		selectVisibileTextByXpath("//select[@name='country']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage selectState(String data) {
		selectVisibileTextByXpath("//select[@name='state']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage selectGST(String data) {
		selectVisibileTextByXpath("//select[@name='gst']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage enterCompanyName(String data) {
		enterByXpath("//input[@name='companyName']", data);
		return this;
	}
	
	public HotelPersonalDetailsPage enterCompanyAddress(String data) {
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
	}
	
	
	
	public HotelMakePaymentPage clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return new HotelMakePaymentPage();
	}
	
}
