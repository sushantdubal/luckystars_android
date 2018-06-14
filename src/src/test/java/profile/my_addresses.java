package profile;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import config.base;


//on boarding class inherits base class
public class my_addresses extends base
{
	

	@Test(priority = 1, groups = "Left menu")
	public void my_addresses() throws InterruptedException 
	{
		
		try 
		 {
			//call setup method
			super.setUp();
		 } 
		 catch (MalformedURLException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		// click on Skip Intro button
		driver.findElement(By.id("bt_getStarted")).click();

		//allow permission
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		// click on mobile number input line & set number
		driver.findElement(By.id("et_mobile_no")).sendKeys("9561192140");

		// click on continue button
		driver.findElement(By.id("btn_signup")).click();

		// clicks on Confirm message button
		driver.findElement(By.id("button1")).click();

		driver.findElement(By.id("otpET")).sendKeys("111111");

		//allow permission
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		// clicks on first into screen
		driver.findElement(By.id("tv_swipe_text")).click();

		// clicks on first into screen
		driver.findElement(By.id("tv_swipeview")).click();

		//Left menu- Click on menu button
		driver.findElement(By.id("iv_settings")).click();


		if (driver.findElements(By.id("tv_address")).size() == 1)
		{

			driver.findElement(By.id("tv_address")).click();
			
			/*if (driver.findElements(By.id("btn_add_address")).size() == 1)
			{
				driver.findElement(By.id("btn_add_address")).click();
				
				driver.findElement(By.id("et_user_address")).click();
				
				driver.findElement(By.id("et_user_address")).sendKeys("1st Floor capri building");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_locality")).click();
				
				driver.findElement(By.id("et_user_locality")).sendKeys("Bandra");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_city")).click();
				
				driver.findElement(By.id("et_user_city")).sendKeys("Mumbai");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_state")).click();
				
				driver.findElement(By.id("et_user_state")).sendKeys("Maharashtra");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_pin")).click();
				
				driver.findElement(By.id("et_user_pin")).sendKeys("400705");

				driver.navigate().back();
				
				driver.scrollTo("SAVE");
				
				driver.findElement(By.name("SAVE")).click();
				
				driver.findElement(By.id("txt_new_address")).click();
				
				driver.findElement(By.id("et_user_address")).click();
				
				driver.findElement(By.id("et_user_address")).sendKeys("1st Sayali building");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_locality")).click();
				
				driver.findElement(By.id("et_user_locality")).sendKeys("Nerul");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_city")).click();
				
				driver.findElement(By.id("et_user_city")).sendKeys("Navi Mumbai");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_state")).click();
				
				driver.findElement(By.id("et_user_state")).sendKeys("Maharashtra");
				
				driver.navigate().back();
				
				driver.findElement(By.id("et_user_pin")).click();
				
				driver.findElement(By.id("et_user_pin")).sendKeys("400700");

				driver.scrollTo("SAVE");
				
				driver.findElement(By.name("SAVE")).click();
				
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
			
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();

			
			
			}
			
*/			
		}
		else
			{
				driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			}
			
			
		try
		{
			//call tear down method
			super.teardown();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		} 


			


	

}
