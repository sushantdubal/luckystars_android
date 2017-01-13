package App_modules;



import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MD02_Leftmenu {

	AndroidDriver driver;

		@BeforeTest
		public void setUp() throws MalformedURLException
			{
			 
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability("appium-version", "1.0");
			 capabilities.setCapability("platformName", "Android");
			 capabilities.setCapability("platformVersion", "6.0.1");
			 capabilities.setCapability("deviceName", "0123456789ABCDEF");
			 capabilities.setCapability("app", "/Users/Desktop/Lucky_Stars.apk");
			  

			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
			 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 	
			}
		@Test 
		public void Signin_success() 
		{
		    driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();
		    driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
		    driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
		    driver.findElement(By.id("android:id/button1")).click();
		    driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");
		    
		    
		    
		}
		
		@Test
		public void signin_leftmenu_myhistory() 
			{
			   	 
			   	//Left menu- Click on Burgar button
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    
			   	    //Left menu-My History
			   	    driver.findElement(By.name("My History")).click();
			   	    
			   	    //Left menu-My History-Click on back button
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			}
		
		@Test
		public void signin_leftmenu_winners() 
			{

			   	    //Left menu- Click on Burgar button
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    
			   	  //Left menu-Winners
			   	    driver.findElement(By.name("Winners")).click();
			   	    
			   	    //winners -Back button
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			}
		
		@Test
		public void signin_leftmenu_feedback() 
			{
			   	  //Left menu- Click on Burgar button
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   		
			   	  //Left menu-Winners-Feedback
			   	    driver.findElement(By.name("Feedback")).click();
			   	    
			   	  //Left menu-Winners-Feedback-type feedback- Its..
			   	    driver.findElement(By.id("in.interactive.luckystars:id/et_feedback_message")).sendKeys("Its very nice app & i won amezon gift of RS- 1000 card from it");
			   	    
			   	    driver.navigate().back();
			   	    
			   	    //Left menu-Winners-Feedback-click on attachment icon
			   	    driver.findElement(By.id("in.interactive.luckystars:id/iv_screen_shot")).click();
			   	    
			   	  //Left menu-Winners-Feedback-Permission-allow
			   	    driver.findElement(By.name("OK")).click();
			   	    
			   	    //Permission- read & write
			   	    driver.findElement(By.name("Allow")).click();
			   	    
			   	    //Permissions-
			   	    driver.findElement(By.name("Allow")).click();
			   	    
			   	  //Left menu-Winners-Feedback-screenshot from gallery
			   	    driver.findElement(By.name("Gallery")).click();
			   	    
			   	  //Left menu-Winners-Feedback-screenshot from gallery- click on gallery
			   	    driver.findElement(By.name("Gallery")).click();
			   	    
			   	    ////Left menu-Winners-Feedback-screenshot from gallery- click on cancel
			   	    driver.findElement(By.name("Cancel")).click();
			   	    
			   	  //Left menu-Winners-Feedback-screenshot from camera
			   	   // driver.findElement(By.id("in.interactive.luckystars:id/iv_screen_shot")).click();
			   	    
			   	    //driver.findElement(By.name("Camera")).click();
			   	    
			   	     //Send button click
			 	    driver.findElement(By.name("in.interactive.luckystars:id/btn_submit")).click();
			 	    
			 	   	   //close button
			 	    driver.findElement(By.name("in.interactive.luckystars:id/action_edit")).click();
			 	
			   	    
			   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    	    
			}




 @AfterTest
 public void teardown() throws Exception
 {
 // driver.quit();
 }

 }



