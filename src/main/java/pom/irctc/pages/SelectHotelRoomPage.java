package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SelectHotelRoomPage extends GenericWrappers{
	
	public HotelPersonalDetailsPage clickOnFirstRoomVisible() {
		clickByXpath("(//button[@class='btn btn-sm btn-radius-none yellow-gradient my-0'])[1]");
		return new HotelPersonalDetailsPage();
	}

}
