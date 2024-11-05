package Just_oneflow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import genericSCRIPT.Generic_photo_screenshot;
import genericSCRIPT.Readdata_propertyfile;

public class For_lunch_using_DDT
{
	public WebDriver driver;
	 @BeforeTest
	 public void launch()
	 {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	 
	 }
	 @BeforeClass
	 public void urlpass()
	 {
		 driver.get("https://www.facebook.com/");
	 }
	 @BeforeMethod
	 public void login() throws Throwable, IOException
	 {
		 driver.findElement(By.name("email")).sendKeys(Readdata_propertyfile.Getdata("Sheet1", 0, 0));
		 driver.findElement(By.name("pass")).sendKeys(Readdata_propertyfile.Getdata("Sheet1", 0, 1));
		 driver.findElement(By.name("login")).click(); 
	 }
	 @Test
	 public void actions() throws AWTException, InterruptedException
	 {
		 driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("Srimurali");
		 Robot rs=new Robot();
		 rs.keyPress(KeyEvent.VK_ENTER);
		 rs.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//a[text()='Srimurali']")).click();
		 //Thread.sleep(2000);
		 //driver.findElement(By.xpath("//a[text()='Like']")).click();
		 //Thread.sleep(2000);
	 }
	 @AfterMethod
	 public void phototake() throws IOException
	 {
		 Generic_photo_screenshot.getphoto(driver);
	 }
	 @AfterClass
	 public void message()
	 {
		 System.out.println("i was click nd like on muraliphoto");
	 }
	 @AfterTest
	 public void closetheapp()
	 {
		 driver.close();
	 }
}
