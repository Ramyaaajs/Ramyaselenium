package Reportingtools;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class log4j_printinreport 
{
	@Test
	public void logreoprt() throws IOException
	{
Layout lay=new PatternLayout("%d,%c,%m,%n");
Appender app=new FileAppender(lay,"./reports/r1.log");
BasicConfigurator.configure(app);
Logger log=Logger.getLogger(this.getClass().getName());
log.warn("test case warning");
}
}
