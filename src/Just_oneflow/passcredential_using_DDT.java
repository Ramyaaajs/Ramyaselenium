package Just_oneflow;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericSCRIPT.Basetest;
import genericSCRIPT.Readdata_propertyfile;

public class passcredential_using_DDT extends Basetest
{
	@Test
	 public void login() throws EncryptedDocumentException, IOException
	 {
		driver.findElement(By.name("email")).sendKeys(Readdata_propertyfile.Getdata("Sheet1", 1, 0));
		 driver.findElement(By.name("pass")).sendKeys(Readdata_propertyfile.Getdata("Sheet1", 1, 1));
		 driver.findElement(By.name("login")).click();
	 }
	
	
	
}
