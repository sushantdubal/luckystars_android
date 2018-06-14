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

public class privacy_policy_link extends base
{


	@Test(priority = 1, groups = "Sign up")
		public void privacy_policy_link() throws InterruptedException 
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

			// click on privacy & policy
			driver.findElement(By.id("tv_privacy_policy")).click();
			
			
			if (driver.findElements(By.name("Privacy Policy")).size() == 1)
			{
				driver.findElement(By.name("Privacy Policy")).click();
				
			} 	
	
			else {
				
			}
			
			// click on back button of privacy & policy screen
			driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
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
