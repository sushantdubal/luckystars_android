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

public class Valid_OTP extends base
{

	
	@Test(priority = 1, groups = "Sign up")
		public void Valid_OTP() throws InterruptedException 
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
			driver.findElement(By.id("et_mobile_no")).sendKeys("9559559552");

			// click on continue button
			driver.findElement(By.id("btn_signup")).click();

			// clicks on Confirm message button
			driver.findElement(By.id("button1")).click();

			driver.findElement(By.id("otpET")).sendKeys("111111");


			if (driver.findElements(By.id("et_first_name")).size() == 1)
			{

				
				driver.findElement(By.id("et_first_name")).click();
					
			} 	
	
			else 
			{
				
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
