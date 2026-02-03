package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a,int b,String sheet) throws IOException
	{
		f=new FileInputStream("C:\\Users\\anuja\\git\\SeleniumCourse\\automation\\src\\test\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);//the parameter for the getsheet method shoud be the name of the sheet in the excel sheet
		XSSFRow r=s.getRow(a); //XSSFRow - in built class to identify the row, getRow(a) - inbuilt method to get the row using index passed as parameter
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue(); //to get integer vlaue - getNumericCellValue
	}
	
	public static int getIntegerData(int a, int b,String sheet) throws IOException
	{
		f=new FileInputStream("C:\\Users\\anuja\\git\\SeleniumCourse\\automation\\src\\test\\resources\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet(sheet);//the parameter for the getsheet method shoud be the name of the sheet in the excel sheet
		XSSFRow r=s.getRow(a); //XSSFRow - in built class to identify the row, getRow(a) - inbuilt method to get the row using index passed as parameter
		XSSFCell c=r.getCell(b);
		//type casting - conversion of one data type to another (double to int)
		int y = (int) c.getNumericCellValue();
		return y;
		
	}

}
