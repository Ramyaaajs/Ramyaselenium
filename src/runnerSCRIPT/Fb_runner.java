package runnerSCRIPT;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericSCRIPT.Basetest;
import pomSCRIPT.Constructor_chaining;

public class Fb_runner extends Basetest
{
@Test
public void login()
{
Constructor_chaining c=new Constructor_chaining(driver);
c.username("ramyajs");
Assert.fail();
c.password("ramya123");
c.loginbutton();
}
}
