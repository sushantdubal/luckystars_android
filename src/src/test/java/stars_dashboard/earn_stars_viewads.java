package stars_dashboard;
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
public class earn_stars_viewads extends base
{
	
	@Test(priority = 1, groups = "Stars dashboard")
	public void earn_stars_viewads() throws InterruptedException 
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
		
		// clicks stars-icon
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.ImageView[1]")).click();
	   	
		// clicks on first into screen
		//driver.findElement(By.id("in.interactive.luckystars:id/img_dashboard_intro")).click();
		
		driver.findElement(By.id("in.interactive.luckystars:id/tv_earncoin_viewall")).click();
		
		
		
		/*driver.findElement(By.id("in.interactive.luckystars:id/iv_product_image")).click();
		
		Thread.sleep(300000);
	
		 
		if (driver.findElements((By.name("Ok"))).size() == 1)
		{
			driver.findElement(By.name("Ok")).click();
		} 

		*/
			
	
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
