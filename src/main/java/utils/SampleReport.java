package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		
		// start Test
		ExtentTest test = report.startTest("TC004", "To Verify IRCTC Registration for the new user");
		
		test.assignAuthor("Raja Shekar");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	, "The browser got launched with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
	}

}
