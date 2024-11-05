package Reportingtools;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class log4jprintin_console 
{
@Test
public void logreport()
{
	BasicConfigurator.configure();
	Logger log = Logger.getLogger(this.getClass().getName());
	log.warn("testcase warning");
	log.info("test case info");
	log.error("test case error");
}
}
