package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelHomePage extends GenericWrappers{

	public HotelLoginPage clickOnLogin() {
		clickByXpath("//a[text()='Login']");
		return new HotelLoginPage();
	}
	
	public HotelHomePage enterCityName(String data) {
		enterByXpath("//input[@id='filterText']", data);
		waitProperty(5000);
		return this;
	}
	
	public HotelHomePage clickOnHotel() {
		clickByXpath("//div[@class='autofill-custom-wrap']//following-sibling::li[2]");
		return this;
	}
	
	public HotelHomePage clickOnCheckInCalender() {
		clickByXpath("//input[@name='dt12']");
		waitProperty(5000);
		return this;
	}
	
	public HotelHomePage clickOnCheckInDay(int day) {
		clickByXpath("(//span[@class='owl-dt-calendar-cell-content'])["+day+"]");
		waitProperty(5000);
		return this;
	}
	
	public HotelHomePage clickOnCheckOutCalender() {
		clickByXpath("//input[@name='dt13']");
		waitProperty(5000);
		return this;
	}
	
	public HotelHomePage clickOnCheckOutDay(int day) {
		clickByXpath("(//span[@class='owl-dt-calendar-cell-content'])["+day+"]");
		return this;
	}
	
	public HotelHomePage clickOnRoomsandGuests() {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		return this;
	}
	
	public HotelHomePage selectNumberOfRooms(String data) {
		selectVisibileTextByXpath("//select[@name='hotelRoom']", data);
		return this;
	}
	
	public HotelHomePage selectNumberOfAdults(String data) {
		selectVisibileTextByXpath("//select[@name='hotelAdult']", data);
		return this;
	}
	
	public HotelHomePage selectNumberOfChildren(String data) {
		selectVisibileTextByXpath("//select[@name='hotelChild']", data);
		return this;
	}
	
	public HotelHomePage clickOnDone() {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	
	public SelectHotelRoomPage clickOnFindHotel() {
		clickByXpath("//button[@class='btn btn-md yellow-gradient home-btn']");
		return new SelectHotelRoomPage();
	}
}
