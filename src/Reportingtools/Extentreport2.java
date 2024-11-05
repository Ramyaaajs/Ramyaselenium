package Reportingtools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport2 
{
public WebDriver driver;
@Test
public void log()
		{
	ExtentReports rep=new ExtentReports("./reports/abc.html",false);
	  ExtentTest test = rep.startTest("facebook test excecution");
	  System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	  driver=new ChromeDriver();
	  test.log(LogStatus.INFO,"tc exec started");
	  driver.get("https://www.facebook.com/");
	  test.log(LogStatus.PASS,"navigated to fb status");
	  driver.findElement(By.name("email")).sendKeys("ramya");
	  test.log(LogStatus.PASS,"tc passed");
	  driver.findElement(By.name("pass")).sendKeys("ramya123");
	  test.log(LogStatus.PASS,"tc passedpwd");
	  driver.close();
	  test.log(LogStatus.PASS,"driver close");
	  rep.endTest(test);
	  test.log(LogStatus.PASS,"end the actions");
	  rep.flush();
	  
	  
	  ExtentTest test1 = rep.startTest("facebook test excecution");
	  System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	  driver=new ChromeDriver();
	  test.log(LogStatus.INFO,"FB exec started");
	  driver.get("https://www.facebook.com/");
	  test.log(LogStatus.FAIL,"navigated to fb status");
	  driver.findElement(By.name("email")).sendKeys("ramya");
	  test.log(LogStatus.FAIL,"not able to tc passed");
	  driver.findElement(By.name("pass")).sendKeys("ramya123");
	  test.log(LogStatus.FAIL,"not able to tc passedpwd");
	  driver.close();
	  test.log(LogStatus.FAIL,"not able to driver close");
	  rep.endTest(test1);
	  test.log(LogStatus.FAIL,"end the actions");
	  rep.flush();
	  
		}
}