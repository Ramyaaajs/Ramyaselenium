package pomSCRIPT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genericSCRIPT.Basepage;

public class Constructor_chaining extends Basepage
{
	@FindBy(name="email")
	private WebElement uname;
	@FindBy(name="pass")
	private WebElement passwd;
	@FindBy(name="login")
	private WebElement btn;
	public Constructor_chaining(WebDriver driver) 
	{
	super(driver);
	}
	public void username(String un)
	{
		uname.sendKeys(un);
	}
	public void password(String pwd)
	{
		passwd.sendKeys(pwd);
	}
	public void loginbutton()
	{
		btn.click();
	}
}
