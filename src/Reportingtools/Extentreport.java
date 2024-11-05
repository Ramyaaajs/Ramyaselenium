package Reportingtools;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport 
{
	@Test
	public void exam()
	{
	ExtentReports rep=new ExtentReports("./reports/xyz.html",false);
	  ExtentTest test = rep.startTest("TestCase1");
	test.log(LogStatus.PASS,"test case passed");
	test.log(LogStatus.FAIL,"test case failed");
	test.log(LogStatus.SKIP,"test case skipped");
	rep.endTest(test);
	rep.flush();
	}
}
