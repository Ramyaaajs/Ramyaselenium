package genericSCRIPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage 
{
public WebDriver driver;
public Basepage(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
}
