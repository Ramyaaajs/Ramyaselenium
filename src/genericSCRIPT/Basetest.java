package genericSCRIPT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp(ITestResult result) throws IOException
	{
	 if(ITestResult.FAILURE==result.getStatus())
     {
		 Generic_photo_screenshot.getphoto(driver);	 
	 }
	 driver.close();
	}
}
