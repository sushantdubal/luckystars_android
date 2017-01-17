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
	AndroidDriver wd;
	
	
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
		
		
	         
		   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
		   		
		   	    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/iv_profilepic")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
		   		
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
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
		   		
		   	    wd.findElement(By.name("Lucky Charms")).click();
		   	 
		   	    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[4]/android.widget.ImageView[1]")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/btndone")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
		   	    
		   	    wd.findElement(By.name("CONFRIM")).click();
	       }
		
		 @Test
		 public void signin_profile_firstttname_edit() 
		 	{
			    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("1");
		   	    
			    wd.navigate().back();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    wd.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_lasttname_edit() 
		 	{
			    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_last_name")).sendKeys("1");
		   	    
			    wd.navigate().back();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    wd.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_mobileno_emailid() 
		 	{
		 
			 	wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).click();
		   	    
		   	    wd.findElement(By.name("OK")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/et_email_id")).click();
		   	    
		   	    wd.findElement(By.name("OK")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
			    wd.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_birthdate() 
		 	{
			    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_birthday")).click();
			    
			    wd.findElement(By.id("android:id/date_picker_header_year")).click();
			    
			    wd.scrollTo("2008");
			    
			    wd.scrollTo("1999");
			    
			    wd.findElement(By.name("1999")).click();
				   
			    wd.findElement(By.name("OK")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_pincode")).sendKeys("400900");
		   	    
		   	    wd.navigate().back();
		   	    
			    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    wd.findElement(By.name("CONFRIM")).click();

			    
		 	}
		 
		 @Test
		 public void signin_profile_gender() 
		 	{
			    wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/radioMale")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/radioFemale")).click();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    wd.findElement(By.name("CONFRIM")).click();
		 	}
		 
		 @Test
		 public void signin_profile_pincode() 
		 	{
			 	wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    wd.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    wd.findElement(By.id("in.interactive.luckystars:id/et_pincode")).sendKeys("400900");
		   	    
		   	    wd.navigate().back();
		   	    
		   	    wd.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			    
		   	    wd.findElement(By.name("CONFRIM")).click();
		   	    
		   	    
		 	}
		 
		 @Test 

		 public void Signup_changenumber() 
		 {
		 	wd.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

		     wd.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9900000045");

		     wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		     wd.findElement(By.id("android:id/button1")).click();

		     wd.findElement(By.id("in.interactive.luckystars:id/changebtn")).click();
		     
		     wd.findElement(By.id("in.interactive.luckystars:id/et_mobile_no")).sendKeys("9900000046");
		     
		     wd.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

		     wd.findElement(By.id("android:id/button1")).click();

		     wd.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

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





