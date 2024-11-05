package uTiL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertyfile_ex1 
{
@Test
public static String log() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./sw1/url.properties"));
	String val = p.getProperty("baseurl");
	return val;


}
}
