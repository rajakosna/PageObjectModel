package pom.pan.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.pan.pages.ApplicationForNewPanCardPage;
import wrappers.ProjectWrappers;


public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testCaseName="TC006";
		testCaseDescription="To verify PAN CARD Registration for the new user";
		
		author="Sri";
		category="Smoke Test";
		browserName="chrome";
		appName="pancard";
	}

	@Test
	public void pancardApplication() {
		new ApplicationForNewPanCardPage()
		.selectTitle("MR.")
		.enterFirstName("Raja")
		.enterMiddleName("Shekar")
		.enterLastName("Kosna")
		.enterFatherFirstName("Sathyanaraya")
		.enterFatherMiddleName("Reddy")
		.enterFatherLastName("Kosna")
		.enterMobileNumber("9010901088")
		.enterEmail("rajakosna@gmail.com")
		.selectIncome("Business/Profession")
		.enterDOB("01101995")
		.clickOnOffice()
		.scrollDown()
		.enterResidenceHouseNo("1-34")
		.enterResidenceArea("Gumlapur")
		.enterResidenceCity("Karimnagar")
		.selectResidenceState("Telangana")
		.enterResidencePincode("505531")
		.enterOfficeName("The Great Office")
		.enterOfficeHouseNo("234")
		.enterOfficeArea("Gumalpur")
		.enterOfficeCity("Karimnagar")
		.selectOfficeState("Telangana")
		.enterOfficePincode("505531")
		.scrollDown()
		.selectIdentityProof("VOTER ID card which is having complete Date of Birth (In Copy)")
		.selectAddressProof("Bank Account Statement not more than 3 months old (In Copy)")
		.selectDOBproof("Matriculation certificate or mark sheet of recognised board (In Copy)")	
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Employer Certificate carrying Office Address")
		.clickOnTermsAndConditionsCheckBox();
	}
}
