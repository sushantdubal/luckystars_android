package App_modules;



import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import Automation_Framework.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MD03_Profile extends setup {
	AndroidDriver driver;
	
	
	@BeforeTest
    public void setUp() throws MalformedURLException
    {
    	super.setUp();
    	
    }

	 @Test(priority=1)
		public void Signup_success() 
	    
		{
	    	super.Signup_success();
	    	
	    	 		    
 	}
		@Test(priority=2)	
		public void signin_profile_pic_edit() 
	 	{
		
		
	         
		   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
		   		
		   	    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/iv_profilepic")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
		   		
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
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
		   		
		   	    driver.findElement(By.name("Lucky Charms")).click();
		   	 
		   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[4]/android.widget.ImageView[1]")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/btndone")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
		   	    
		   	    driver.findElement(By.name("CONFRIM")).click();
	       }
		
		 @Test
		 public void signin_profile_firstttname_edit() 
		 	{
			    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("1");
		   	    
			    driver.navigate().back();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    driver.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_lasttname_edit() 
		 	{
			    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("1");
		   	    
			    driver.navigate().back();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    driver.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_mobileno_emailid() 
		 	{
		 
			 	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).click();
		   	    
		   	    driver.findElement(By.name("OK")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/et_email_id")).click();
		   	    
		   	    driver.findElement(By.name("OK")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    driver.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_birthdate() 
		 	{
			    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_birthday")).click();
			    
			    driver.findElement(By.id("android:id/date_picker_header_year")).click();
			    
			    driver.scrollTo("2008");
			    
			    driver.scrollTo("1999");
			    
			    driver.findElement(By.name("1999")).click();
				   
			    driver.findElement(By.name("OK")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_pincode")).sendKeys("400900");
		   	    
		   	    driver.navigate().back();
		   	    
			    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    driver.findElement(By.name("CONFRIM")).click();

			    
		 	}
		 
		 @Test
		 public void signin_profile_gender() 
		 	{
			    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/radioMale")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/radioFemale")).click();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    driver.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_pincode() 
		 	{
			 	driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_pincode")).sendKeys("400900");
		   	    
		   	    driver.navigate().back();
		   	    
		   	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    driver.findElement(By.name("CONFRIM")).click();
		   	    
		   	    
		 	}
		 
		 @Test 

		 public void Signup_changenumber() 
		 {
		 	driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

		     driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9900000045");

		     driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		     driver.findElement(By.id("android:id/button1")).click();

		     driver.findElement(By.id("in.interactive.luckystars:id/changebtn")).click();
		     
		     driver.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).sendKeys("9900000046");
		     
		     driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		     driver.findElement(By.id("android:id/button1")).click();

		     driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

		 }
		 
	
		   
		    
		    public void takeScreenShot()
		    {
		    super.takeScreenShot();	
		    	 
		    }
		    				

	 @AfterTest
			public void teardown() throws Exception
			{
		 			super.teardown();
					 
			 }
	 }





