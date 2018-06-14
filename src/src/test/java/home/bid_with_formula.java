package home;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.SizeSequence;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Today;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import stars_dashboard.stars_transfer;

import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.WinError;

import freemarker.ext.ant.UnlinkedJythonOperationsImpl;

//import home.swipe;

//on boarding class inherits base class

public class bid_with_formula

{

	
	public String AssignmentEx = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/DataFile2.xlsm";
	public String newFile = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/newFile.xlsm";

	//public String newFile1 = "/Users/apple/Desktop/excelFiles/newFile1.xlsm";

	// public String excelFileLoc ="/Users/apple/Desktop/Testdata.xlsx";

	XSSFWorkbook wb;

	XSSFSheet sh1;

	//swipe sp = new swipe();

	int iCnt;

	int i;
	double start1 =1.02;
	double end1 =1.11;

	double start = 1.02;
	double end =1.11;
	boolean assertTrue;
	
	int cnt=0;
	//double roundOff = Math.round(end * 100.0) / 100.0;

	public AndroidDriver driver;
	String destDir;
	DateFormat dateFormat;

	@BeforeTest
	public void setUp() throws InterruptedException, IOException

	{

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Samsung");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
 		signUp();

	}
	
	public void takeScreenShot() {
		  // Set folder name to store screenshots.
		  destDir = "screenshots";
		  // Capture screenshot.
		  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  // Set date format to set It as screenshot file name.
		  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  new File(destDir).mkdirs();
		  // Set file name using current date time.
		  String destFile = dateFormat.format(new Date()) + ".png";

		  try {
		   // Copy paste file at destination folder location
		   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		  } 
		  catch (IOException e) {
		   e.printStackTrace();
		  }
	}

	@Test(priority = 1, groups = "Regression")
	public void signUp() throws InterruptedException, IOException

	{

		Capabilities caps = driver.getCapabilities();

		@SuppressWarnings("unused")
		String version = caps.getCapability("platformVersion").toString();
		if (version.equalsIgnoreCase("6.0.1"))
		{
			version = "6.0";
		}
		
		Double newVersion = Double.parseDouble(version);

		driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

		if (newVersion > 5.0)
		{
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		}
		
		driver.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).sendKeys("9561192140");

		driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		driver.findElement(By.id("android:id/button1")).click();

		//Thread.sleep(5000);

		driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

		if (newVersion > 5.0)

		{

			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		}

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipeview")).click();

