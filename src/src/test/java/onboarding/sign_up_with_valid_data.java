package onboarding;

import org.testng.Assert;
import org.testng.ITestResult;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.base;


public class sign_up_with_valid_data extends base
{
	

	@Test(priority = 1, groups = "Sign up")
		public void sign_up_with_valid_data() throws InterruptedException 
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
			driver.findElement(By.id("et_mobile_no")).sendKeys("9888345678");  

			// click on continue button
			driver.findElement(By.id("btn_signup")).click();

			// clicks on Confirm message button
			driver.findElement(By.id("button1")).click();

			driver.findElement(By.id("otpET")).sendKeys("111111");

			//Enters first name
			driver.findElement(By.id("et_first_name")).sendKeys("Sushant");

			//Enters last name
			driver.findElement(By.id("et_last_name")).sendKeys("Dubal");

			//Hide Keyboard
			driver.navigate().back();

			//Enters email id
			driver.findElement(By.id("et_email_id")).sendKeys("sushant12451@init.in");

			//Hide Keyboard
			driver.navigate().back();

			driver.findElement(By.id("et_ref_code")).sendKeys("A4XT4NRU");

			//Hide Keyboard
			driver.navigate().back();
			
			// click on continue button
			driver.findElement(By.id("btn_signup")).click();

			// clicks on Confirm message button
			driver.findElement(By.id("button1")).click();

			driver.findElement(	By.id("btn_chkfreebies")).click();

			//allow permission
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

			
			if (driver.findElements(By.id("tv_swipe_text")).size() == 1)
			{
				
				// clicks on first into screen
				driver.findElement(By.id("tv_swipe_text")).click();

			} 	
	
			else {
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
