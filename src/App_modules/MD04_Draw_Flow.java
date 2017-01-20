package App_modules;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//import javafx.scene.control.DatePicker;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.xmlbeans.XmlBeans;

public class MD04_Draw_Flow {
	
	Automation_Framework.Locators ls = new Automation_Framework.Locators();
	ExcelTest et;

	AndroidDriver wd;
	String Text = "OK";
	String Text1 = "Try Again";
	int infoicon;
	Dimension size;
	static XSSFCell mobile1;
	static XSSFCell fname;
	static XSSFCell lastname1;
	static String emailid1;
	static XSSFCell otp1;
	static XSSFCell postalcode1;
	int rowCount;
	String goLuckyText;
	String msg;
	

	public static void data(XSSFCell mobile, XSSFCell firstname,XSSFCell lastname, 
			String emailid, XSSFCell otp, XSSFCell postalcode) 
	{
		mobile1 = mobile;
		fname = firstname;
		lastname1 = lastname;
		emailid1 = emailid;
		otp1 = otp;
		postalcode1 = postalcode;
	}

	@BeforeTest
	public void forallUsers() throws MalformedURLException,InterruptedException 
	{
		et = new ExcelTest();
		
		for (int i = 0; i <= rowCount; i++) 
		{
			et.exceldata();
			rowCount = et.rowCount();
	
		}
	}

