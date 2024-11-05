package genericSCRIPT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata_propertyfile 
{
public static String Getdata(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
{
	String val=" ";
	FileInputStream fis=new FileInputStream("./Excel/Excelacesss.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
	val=c.getStringCellValue();
	return val;
}
}
