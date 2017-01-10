package luckystars;



import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC0005_signin_profile_mobileno_emailid {

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
		 


 @AfterTest
 public void teardown() throws Exception
 {
 // driver.quit();
 }

 }



