package pom.formc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC003";
		testCaseDescription="To verify FTR Form C Registration for the new user";
		author="Raja Shekar Kosna";
		category="Smoke Test";
		browserName="chrome";
		appName="formc";
	}
	
	@Test
	public void indianFormC() {
		new FormCHomePage()
		.clickOnSignUp()
		.enteruserID("rajashekar01")
		.enterPassword("Pa$$w0rd")
		.enterConfirmPassword("Pa$$w0rd")
		.selectSecurityQuestion("What is the name of the street where you grew up?")
		.enterSecurityAnswer("Street")
		.enterName("Raja Shekar Kosna")
		.selectGender("Male")
		.enterDOB("01/10/1995")
		.enterDesignation("Professional")
		.enterEmail("rajakosna@gmail.com")
		.enterMobile("9010882341")
		.enterPhone("9849894832")
		.selectNationality("INDIA")
		.enterHotelName("Disney Hotel")
		.enterHotelCapacity("2500")
		.enterHotelAddress("123 This St.")
		.selectState("ANDHRA PRADESH")
		.waitTime(3000)
		.selectDistrict("VIJAYWADA")
		.selectAccomodationType("Hotel")
		.selectAccomodationGrade("Five Star")
		.enterHotelEmail("hotel@disney.com")
		.enterHotelMobile("9090898976")
		.enterHotelPhone("8989090912")
		.enterOwnerName("King Disney")
		.enterOwnerAddress("1 King St.")
		.selectOwnerState("TELANGANA")
		.waitTime(3000)
		.selectOwnerDistrict("KARIMNAGAR")
		.enterOwnerEmail("king@disney.com")
		.enterOwnerPhone("9898787823")
		.enterOwnerMobile("8090809070")
		.clickOnAdd();
	}

}
