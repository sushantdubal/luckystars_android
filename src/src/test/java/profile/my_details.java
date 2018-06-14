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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import config.base;

public class my_details extends base
{


	@Test(priority = 1, groups = "Left menu")
	public void additional_details() throws InterruptedException 
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
		
		driver.findElement(By.id("in.interactive.luckystars:id/cb_age_restriction")).click();

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
				
		if (driver.findElements(By.id("tv_details")).size() == 1)
		{
			//left menu- click my details
			driver.findElement(By.id("tv_details")).click();

			//driver.findElement(By.id("text_additional")).click();
			
			driver.findElement(By.id("radio_single")).click();
			driver.findElement(By.id("radio_four_wheeler")).click();
			
			driver.findElement(By.id("tv_occupation")).click();

			driver.findElement(By.id("select_dialog_listview"));
			
			
			WebElement select = driver.findElement(By.id("in.interactive.luckystars:id/select_dialog_listview"));
			WebElement options = select.findElement(By.id("android:id/text1"));
			options.click();
			
			driver.findElement(By.id("tv_education")).click();
			
			WebElement select1 = driver.findElement(By.id("select_dialog_listview"));
			WebElement options1 = select1.findElement(By.id("android:id/text1"));
			options1.click();
			
			driver.findElement(By.id("submitBtn")).click();
			
			
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
