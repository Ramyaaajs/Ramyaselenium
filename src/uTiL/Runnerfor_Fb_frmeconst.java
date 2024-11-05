package uTiL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runnerfor_Fb_frmeconst extends Generic_for_frameconst
{
	@Test
	public void runscript()
	{
		driver.findElement(By.id("email")).sendKeys("ramya");
		driver.findElement(By.id("pass")).sendKeys("js");
		driver.findElement(By.name("login")).click();
	}
}