	@Test
	public void setUp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "0123456789ABCDEF");
		capabilities.setCapability("app","/Users/sushantdubal/Desktop/AndroidApp/LuckyStars.apk");

		try 
		{
			wd = new AndroidDriver(new URL(ls.url),capabilities);
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}

		catch (Exception e) 
		{	
			System.out.println(e.getMessage());			
		}

	}

	@Test
	public void Signin_success() throws MalformedURLException,InterruptedException {
		wd.findElement(By.id(ls.getStarted)).click();
		wd.findElement(By.id(ls.mobileNo)).sendKeys(mobile1.toString());
		wd.findElement(By.id(ls.signUp)).click();
		wd.findElement(By.id(ls.androidBtn)).click();
		wd.findElement(By.id(ls.OTP)).sendKeys(otp1.toString());

		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		wd.findElement(By.id(ls.intro)).click();
		wd.findElement(By.id(ls.intro)).click();
		firsttimeProfile();
	

		//Checking for new user and redirecting it to profile screen
		if (wd.findElements(By.id(ls.firstName)).size() == 1) 
		{
			firsttimeRegistration();
			wd.findElement(By.id(ls.intro)).click();
			wd.findElement(By.id(ls.intro)).click();
		} 
		else 
		{
			wd.findElement(By.id(ls.intro)).click();
			wd.findElement(By.id(ls.intro)).click();

			if (wd.findElements(By.id(ls.SDraw)).size() == 1|| 
				wd.findElements(By.id(ls.CDraw)).size() == 1||
				wd.findElements(By.id(ls.MDraw)).size() == 1||
				wd.findElements(By.id(ls.BDraw)).size() == 1) 
				{
					btnGoLucky();
				}

			//checking the info button is appearing on the tile
			else if(wd.findElements(By.id(ls.infoBtn)).size() == 1)	
			
				{
					wd.findElement(By.id(ls.infoBtn)).click();
					Thread.sleep(1000);
					
					wd.findElement(By.xpath(ls.bckButton)).click();
					horizontalSwipeRtL();	
					btnGoLucky();
				
				}
			
			else if(wd.findElements(By.id(ls.knowmoreBtn)).size()==1)
				{
					btninfo_Knowmore();
					horizontalSwipeRtL();
					btnGoLucky();
				}
				
				//Swiping through the tiles.
					horizontalSwipeRtL();	
					btnGoLucky();
		}

	wd.quit();

	}

	public void firsttimeRegistration() {
		wd.findElement(By.id(ls.firstName)).clear();
		wd.findElement(By.id(ls.firstName)).sendKeys(fname.toString());
		wd.findElement(By.id(ls.lastName)).clear();
		wd.findElement(By.id(ls.lastName)).sendKeys(lastname1.toString());
		wd.navigate().back();

		wd.findElement(By.id(ls.emailidString)).sendKeys(emailid1);
		wd.navigate().back();

		wd.findElement(By.id(ls.signUp)).click();
		wd.findElement(By.id(ls.androidBtn)).click();

		wd.findElement(By.id(ls.freebies)).click();

		
		boolean emailmsg = wd.findElement(By.id(ls.androidBtn)).isDisplayed();
		  
		  if(emailmsg==true) 
		  {
		  wd.findElement(By.id(ls.androidBtn)).click();
		  
		  wd.findElement(By.id(ls.emailidString)).clear();
		  wd.findElement(By.id(ls.emailidString)).sendKeys(ls.otherEmail);
		  wd.navigate().back();
		  
		  wd.findElement(By.id(ls.signUp)).click(); 
		  wd.findElement(By.id(ls.androidBtn)).click();
		  wd.findElement(By.id(ls.freebies)).click(); 
		  }
		  else
		  {
		  wd.findElement(By.id(ls.freebies)).click(); 
		  }
		 
	}

	public void btninfo_Knowmore() throws InterruptedException 
	{
		wd.findElement(By.id(ls.knowmoreBtn)).click();
		//horizontalSwipeLtR();
		
		wd.scrollTo("Disclaimer");
		wd.scrollTo("Exit");
		
		wd.findElement(By.id(ls.exitBtn)).click();
		wd.findElement(By.id(ls.androidBtn)).click();
	}

	
	
	public void btnGoLucky() throws InterruptedException {
		if (wd.findElements(By.id(ls.SDraw)).size() == 1) 
		{
			wd.findElement(By.id(ls.SDraw)).click();
			if (wd.findElements(By.xpath(ls.profileSubmit)).size() == 1) 
			{
				firsttimeProfile();
			} 
			else 
			{
				btnSubmit();
			}
		} 
		else if (wd.findElements(By.id(ls.MDraw)).size() == 1) 
		{
			wd.findElement(By.id(ls.MDraw)).click();
			if (wd.findElements(By.id(ls.profileSubmit)).size() == 1) 
			{
				firsttimeProfile();
			} 
			else 
			{
				btnSubmit();
			}
		} 
		else if (wd.findElements(By.id(ls.CDraw)).size() == 1) 
		{
			wd.findElement(By.id(ls.CDraw)).click();
			if (wd.findElements(By.id(ls.profileSubmit)).size() == 1) 
			{
				firsttimeProfile();
			} 
			else 
			{
				btnSubmit();
			}
		}

		else if (wd.findElements(By.id(ls.BDraw)).size() == 1) 
		{
			wd.findElement(By.id(ls.BDraw)).click();
			if (wd.findElements(By.id(ls.profileSubmit)).size() == 1) 
			{
				firsttimeProfile();
			} 
			else 
			{
				btnSubmit();
			}
		}

		else 
		{
			horizontalSwipeLtR();
			btnGoLucky();
		}
	}

	public void firsttimeProfile() throws InterruptedException
	{
	//	wd.findElement(By.id(ls.birthday)).sendKeys("16/5/1987");
		
		// dt = (DatePicker) wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/"
		//		+ "android.widget.LinearLayout[1]"));DatePicker
		
		//System.out.println(dt);
	
		
		
		Thread.sleep(1000);
		
		
	    wd.findElement(By.id(ls.changeDate)).click();
	    
	    
		wd.findElement(By.id(ls.postalCode)).sendKeys(postalcode1.toString());
		wd.findElement(By.id(ls.profileSubmit)).click();
		wd.findElement(By.name("CONFIRM")).click();

		btnSubmit();

	}

	public void btnSubmit() {
		int i = wd.findElements(
				By.id(ls.submitBtn)).size();

		if (i == 1) {
			while (!Text.equalsIgnoreCase(Text1)) {
				if (wd.findElements(By.id(ls.gobackBtn)).size() == 1) 
				{
					wd.findElement(By.id(ls.gobackBtn)).click();
					break;
				}

				wd.findElement(By.id(ls.radio)).click();
				wd.findElement(By.id(ls.submitBtn)).click();

				Text1 = wd.findElement(By.id(ls.androidBtn)).getText();

				if (Text.equalsIgnoreCase(Text1)) 
				{
					wd.findElement(By.id(ls.androidBtn)).click();
					break;
				}	else 
				{
					wd.findElement(By.id(ls.androidBtn)).click();

				}
			}
		}

		else 
		{
			wd.findElement(By.id(ls.gobackBtn)).click();
			return;
		}
	}
	
	public void notification() throws InterruptedException 
	{
		//wd.findElement(By.id(ls.notif)).click();
		Thread.sleep(2000);	
	    verticalSwipeBtU();
	    horizontalSwipeLtR();
	    horizontalSwipeRtL();
	    verticalSwipeUtB();
	        
		//wd.findElement(By.xpath(ls.notifBack)).click();

	}
	
	
	public void horizontalSwipeRtL()
	{
		wd.swipe(0, 990, 164, 0, 3000);
	}

	public void verticalSwipeBtU()
	{
		wd.swipe(0, 0, 0, 264, 3000);
	}
	
	public void horizontalSwipeLtR()
	{
		wd.swipe(500, 0, 900,0, 3000);
	}	
	
	public void verticalSwipeUtB()
	{
		wd.swipe(0, 264, 0, 0, 3000);
	}
	
	
	
	@AfterTest
	public void teardown() throws Exception {
		// wd.quit();
	}

}
