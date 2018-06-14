package home;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.SizeSequence;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
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
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jna.platform.win32.WinError;
import freemarker.ext.ant.UnlinkedJythonOperationsImpl;
//import home.swipe;



//on boarding class inherits base class
public class bid 
{
	String Text = "OK";
	String Text1 = "Try Again";
	int infoicon;
	Dimension size;
	String goLuckyText;
	String msg;
	String actual =""; 
	String actual1 ="";
	String txtmsg="";
	String err1 = "Oops. Incorrect answer.";
	String err2 = "Oops. Wrong answer. You have one last chance.";
	String err3 = "Sorry :( You have exhausted all the chances to participate in this draw. Try your luck in other draws!.";
	String err4 = "Oops. Wrong answer. You have one last chance..";
	String emailNotVer = "(Not Verified)";
	String err5 = "Loading...";
	String unlockText ="Unlock this bid for 5000 Stars";
	String emailText;
	String num ="1";
	String radio = " //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[5]/android.widget.RadioGroup[1]/"
			+ "android.widget.RadioButton[1]";
	
	String btnTile1 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/"
			+ "android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/"
			+ "android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/"
			+ "android.widget.FrameLayout[1]/android.widget.Button[1]";
	
	String txtUnlock = "UNLOCK";
	String txtGoLucky = "Go Lucky";
	String btnTile1txt ="";
	
	String tile2 = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget."
			   		+ "FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/"
			   		+ "android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.LinearLayout[2]";
	
	
	public String AssignmentEx = "/Users/Documents/Automation/LuckyStars_Android_appium/bid_amount/DataFile1.xlsm";
	//public String excelFileLoc ="/Users/apple/Desktop/Testdata.xlsx";
	
	XSSFWorkbook wb;
	XSSFSheet sh1;
	
	//swipe sp  = new swipe();
	
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
		String version = caps.getCapability("platformVersion").toString();

		driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();
		
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		driver.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).sendKeys("7021217998");

		driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		driver.findElement(By.id("android:id/button1")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");
		
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();
		
		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipe_text")).click();
		driver.findElement(By.id("in.interactive.luckystars:id/tv_swipeview")).click();

		bid();
	 //yourBids();
	
		
	}
	
	
	public void yourBids()
	{
		
		//if(!(driver.findElements(By.id("in.interactive.luckystars:id/tv_title")).size()==1))
		//{
		driver.findElement(By.id("in.interactive.luckystars:id/btn_bid_value")).click();
		//}
	    List<String> foo = new ArrayList<String>();

		
		//Array ar[] ;
		//sp.verticalSwipeBtU(driver);
		for(int k=1;k<=(1100/11);k++)
		{
		List<WebElement> allLinks = driver.findElements(By.id("in.interactive.luckystars:id/tv_bid_price"));

		Iterator<WebElement> itr = allLinks.iterator();
		while(itr.hasNext()) {
	        foo.add(itr.next().getText());

		//System.out.println(itr.next().getText());
		
		
		if(!itr.hasNext()==true)
		{
		//	sp.verticalSwipeBtU(driver);
			//yourBids();
		}
		}
		
		}
		
		  for(int iCnt =0;iCnt<foo.size();iCnt++)
		  {
		   System.out.println(foo.get(iCnt));
		  }

		
	}
	
	
	
	
	public void bid() throws IOException, InterruptedException
		{
		

		File src = new File(AssignmentEx);
		FileInputStream fis = new FileInputStream(src);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		sh1 = wb.getSheetAt(0);

		int k = sh1.getLastRowNum();
		int l = sh1.getPhysicalNumberOfRows();
		
		
		System.out.println(k);
		System.out.println(l);
		
		for (int i = 1; i<=k; i++) 
		{
			if(i>k)
			{
				System.out.println(i);
				driver.close();
			}

	
		
						XSSFCell rs = sh1.getRow(i).getCell(0);
						XSSFCell ps = sh1.getRow(i).getCell(1);
			
			
					  driver.findElement(By.id("in.interactive.luckystars:id/btn_go_unique_bid")).click();
					  driver.findElement(By.id("android:id/button1")).click();
			          //driver.getKeyboard();
			
					  driver.findElement(By.id("in.interactive.luckystars:id/et_rupee")).sendKeys(String.valueOf(rs));
					  
					  if(!(driver.getKeyboard() == null))
					  {
						  driver.navigate().back();
					  }
					  
					  driver.findElement(By.id("in.interactive.luckystars:id/et_paise")).sendKeys(String.valueOf(ps)); 
					  
					  
					  if(!(driver.getKeyboard() == null))
					  {	
						  driver.navigate().back();
					  }
					  
					  driver.findElement(By.id("in.interactive.luckystars:id/btn_ok")).click(); 
					  driver.findElement(By.id("android:id/button1")).click();
					  
					  System.out.println("The Bid is done for"+" "+rs+" "+"Rs &"+ " "+ ps+" "+"Paise"+ " "+ "at"+ " " + GetCurrentDateAndTime());
					  String winnerText = driver.findElement(By.id("in.interactive.luckystars:id/tv_unique_bid_user")).getText();
					  
					  System.out.println(winnerText);
					  System.out.println("----------------------------------------------------------------------");
					  
					  //Thread.sleep(1000);
					  
					  
			  }
		}


	public String GetCurrentDateAndTime()
	{
	
		 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		return date1;
	}  

	   
@AfterTest
	public void teardown() throws Exception 
	{

	driver.quit();
	
	}

}
	

