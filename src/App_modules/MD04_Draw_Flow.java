package App_modules;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Automation_Framework.ExcelTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MD04_Draw_Flow extends ExcelTest {

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

	public static void data(XSSFCell mobile, XSSFCell firstname,XSSFCell lastname, String emailid, XSSFCell otp, XSSFCell postalcode) 
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
		rowCount = rowCount();
		
		for (int i = 0; i <= rowCount; i++) {
			super.exceldata();

			setUp();
			Signin_success();
		}
	}

	@Test
	public void setUp() throws MalformedURLException {

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium-version", "1.4");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("deviceName", "ZY222W9V5J");
		capabilities.setCapability("app", "/Users/Desktop/LuckyStars.apk");

		try 
		{
			wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
			wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void Signin_success() throws MalformedURLException,InterruptedException {
		wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();
		wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys(mobile1.toString());
		wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
		wd.findElement(By.id("android:id/button1")).click();
		wd.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys(otp1.toString());

		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		if (wd.findElements(By.id("in.interactive.luckystars:id/et_first_name")).size() == 1) 
		{
			firsttimeRegistration();
			wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
			wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
		} 
		else 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
			wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

			if (wd.findElements(By.id("in.interactive.luckystars:id/sd_btn_go_lucky")).size() == 1|| 
					wd.findElements(By.id("in.interactive.luckystars:id/cd_btn_go_lucky")).size() == 1
					|| wd.findElements(By.id("in.interactive.luckystars:id/md_btn_go_lucky")).size() == 1
					|| wd.findElements(By.id("in.interactive.luckystars:id/bd_btn_go_lucky")).size() == 1) 
			{
				btnGoLucky();
			}

			else 
			{
			//	wd.findElement(By.id("in.interactive.luckystars:id/iv_ads_knowmore")).click();
				//wd.scrollTo("Disclaimer");
				//verticalSwipeUtD();
				//verticalSwipeDtU();
				horizontalSwipeRtL();
				btnGoLucky();
			}

		}
		wd.quit();

	}

	public void firsttimeRegistration() {
		wd.findElement(By.id("in.interactive.luckystars:id/et_first_name")).clear();
		wd.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys(fname.toString());
		wd.findElement(By.id("in.interactive.luckystars:id/et_last_name")).clear();
		wd.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys(lastname1.toString());
		wd.navigate().back();

		wd.findElement(By.id("in.interactive.luckystars:id/et_email_id")).sendKeys(emailid1);
		wd.navigate().back();

		wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
		wd.findElement(By.id("android:id/button1")).click();

		wd.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click();

		
		  boolean emailmsg =
		  wd.findElement(By.id("android:id/message")).isDisplayed();
		  
		  if(emailmsg==true) 
		  {
		  wd.findElement(By.id("android:id/button1")).click();
		  
		  wd.findElement(By.id("in.interactive.luckystars:id/et_email_id")).clear();
		  wd.findElement(By.id("in.interactive.luckystars:id/et_email_id")).sendKeys("krishna98515362@inetactive.in"); wd.navigate().back();
		  
		  wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click(); 
		  wd.findElement(By.id("android:id/button1")).click();
		  wd.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click(); 
		  }
		  else
		  {
		  wd.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click(); 
		  }
		 
	}

	public void btninfo_Knowmore() throws InterruptedException 
	{
		infoicon = wd.findElements(By.id("in.interactive.luckystars:id/sd_iv_draw_details")).size();

		if (infoicon == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/sd_iv_draw_details")).click();

			Thread.sleep(2000);

			wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
			wd.findElement(By.id("in.interactive.luckystars:id/sd_btn_go_lucky")).click();
		}

		else if (wd.findElements(By.id("in.interactive.luckystars:id/iv_ads_knowmore")).size() == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/iv_ads_knowmore")).click();
			// btnGoLucky();
		}

		else
		{
			wd.findElement(By.id("in.interactive.luckystars:id/md_iv_draw_details")).click();

			wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();
			wd.findElement(By.id("in.interactive.luckystars:id/md_btn_go_lucky")).click();
		}
	}

	public void btnGoLucky() throws InterruptedException {
		if (wd.findElements(By.id("in.interactive.luckystars:id/sd_btn_go_lucky")).size() == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/sd_btn_go_lucky")).click();
			if (wd.findElements(By.id("in.interactive.luckystars:id/submitBtn")).size() == 1) 
			{
				firsttimeProfile();
			} else 
			{
				btnSubmit();
			}
		} else if (wd.findElements(By.id("in.interactive.luckystars:id/md_btn_go_lucky")).size() == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/md_btn_go_lucky")).click();
			if (wd.findElements(By.id("in.interactive.luckystars:id/submitBtn")).size() == 1) 
			{
				firsttimeProfile();
			} else 
			{
				btnSubmit();
			}
		} else if (wd.findElements(By.id("in.interactive.luckystars:id/cd_btn_go_lucky")).size() == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/cd_btn_go_lucky")).click();
			if (wd.findElements(By.id("in.interactive.luckystars:id/submitBtn")).size() == 1) 
			{
				firsttimeProfile();
			} else 
			{
				btnSubmit();
			}
		}

		else if (wd.findElements(By.id("in.interactive.luckystars:id/bd_btn_go_lucky")).size() == 1) 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/bd_btn_go_lucky")).click();
			if (wd.findElements(By.id("in.interactive.luckystars:id/submitBtn")).size() == 1) 
			{
				firsttimeProfile();
			} else 
			{
				btnSubmit();
			}
		}

		else 
		{
			return;
		}
	}

	public void firsttimeProfile() throws InterruptedException {
		wd.findElement(By.id("in.interactive.luckystars:id/et_birthday")).click();
		Thread.sleep(1000);

		// wd.findElement(By.id("in.interactive.luckystars:id/change_date_button")).click();
		wd.findElement(By.id("in.interactive.luckystars:id/et_pincode")).sendKeys(postalcode1.toString());
		wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
		wd.findElement(By.name("CONFIRM")).click();

		btnSubmit();

	}

	public void btnSubmit() {
		int i = wd.findElements(
				By.id("in.interactive.luckystars:id/btn_submit")).size();

		if (i == 1) {
			while (!Text.equalsIgnoreCase(Text1)) {
				if (wd.findElements(By.id("in.interactive.luckystars:id/btn_go_back")).size() == 1) 
				{
					wd.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).click();
					return;
				}

				wd.findElement(By.id("in.interactive.luckystars:id/rb_first")).click();
				wd.findElement(By.id("in.interactive.luckystars:id/btn_submit")).click();

				Text1 = wd.findElement(By.id("android:id/button1")).getText();

				if (Text.equalsIgnoreCase(Text1)) 
				{
					wd.findElement(By.id("android:id/button1")).click();
					return;
				} else 
				{
					wd.findElement(By.id("android:id/button1")).click();

				}
			}
		}

		else 
		{
			wd.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).click();
			return;
		}
	}

	public void notification() throws InterruptedException {
		wd.findElement(By.id("in.interactive.luckystars:id/hotlist_bell")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")).click();

	}
	
	public void horizontalSwipeRtL()
	{
		wd.swipe(0, 990, 164, 0, 3000);
	}

	public void horizontalSwipeLtR()
	{
		wd.swipe(990, 0, 0, 164, 3000);
	}
	
	public void verticalSwipeUtD()
	{
		wd.swipe(-164, -990, 0, 0, 3000);
	}
	
	public void verticalSwipeDtU()
	{
		wd.swipe(-990, -164, 0, 0, 3000);
	}
	
	
	
	@AfterTest
	public void teardown() throws Exception {
		// wd.quit();
	}

	

}
