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

public class disclaimer_link extends base
{

	@Test(priority = 1, groups = "Sign up")
		public void disclaimer_link() throws InterruptedException 
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

			// click on disclaimer
			driver.findElement(By.id("tv_desc")).click();
			
			
			if (driver.findElements(By.name("Disclaimer")).size() == 1)
			{
				
				driver.findElement(By.name("Disclaimer")).click();;
				
			} 	
	
			else {
				
			}
			
			// click on back button of disclaimer
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
