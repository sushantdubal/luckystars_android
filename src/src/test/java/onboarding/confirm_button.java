package onboarding;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import org.openqa.selenium.By;
import config.base;

public class confirm_button extends base
{


	@Test(priority = 1, groups = "Sign up")
		public void confirm_button() throws InterruptedException 
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
			driver.findElement(By.id("et_mobile_no")).sendKeys("9881192140");

			// click on continue button
			driver.findElement(By.id("btn_signup")).click();
				
			
			if (driver.findElements(By.id("button1")).size() == 1)
			{
				//takeScreenShot();
				// clicks on Confirm message button
				driver.findElement(By.id("button1")).click();

				
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
