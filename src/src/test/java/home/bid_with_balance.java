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

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//import left_menu.winners;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.formula.functions.Today;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.jna.platform.win32.WinError;



//import home.swipe;

//on boarding class inherits base class

public class bid_with_balance

{

	
	public String AssignmentEx = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/DataFile2.xlsm";
	public String newFile = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/newFile.xlsm";
	public String newFile1 = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/newFile.xlsm";

	// public String excelFileLoc ="/Users/apple/Desktop/Testdata.xlsx";

	XSSFWorkbook wb;

	XSSFSheet sh1;
	
	String cntStars;
	double cStars;
	double stars;
	double countt;

	//swipe sp = new swipe();

	int iCnt;
	int c=1;
	
	int singlebidAmt=10;
	
	
	int multiplebidAmt = singlebidAmt*10;
	

	int i;
	double start1 = 1.02;
	double end1 = 1.11;

	double start = start1;
	double end = end1;
	
	String messageTitle;
	String winnerText;
	
	int cnt=0;

	public AndroidDriver driver;

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

		// Thread.sleep(5000);

		driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

		if (newVersion > 5.0)

		{

			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		}

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();

		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipeview")).click();

		bidding();
	//	yourBids();

		
		countStars();
	}
	
	
	
	public double countStars()
	{
		driver.findElement(By.id("in.interactive.luckystars:id/iv_star")).click();
		
		
		if(!(driver.findElements(By.id("in.interactive.luckystars:id/tv_swipe_text")).size()==1))
		{
			cntStars = driver.findElement(By.id("in.interactive.luckystars:id/tv_dbcoin_count")).getText();
			
			System.out.println(cntStars);
			
			
			String newString = cntStars.replace(",", "");
			cStars = Float.parseFloat(cntStars);
		}
		else
		{
		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();
		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();
		
		cntStars = driver.findElement(By.id("in.interactive.luckystars:id/tv_dbcoin_count")).getText();
		System.out.println(cntStars);
		
		String newString = cntStars.replace(",", "");
		cStars = Float.parseFloat(newString);
		
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/"
				+ "android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
				+ "android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
		}
		return cStars;
		
		
	}

		
	public void bidding() throws IOException, InterruptedException
	{	
		/*for(cnt=1;cnt<=2;cnt++)
		{		
			System.out.println("The current position of Loop is" +" "+ cnt);
			singleBid(cnt);
		}*/
		
		
		
		for(int i=1;i<=500;i++)
		{
			if(i==1 || i==2)
			{
				System.out.println("The current position of Loop is" +" "+ i);
				singleBid(i);
			}
			else
			{
				bidRange(i);
			}
		}
	}
	
	
	@SuppressWarnings("unused")
	public void singleBid(int i) throws IOException
	{
		File src = new File(newFile1);

		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		if(c==1)
		{
			countt = countStars();
			c++;
		}
		winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();
		
		
		driver.findElement(By.id("in.interactive.luckystars:id/btn_go_unique_bid")).click();
		
		if (i==1)
		{
			driver.findElement(By.id("in.interactive.luckystars:id/et_rupee")).sendKeys("1.00");
			
			
			if (!(driver.getKeyboard() == null))
			{
				driver.navigate().back();
			}
				
			driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click();
						
			driver.findElement(By.id("android:id/button1")).click();
			
			//in.interactive.luckystars:id/alertTitle
			//android:id/message
			if(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Placed") || driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Repeated"))
			{
		        messageTitle = driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText();
				driver.findElement(By.id("android:id/button1")).click();
				System.out.println(messageTitle);
				
				
			}
			else
			{
				System.out.println(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText());
				driver.quit();
			}
			
			sh1 = wb.getSheetAt(0);
			
			
			CellStyle Range1 = wb.createCellStyle();
			Font rangeFont1 = wb.createFont();
			
			Range1.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont1.setColor(IndexedColors.BLACK.getIndex());
			Range1.setAlignment(CellStyle.ALIGN_CENTER);
			Range1.setFont(rangeFont1);
			
			XSSFCell Single = sh1.getRow(i).createCell(0);
			Single.setCellStyle(Range1);
	        Single.setCellValue("1.00");
	        Range1.setFont(rangeFont1);
			
	      //-----------------------------------------------------------------
	        
	        CellStyle Range2 = wb.createCellStyle();
			Font rangeFont2 = wb.createFont();
			
			Range2.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range2.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont2.setColor(IndexedColors.BLACK.getIndex());
			Range2.setAlignment(CellStyle.ALIGN_CENTER);
			Range2.setFont(rangeFont2);
			
			XSSFCell Start = sh1.getRow(i).createCell(1);
			Start.setCellStyle(Range2);
	        Start.setCellValue("");
	        Range2.setFont(rangeFont2);
	        
	      //-----------------------------------------------------------------
	        
	        
	        CellStyle Range3 = wb.createCellStyle();
			Font rangeFont3 = wb.createFont();
			
			Range3.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range3.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont3.setColor(IndexedColors.BLACK.getIndex());
			Range3.setAlignment(CellStyle.ALIGN_CENTER);
			Range3.setFont(rangeFont3);
			
			XSSFCell End = sh1.getRow(i).createCell(2);
			End.setCellStyle(Range3);
	        End.setCellValue("");
	        Range3.setFont(rangeFont3);
	        
	        
	      //-----------------------------------------------------------------
	        
	        
			CellStyle Range4 = wb.createCellStyle();
			Font rangeFont4 = wb.createFont();
			
			Range4.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range4.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont4.setColor(IndexedColors.BLACK.getIndex());
			Range4.setAlignment(CellStyle.ALIGN_CENTER);
			Range4.setFont(rangeFont4);
			
			XSSFCell Result = sh1.getRow(i).createCell(3);
			Result.setCellStyle(Range4);
	        Result.setCellValue("Bidded");
	        Range4.setFont(rangeFont4);
	        
	        
	        //-----------------------------------------------------------------
	        
	        
	        CellStyle Range5 = wb.createCellStyle();
			Font rangeFont5 = wb.createFont();
			
			Range5.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range5.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont5.setColor(IndexedColors.BLACK.getIndex());
			Range5.setAlignment(CellStyle.ALIGN_CENTER);
			Range5.setFont(rangeFont5);
			
			XSSFCell Time = sh1.getRow(i).createCell(4);
			Time.setCellStyle(Range5);
	        Time.setCellValue(GetCurrentDateAndTime());
	        Range5.setFont(rangeFont5);
	        
	        
	        //-----------------------------------------------------------------
	        
	        
	        CellStyle Range6 = wb.createCellStyle();
			Font rangeFont6 = wb.createFont();
			
			
			if(!winnerText.substring(0,3).equalsIgnoreCase("You"))
			{
				Range6.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
				rangeFont6.setColor(IndexedColors.BLACK.getIndex());
				Range6.setAlignment(CellStyle.ALIGN_CENTER);
				Range6.setFont(rangeFont6);
			}
			
			else
			{
				Range6.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
				rangeFont6.setColor(IndexedColors.GREEN.getIndex());
				Range6.setAlignment(CellStyle.ALIGN_CENTER);
				Range6.setFont(rangeFont6);
			}
			
			XSSFCell Winner = sh1.getRow(i).createCell(5);
			Winner.setCellStyle(Range6);
	        Winner.setCellValue(winnerText);
	        Range6.setFont(rangeFont6);
	        
	      //-----------------------------------------------------------------
	        
	        CellStyle Range7 = wb.createCellStyle();
			Font rangeFont7 = wb.createFont();
			
			Range7.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
			Range7.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont7.setColor(IndexedColors.BLACK.getIndex());
			Range7.setAlignment(CellStyle.ALIGN_CENTER);
			Range7.setFont(rangeFont7);
			
			XSSFCell bids = sh1.getRow(i).createCell(6);
			bids.setCellStyle(Range7);
			bids.setCellValue(messageTitle);
	        Range7.setFont(rangeFont7);
	       
	        
	        FileOutputStream fout = new FileOutputStream(new File(newFile1));
			wb.write(fout);
		
		}
		
		else
		{
			driver.findElement(By.id("in.interactive.luckystars:id/et_rupee")).sendKeys("1.01");
			
			if (!(driver.getKeyboard() == null))
			{
				driver.navigate().back();
			}
				
			driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click();
						
			driver.findElement(By.id("android:id/button1")).click();
			
			//in.interactive.luckystars:id/alertTitle
			//android:id/message
			if(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Placed") || driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Repeated"))
			{
		        String messageTitle = driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText();
				driver.findElement(By.id("android:id/button1")).click();
				System.out.println(messageTitle);
			}
			else
			{
				System.out.println(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText());
				driver.quit();
			}
			
			sh1 = wb.getSheetAt(0);
			
			CellStyle Range1 = wb.createCellStyle();
			Font rangeFont1 = wb.createFont();
			
			Range1.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range1.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont1.setColor(IndexedColors.BLACK.getIndex());
			Range1.setAlignment(CellStyle.ALIGN_CENTER);
			Range1.setFont(rangeFont1);
			
			XSSFCell Single = sh1.getRow(i).createCell(0);
			Single.setCellStyle(Range1);
	        Single.setCellValue("1.01");
	        Range1.setFont(rangeFont1);
			
	      //-----------------------------------------------------------------
	        
	        CellStyle Range2 = wb.createCellStyle();
			Font rangeFont2 = wb.createFont();
			
			Range2.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range2.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont2.setColor(IndexedColors.BLACK.getIndex());
			Range2.setAlignment(CellStyle.ALIGN_CENTER);
			Range2.setFont(rangeFont2);
			
			XSSFCell Start = sh1.getRow(i).createCell(1);
			Start.setCellStyle(Range2);
	        Start.setCellValue("");
	        Range2.setFont(rangeFont2);
	        
	      //-----------------------------------------------------------------
	        
	        
	        CellStyle Range3 = wb.createCellStyle();
			Font rangeFont3 = wb.createFont();
			
			Range3.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range3.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont3.setColor(IndexedColors.BLACK.getIndex());
			Range3.setAlignment(CellStyle.ALIGN_CENTER);
			Range3.setFont(rangeFont3);
			
			XSSFCell End = sh1.getRow(i).createCell(2);
			End.setCellStyle(Range3);
	        End.setCellValue("");
	        Range3.setFont(rangeFont3);
	        
	        
	      //-----------------------------------------------------------------
	        
	        
			CellStyle Range4 = wb.createCellStyle();
			Font rangeFont4 = wb.createFont();
			
			Range4.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range4.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont4.setColor(IndexedColors.BLACK.getIndex());
			Range4.setAlignment(CellStyle.ALIGN_CENTER);
			Range4.setFont(rangeFont4);
			
			XSSFCell Result = sh1.getRow(i).createCell(3);
			Result.setCellStyle(Range4);
	        Result.setCellValue("Done");
	        Range4.setFont(rangeFont4);
	        
	        
	        //-----------------------------------------------------------------
	        
	        
	        CellStyle Range5 = wb.createCellStyle();
			Font rangeFont5 = wb.createFont();
			
			Range5.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
		    Range5.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont5.setColor(IndexedColors.BLACK.getIndex());
			Range5.setAlignment(CellStyle.ALIGN_CENTER);
			Range5.setFont(rangeFont5);
			
			XSSFCell Time = sh1.getRow(i).createCell(4);
			Time.setCellStyle(Range5);
	        Time.setCellValue(GetCurrentDateAndTime());
	        Range5.setFont(rangeFont5);
	        
	        
	      //-----------------------------------------------------------------
	        
	        CellStyle Range6 = wb.createCellStyle();
			Font rangeFont6 = wb.createFont();
			
			if(!winnerText.substring(0,3).equalsIgnoreCase("You"))
			{
				Range6.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
				rangeFont6.setColor(IndexedColors.BLACK.getIndex());
				Range6.setAlignment(CellStyle.ALIGN_CENTER);
				Range6.setFont(rangeFont6);
			}
			
			else
			{
				Range6.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
				rangeFont6.setColor(IndexedColors.GREEN.getIndex());
				Range6.setAlignment(CellStyle.ALIGN_CENTER);
				Range6.setFont(rangeFont6);
			}
			
			XSSFCell Winner = sh1.getRow(i).createCell(5);
			Winner.setCellStyle(Range6);
	        Winner.setCellValue(winnerText);
	        Range6.setFont(rangeFont6);
	        
	        //-----------------------------------------------------------------
	        
	        
	        CellStyle Range7 = wb.createCellStyle();
			Font rangeFont7 = wb.createFont();
			
			Range7.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
			Range7.setFillPattern(CellStyle.SOLID_FOREGROUND);
			rangeFont7.setColor(IndexedColors.BLACK.getIndex());
			Range7.setAlignment(CellStyle.ALIGN_CENTER);
			Range7.setFont(rangeFont7);
			
			XSSFCell bids = sh1.getRow(i).createCell(6);
			bids.setCellStyle(Range7);
			bids.setCellValue(messageTitle);
	        Range7.setFont(rangeFont7);
	    
	       
		
			FileOutputStream fout = new FileOutputStream(new File(newFile1));
			wb.write(fout);
		}
		
		
		if (i==1)
		{
			if(messageTitle.equalsIgnoreCase("Bid Repeated"))
		    {
		    	System.out.println("The Bid is Repeated for"+ "  " + "1.00"+" " + GetCurrentDateAndTime() + " "  + " &&  Your Current Balance is " + countt);
		    }
		    else
		    {
		    	cStars = countt - singlebidAmt ; 
		    	System.out.println("The Bid is done for"+ "  " + "1.00"+" " + GetCurrentDateAndTime() + " "  + " &&  Your Current Balance is " + cStars);
			
		    	countt = cStars;
		    }
		}
		else
		{
			if(messageTitle.equalsIgnoreCase("Bid Repeated"))
		    {
		    	System.out.println("The Bid is Repeated for"+ "  " + "1.01"+" " + GetCurrentDateAndTime() + " "  + " &&  Your Current Balance is " + countt);
		    }
		    else
		    {
		    	cStars = countt - singlebidAmt ; 
		    	System.out.println("The Bid is done for"+ "  " + "1.01"+" " + GetCurrentDateAndTime() + " "  + " &&  Your Current Balance is " + cStars);
			
		    	countt = cStars;
		    }
		}
		
        winnerText = "";
		winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();

		System.out.println(winnerText);

		System.out.println("----------------------------------------------------------------------");
				   
				
	}
	
	public void bidRange(int i) throws IOException, InterruptedException
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

			driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click();

			driver.findElement(By.id("android:id/button1")).click();
			
			System.out.println("The current position of Loop is" +" "+ i);
			

			if(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Placed") || driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText().equalsIgnoreCase("Bid Repeated"))
			{
		
				messageTitle = driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText();
				driver.findElement(By.id("android:id/button1")).click();
				System.out.println(messageTitle);
				
			    cStars = countt - multiplebidAmt;
				
				System.out.println("The Bid is done for" + " " + start1 + " "+ "Rs &" + " " + end1 + " " + "Paise" + " " + "at" + " "+ GetCurrentDateAndTime() + " " +"&&  Your Current Balance is " + cStars);
				
				countt = cStars;
				
				
				winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();
				
				System.out.println(winnerText);
				
			  

				System.out.println("----------------------------------------------------------------------");
			}
			else
			{
				System.out.println(driver.findElement(By.id("in.interactive.luckystars:id/alertTitle")).getText());
				driver.quit();
			}
			
	
			

			File src = new File(newFile1);

			FileInputStream fis = new FileInputStream(src);



			@SuppressWarnings("resource")

			XSSFWorkbook wb = new XSSFWorkbook(fis);



			sh1 = wb.getSheetAt(0);
			
            try
            {
            	
            	
            	
            	CellStyle Range1 = wb.createCellStyle();
    			Font rangeFont1 = wb.createFont();
    			
    			Range1.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    		    Range1.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont1.setColor(IndexedColors.BLACK.getIndex());
    			Range1.setAlignment(CellStyle.ALIGN_CENTER);
    			Range1.setFont(rangeFont1);
    			
    			XSSFCell blank = sh1.getRow(i).createCell(0);
    			blank.setCellStyle(Range1);
    	        blank.setCellValue("");
    	        Range1.setFont(rangeFont1);
            	
            	//-----------------------------------------------------------
    	        
    	        CellStyle Range2 = wb.createCellStyle();
    			Font rangeFont2 = wb.createFont();
    			
    			Range2.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    		    Range2.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont2.setColor(IndexedColors.BLACK.getIndex());
    			Range2.setAlignment(CellStyle.ALIGN_CENTER);
    			Range2.setFont(rangeFont1);
    			
    			XSSFCell Start = sh1.getRow(i).createCell(1);
    			Start.setCellStyle(Range2);
    	        Start.setCellValue(start1);
    	        Range2.setFont(rangeFont2);
            	
            	//-----------------------------------------------------------
            	
    	        CellStyle Range3 = wb.createCellStyle();
    			Font rangeFont3 = wb.createFont();
    			
    			Range3.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    		    Range3.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont3.setColor(IndexedColors.BLACK.getIndex());
    			Range3.setAlignment(CellStyle.ALIGN_CENTER);
    			Range3.setFont(rangeFont3);
    			
    			XSSFCell End = sh1.getRow(i).createCell(2);
    			End.setCellStyle(Range3);
    	        End.setCellValue(end1);
    	        Range3.setFont(rangeFont3);
            	
            	//-----------------------------------------------------------
    	        
    	        
    	        CellStyle Range4 = wb.createCellStyle();
    			Font rangeFont4 = wb.createFont();
    			
    			Range4.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    		    Range4.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont4.setColor(IndexedColors.BLACK.getIndex());
    			Range4.setAlignment(CellStyle.ALIGN_CENTER);
    			Range4.setFont(rangeFont4);
    			
    			XSSFCell Result = sh1.getRow(i).createCell(3);
    			Result.setCellStyle(Range4);
    			Result.setCellValue("Bidded");
    	        Range4.setFont(rangeFont4);
            	
            	//-----------------------------------------------------------
    	        
    	        CellStyle Range5 = wb.createCellStyle();
    			Font rangeFont5 = wb.createFont();
    			
    			Range5.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    		    Range5.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont5.setColor(IndexedColors.BLACK.getIndex());
    			Range5.setAlignment(CellStyle.ALIGN_CENTER);
    			Range5.setFont(rangeFont5);
    			
    			XSSFCell Time = sh1.getRow(i).createCell(4);
    			Time.setCellStyle(Range5);
    			Time.setCellValue(GetCurrentDateAndTime());
    	        Range5.setFont(rangeFont5);
            	
            	//-----------------------------------------------------------
    	        
    	        CellStyle Range6 = wb.createCellStyle();
    			Font rangeFont6 = wb.createFont();
    			
    			if(!winnerText.substring(0,3).equalsIgnoreCase("You"))
    			{
    				Range6.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
    				rangeFont6.setColor(IndexedColors.BLACK.getIndex());
    				Range6.setAlignment(CellStyle.ALIGN_CENTER);
    				Range6.setFont(rangeFont6);
    			}
    			
    			else
    			{
    				Range6.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
    				Range6.setFillPattern(CellStyle.SOLID_FOREGROUND);
    				rangeFont6.setColor(IndexedColors.GREEN.getIndex());
    				Range6.setAlignment(CellStyle.ALIGN_CENTER);
    				Range6.setFont(rangeFont6);
    			}
    			
    			XSSFCell Winner = sh1.getRow(i).createCell(5);
    			Winner.setCellStyle(Range6);
    	        Winner.setCellValue(winnerText);
    	        Range6.setFont(rangeFont6);
    	        
    	        
    	        
    	        //-----------------------------------------------------------------

    	        
    	        CellStyle Range7 = wb.createCellStyle();
    			Font rangeFont7 = wb.createFont();
    			
    			Range7.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
    			Range7.setFillPattern(CellStyle.SOLID_FOREGROUND);
    			rangeFont7.setColor(IndexedColors.BLACK.getIndex());
    			Range7.setAlignment(CellStyle.ALIGN_CENTER);
    			Range7.setFont(rangeFont7);
    			
    			XSSFCell bids = sh1.getRow(i).createCell(6);
    			bids.setCellStyle(Range7);
    			bids.setCellValue(messageTitle);
    	        Range7.setFont(rangeFont7);

            	FileOutputStream fout = new FileOutputStream(new File(newFile1));
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
	
	
	@SuppressWarnings("static-access")
	public void yourBids() throws IOException {

		File src = new File(newFile1);

		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		sh1 = wb.getSheetAt(0);

		driver.findElement(By.id("in.interactive.luckystars:id/btn_bid_value")).click();

		List<String> foo = new ArrayList<String>();

		for (int k = 1; k <= (1100 / 11); k++) 
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
			
			String bidAmt = String.valueOf(foo.get(iCnt)).toString(); 
			String yourBids = bidAmt.substring(1, 8);
			
			
		
			sh1.getRow(iCnt).createCell(7).setCellValue(yourBids);

			FileOutputStream fout = new FileOutputStream(new File(newFile1));
 
			wb.write(fout);

		}

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