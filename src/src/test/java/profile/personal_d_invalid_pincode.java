package profile;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import config.base;

public class personal_d_invalid_pincode extends base
{
	
	@Test(priority = 1, groups = "Profile")
	public void personal_d_invalid_pincode() throws InterruptedException 
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

		// clicks on second into screen
		driver.findElement(By.id("tv_swipeview")).click();

		//Left menu- Click on menu button
		driver.findElement(By.id("iv_settings")).click();

		//Click user name
		driver.findElement(By.id("tv_name")).click();
		
		Thread.sleep(1000);
	    driver.findElement(By.id("et_birthday")).click();
	    List<WebElement> date = driver.findElements(By.className("android.widget.NumberPicker"));
	    date.get(0).sendKeys("17");
	    date.get(1).sendKeys("Apr");
	    date.get(2).sendKeys("1972");  
	  
	   Actions action=new Actions(driver);
	   action.sendKeys("Enter").sendKeys(Keys.ENTER).build().perform(); 
	   driver.findElement(By.name("Ok")).click();
	   // driver.findElement(By.id(lp.changeDate)).click();
	   
	   driver.findElement(By.id("et_pincode")).click();
		
		driver.findElement(By.id("et_pincode")).clear();
		
		driver.findElement(By.id("et_pincode")).sendKeys("111111");
		driver.navigate().back();
		
		driver.scrollToExact("SAVE");
		
		driver.findElement(By.id("submitBtn")).click();
		
		driver.findElement(By.id("button1")).click();
	
		driver.findElement(By.id("button1")).click();

		if (driver.findElements(By.name("Invalid postal code, please enter valid postal code.")).size() == 1)
		{

			
			
			driver.findElement(By.id("android:id/button1")).click();
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
