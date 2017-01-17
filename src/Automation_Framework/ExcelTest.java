package Automation_Framework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import App_modules.MD04_Draw_Flow;



//import org.testng.annotations.Test;

public class ExcelTest {

	XSSFWorkbook wb;
	XSSFSheet sh1;
	int rowCount;
	
	
	Locators ls = new Locators();
	App_modules.MD04_Draw_Flow df  = new App_modules.MD04_Draw_Flow();

	public void exceldata() {
		try {

			// Specify the file path which you want to create or write
			File src = new File(ls.excelFileLoc);

			// Load the file
			FileInputStream fis = new FileInputStream(src);

			// load the workbook
			// @SuppressWarnings("resource")
			@SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// get the sheet which you want to modify or create
			sh1 = wb.getSheetAt(0);

			System.out.println(sh1.getFirstRowNum());

			for (int i = 1; 1 <= sh1.getLastRowNum() - 1; i++) 
			{

				// getRow specify which row we want to read and getCell which
				// column

				XSSFCell mobile = sh1.getRow(i).getCell(0);
				XSSFCell firstname = sh1.getRow(i).getCell(1);
				XSSFCell lastname = sh1.getRow(i).getCell(2);
				String emailid = sh1.getRow(i).getCell(3).getStringCellValue();
				XSSFCell otp = sh1.getRow(i).getCell(4);
				XSSFCell postalcode = sh1.getRow(i).getCell(5);

				MD04_Draw_Flow.data(mobile, firstname, lastname,	emailid, otp, postalcode);
  
				df.setUp();
				df.Signin_success();
			    rowCount();
			}

		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
			return;
		}
		
		
	}

	public int rowCount() 
	{

		int rowNo = 0;
		try 
		{
			rowNo = sh1.getLastRowNum();
		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return rowNo;

	}

}
