package Just_oneflow;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class For_launch
{
public WebDriver driver;
public JavascriptExecutor js;
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
 public void login()
 {
	 driver.findElement(By.name("email")).sendKeys("8861213283");
	 driver.findElement(By.name("pass")).sendKeys("suma8861213283");
	 driver.findElement(By.name("login")).click(); 
 }
 @Test
 public void actions() throws AWTException, InterruptedException
 {
	 driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("Kiran raj");
	 Robot rs=new Robot();
	 rs.keyPress(KeyEvent.VK_ENTER);
	 rs.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("(//span[text()='Follow'])[1]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//span[text()='Kiran Raj'])[1]")).click();
	 Thread.sleep(2000);
	 WebElement ele = driver.findElement(By.xpath("(//span[text()='Like'])[1]"));
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	  js=(JavascriptExecutor)driver;
	js.executeScript("window.s"
			+ "crollBy.("+x+","+y+")");
	ele.click();
	 Thread.sleep(2000);
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