		bidding();

	}

	public void yourBids() throws IOException {

		File src = new File(AssignmentEx);

		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		sh1 = wb.getSheetAt(0);

		driver.findElement(By.id("in.interactive.luckystars:id/btn_bid_value")).click();

		List<String> foo = new ArrayList<String>();

		for (int k = 1; k <= (2200 / 11); k++) 
		{
			List<WebElement> allLinks = driver.findElements(By.id("in.interactive.luckystars:id/tv_bid_price"));

			Iterator<WebElement> itr = allLinks.iterator();

			while (itr.hasNext()) {

				foo.add(itr.next().getText());

				if (!itr.hasNext() == true) {

					//sp.verticalSwipeBtU(driver);

				}

			}

		}

		for (int iCnt = 0; iCnt < foo.size(); iCnt++) {

			System.out.println(foo.get(iCnt));

			sh1.getRow(iCnt).createCell(2).setCellValue(foo.get(iCnt));

			FileOutputStream fout = new FileOutputStream(new File(AssignmentEx));
 
			wb.write(fout);

		}

	}
	
	public void bidding() throws IOException
	{	
		for(cnt=1;cnt<=2;cnt++)
		{		
			System.out.println(cnt);
			singleBid(cnt);
		}
		
		
		for(int i=3;i<=100;i++)
		{
			bidRange(i);
		}
	}
	
	
	public void singleBid(int cnt) throws IOException
	{
		File src = new File(newFile);

		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		driver.findElement(By.id("in.interactive.luckystars:id/btn_go_unique_bid")).click();
		
		if (cnt==1)
		{
			driver.findElement(By.id("in.interactive.luckystars:id/et_rupee")).sendKeys("133.00");
		
			sh1 = wb.getSheetAt(0);
		
			sh1.getRow(cnt).createCell(0).setCellValue("133.00");
			sh1.getRow(cnt).createCell(1).setCellValue("");
			sh1.getRow(cnt).createCell(2).setCellValue("");
			sh1.getRow(cnt).createCell(3).setCellValue("Done");
			sh1.getRow(cnt).createCell(4).setCellValue(GetCurrentDateAndTime());
		
			FileOutputStream fout = new FileOutputStream(new File(newFile));
			wb.write(fout);
		
		}
		
		else
		{
			driver.findElement(By.id("in.interactive.luckystars:id/et_rupee")).sendKeys("133.01");
			
			sh1 = wb.getSheetAt(0);
			
			sh1.getRow(cnt).createCell(0).setCellValue("133.01");
			sh1.getRow(cnt).createCell(1).setCellValue("");
			sh1.getRow(cnt).createCell(2).setCellValue("");
			sh1.getRow(cnt).createCell(3).setCellValue("Done");
			sh1.getRow(cnt).createCell(4).setCellValue(GetCurrentDateAndTime());
		
			FileOutputStream fout = new FileOutputStream(new File(newFile));
			wb.write(fout);
		}
		
		if (!(driver.getKeyboard() == null))
		{
			driver.navigate().back();
		}
			
		driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click();
					
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("android:id/button1")).click();
		
		
		

	if (cnt==1)
		{
			System.out.println("The Bid is done for"+ "  " + "133.00"+" " + GetCurrentDateAndTime());

		}
		else
		{
			System.out.println("The Bid is done for"+ "  " + "133.01"+" " + GetCurrentDateAndTime());
		}
		

		String winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();

		System.out.println(winnerText);

		System.out.println("----------------------------------------------------------------------");
				   
				
	}
	
	public void bidRange(int i) throws IOException
	{
			driver.findElement(By.id("in.interactive.luckystars:id/btn_go_unique_bid")).click();
		
		   driver.findElement(By.id("in.interactive.luckystars:id/et_start_range")).sendKeys(String.valueOf(start1));

		  // System.out.println("Old Start Value"+" "+ start1);    		
		   
		   if (!(driver.getKeyboard() == null))
		   {
			   driver.navigate().back();
		   }

			driver.findElement(By.id("in.interactive.luckystars:id/et_end_range")).sendKeys(String.valueOf(end1));
			
		//	System.out.println("Old End Value"+" "+ end1);
    		
    		
			

			if (!(driver.getKeyboard() == null))
			{
				driver.navigate().back();
			}

			//
			driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click();

			//CONFIRM
			driver.findElement(By.id("android:id/button1")).click();
			takeScreenShot();

			System.out.println("The current position of Loop is" +" "+ i);
			
			System.out.println("The Bid is done for" + " " + start1 + " "+ "Rs &" + " " + end1 + " " + "Paise" + " " + "at" + " "+ GetCurrentDateAndTime());
			
			//
			driver.findElement(By.id("android:id/button1")).click();

			String winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();
			
			System.out.println(winnerText);

			System.out.println("----------------------------------------------------------------------");
			
			File src = new File(newFile);

			FileInputStream fis = new FileInputStream(src);



			@SuppressWarnings("resource")

			XSSFWorkbook wb = new XSSFWorkbook(fis);



			sh1 = wb.getSheetAt(0);
			
            try
            {
            	sh1.getRow(i).createCell(0).setCellValue("");
            	sh1.getRow(i).createCell(1).setCellValue(start);
            	sh1.getRow(i).createCell(2).setCellValue(end1);
            	sh1.getRow(i).createCell(3).setCellValue("Done");
            	sh1.getRow(i).createCell(4).setCellValue(GetCurrentDateAndTime());


            	FileOutputStream fout = new FileOutputStream(new File(newFile));
            	wb.write(fout);
            }
            catch(Exception e)
            {
            	System.out.println(e.getLocalizedMessage());
            }



			
			
			double s =start;
			DecimalFormat dfo = new DecimalFormat("#.##");
			start = start + 0.10;
			start1 = Double.parseDouble(dfo.format(start));
			   
		//	System.out.println("Start Range"+" "+ start1);

			   
			double e =end;
			DecimalFormat df = new DecimalFormat("#.##");
			end = end + 0.10;
			end1 = Double.parseDouble(df.format(end));
	    		
		//	System.out.println("End Range"+" "+ end1);
			
	}

	public void bid()
    {
    	for(int k=0;k<=50;k++)
    	{
    		System.out.println("Old Start Value"+" "+ start1);    		
    		double s =start;
    		DecimalFormat dfo = new DecimalFormat("#.##");
    		start = start + 0.10;
    		start1 = Double.parseDouble(dfo.format(start));
    		
    		System.out.println("New Start Value"+" "+ start1);
    		System.out.println("----------------------------------------------------------------------");
    		
    		
    		System.out.println("Old End Value"+" "+ end1);
    		double e =end;
    		DecimalFormat df = new DecimalFormat("#.##");
    		end = end + 0.10;
    		end1 = Double.parseDouble(df.format(end));
    		
    		System.out.println("New End Value"+" "+ end1);
    		System.out.println("----------------------------------------------------------------------");
    	}
    	
    	
    }

	public String GetCurrentDateAndTime()

	{

		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");

		// get current date time with Date()

		Date date = new Date();

		// Now format the date

		String date1 = dateFormat.format(date);

		// Print the Date

		return date1;

	}

	@AfterTest
	public void teardown() throws Exception

	{

		driver.quit();

	}

}