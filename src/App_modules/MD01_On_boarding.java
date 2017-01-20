package App_modules;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MD01_On_boarding
{

	AndroidDriver wd;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		
		System.out.println("Krish");
		//Created object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		//Set appium-version desired capability.
		capabilities.setCapability("appium-version", "1.4");
		
		//Set platformName desired capability. It's Android in our case here. 
		capabilities.setCapability("platformName", "Android");
		  
		//Set platformVersion desired capability.  
		capabilities.setCapability("platformVersion", "4.3");
		
		// Set android deviceName desired capability. Set your device name.
		capabilities.setCapability("deviceName", "ZY2224NBCM");
		
		// Set app desired capability. Set your apk path.
		capabilities.setCapability("app", "/Automation Projects/Android Apk 291116/LuckyStars.apk");

		// Created object of RemoteWebwd will all set capabilities.
		// Set appium server address and port number in URL string.
		// It will launch calculator app in android device.
		wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


	}


	@Test
	public void links() 
	{
		// click on get started button
		wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

		// click on terms & conditions
		wd.findElement(By.id("in.interactive.luckystars:id/tv_terms")).click();

		// click on back button of T & C screen
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on privacy & policy
		wd.findElement(By.id("in.interactive.luckystars:id/tv_privacy_policy")).click();

		// click on back button of privacy & policy screen
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on disclaimer
		wd.findElement(By.id("in.interactive.luckystars:id/tv_desc")).click();

		// click on back button of disclaimer
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

		// click on mobile number input line & set number
		wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
		
		// click on continue button
	    wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
	    
	    // click on edit button
	    wd.findElement(By.id("android:id/button2")).click();
	    
	    // click on continue button
	    wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
	    
	    // Confirm message button
	    String msg= wd.findElement(By.id("android:id/message")).getText();
	    
	   Assert.assertEquals(msg, "An SMS with a verification code will be sent to this number.");
	   
	   System.out.print("Asseration passed");
	}
	
	   @Test 
	   public void Signup_Customersupport() 
	   {
	   	wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

	       wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");

	       wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	       wd.findElement(By.id("android:id/button1")).click();

	       wd.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("");
	       
	       wd.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	       
	       wd.findElement(By.id("in.interactive.luckystars:id/resentBtn")).click();
	       
	       wd.hideKeyboard();
	       
	       wd.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	       
	       wd.findElement(By.id("in.interactive.luckystars:id/tv_customer_support")).click();
	       
	       wd.findElement(By.id("in.interactive.luckystars:id/et_feedback_message")).sendKeys("Facing issues with sign up");
	       
	       wd.navigate().back();
	       
	       wd.findElement(By.id("in.interactive.luckystars:id/iv_screen_shot")).click();
	       
	       //Left menu-Winners-Feedback-Permission-allow
	   	wd.findElement(By.name("OK")).click();
	   	    
	   	    //Permission- read & write
	       wd.findElement(By.name("Allow")).click();
	   	    
	   	    //Permissions-
	   	wd.findElement(By.name("Allow")).click();
	   	    
	   	  //Left menu-Winners-Feedback-screenshot from gallery
	   	 wd.findElement(By.name("Gallery")).click();
	   	    
	   	  //Left menu-Winners-Feedback-screenshot from gallery- click on gallery
	   	 wd.findElement(By.name("Gallery")).click();
	   	    
	   	    ////Left menu-Winners-Feedback-screenshot from gallery- click on cancel
	   	 wd.findElement(By.name("Cancel")).click();
	   	    
	   	 wd.findElement(By.name("in.interactive.luckystars:id/btn_submit")).click();
	   	    
	   	 wd.findElement(By.name("in.interactive.luckystars:id/action_edit")).click();
	   	
	     }
	   
	   @Test
	   public void Signup_success() 
	   	{
	   	 
	   	    wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

	   	    wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("99000000467");

	   	    wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	   	    wd.findElement(By.id("android:id/button1")).click();

	   	    wd.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

	   	    wd.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("Sushant");

	   	    wd.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("Dubal");

	   	    wd.navigate().back();

	   	    wd.findElement(By.id("in.interactive.luckystars:id/et_email_id")).sendKeys("sushant2047@interactives.in");

	   	    wd.navigate().back();

	   	    wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

	   	    wd.findElement(By.id("android:id/button1")).click();

	   	    wd.findElement(By.id("in.interactive.luckystars:id/btn_chkfreebies")).click();

	           wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

	           wd.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();
	   	
	   	

	       }


	
	@AfterTest
	public void teardown() throws Exception
	{
		// wd.quit();
	}
}