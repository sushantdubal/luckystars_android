package Automation_Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import App_modules.MD04_Draw_Flow;;

//import org.testng.annotations.Test;

public class ExcelTest {

	XSSFWorkbook wb;
	XSSFSheet sh1;
	int rowCount;
	
	App_modules.MD04_Draw_Flow tc1;

	public void exceldata() {
		try {

			// Specify the file path which you want to create or write
			File src = new File("/Users/Desktop/Test Data/Testdata.xlsx");
			
			
			
			// Load the file
			FileInputStream fis = new FileInputStream(src);

			// load the workbook
			// @SuppressWarnings("resource")
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// get the sheet which you want to modify or create
			sh1 = wb.getSheetAt(0);

			System.out.println(sh1.getFirstRowNum());

			for (int i = 1; 1 <= sh1.getLastRowNum() - 1; i++) {

				// getRow specify which row we want to read and getCell which
				// column

				XSSFCell mobile = sh1.getRow(i).getCell(0);
				XSSFCell firstname = sh1.getRow(i).getCell(1);
				XSSFCell lastname = sh1.getRow(i).getCell(2);
				String emailid = sh1.getRow(i).getCell(3).getStringCellValue();
				XSSFCell otp = sh1.getRow(i).getCell(4);
				XSSFCell postalcode = sh1.getRow(i).getCell(5);

				MD04_Draw_Flow.data(mobile, firstname, lastname, emailid, otp, postalcode);
  
				tc1 = new MD04_Draw_Flow();
				tc1.setUp();
				tc1.Signin_success();
			
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
		
		
	}

	public int rowCount() {

		int rowNo = 0;
		try {
			rowNo = sh1.getLastRowNum();
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rowNo;

	}

}
