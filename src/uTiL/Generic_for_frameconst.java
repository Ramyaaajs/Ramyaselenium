package uTiL;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_for_frameconst implements Frameworkconstant 
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException
	{
	System.setProperty(chromekey,chromevalue);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(propertyfile_ex1.log());
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeapp()
	{
	driver.close();	
	}
}
