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

	AndroidDriver wd;

		@BeforeTest
		public void setUp() throws MalformedURLException
			{
			 
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability("appium-version", "1.0");
			 capabilities.setCapability("platformName", "Android");
			 capabilities.setCapability("platformVersion", "6.0.1");
			 capabilities.setCapability("deviceName", "0123456789ABCDEF");
			 capabilities.setCapability("app", "/Users/Desktop/Lucky_Stars.apk");
			  

			 wd = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
			 wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 	
			}
		@Test 
		public void Signin_success() 
		{
		    wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();
		    wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");
		    wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();
		    wd.findElement(By.id("android:id/button1")).click();
		    wd.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");
		    
		    
		    
		}
		
		@Test
		public void signin_leftmenu_myhistory() 
			{
			   	 
			   	//Left menu- Click on Burgar button
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    
			   	    //Left menu-My History
			   	    wd.findElement(By.name("My History")).click();
			   	    
			   	    //Left menu-My History-Click on back button
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			}
		
		@Test
		public void signin_leftmenu_winners() 
			{

			   	    //Left menu- Click on Burgar button
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    
			   	  //Left menu-Winners
			   	    wd.findElement(By.name("Winners")).click();
			   	    
			   	    //winners -Back button
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			}
		
		@Test
		public void signin_leftmenu_feedback() 
			{
			   	  //Left menu- Click on Burgar button
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   		
			   	  //Left menu-Winners-Feedback
			   	    wd.findElement(By.name("Feedback")).click();
			   	    
			   	  //Left menu-Winners-Feedback-type feedback- Its..
			   	    wd.findElement(By.id("in.interactive.luckystars:id/et_feedback_message")).sendKeys("Its very nice app & i won amezon gift of RS- 1000 card from it");
			   	    
			   	    wd.navigate().back();
			   	    
			   	    //Left menu-Winners-Feedback-click on attachment icon
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
			   	    
			   	  //Left menu-Winners-Feedback-screenshot from camera
			   	   // wd.findElement(By.id("in.interactive.luckystars:id/iv_screen_shot")).click();
			   	    
			   	    //wd.findElement(By.name("Camera")).click();
			   	    
			   	     //Send button click
			 	    wd.findElement(By.name("in.interactive.luckystars:id/btn_submit")).click();
			 	    
			 	   	   //close button
			 	    wd.findElement(By.name("in.interactive.luckystars:id/action_edit")).click();
			 	
			   	    
			   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			   	    	    
			}




 @AfterTest
 public void teardown() throws Exception
 {
 // wd.quit();
 }

 }



