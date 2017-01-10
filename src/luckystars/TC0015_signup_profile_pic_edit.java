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

public class TC0015_signup_profile_pic_edit
{

	AndroidDriver driver;
	
@BeforeTest
public void setUp() throws MalformedURLException {
 
 DesiredCapabilities capabilities = new DesiredCapabilities();
 capabilities.setCapability("appium-version", "1.4");
 capabilities.setCapability("platformName", "Android");
 capabilities.setCapability("platformVersion", "4.3");
 capabilities.setCapability("deviceName", "0123456789ABCDEF");
 capabilities.setCapability("app", "/Users/Desktop/Lucky_Stars.apk");
 
 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
 
 }


@Test
public void signup_profile_pic_edit() 
 	{
	   	 	    
	   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
	   		
	   	    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
	   	    
	   	    driver.findElement(By.id("in.interactive.luckystars:id/iv_profilepic")).click();
	   	    
	   	    driver.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
	   		
	   	    /*Left menu-Winners-Feedback-Permission-allow
	   	    driver.findElement(By.name("OK")).click();
	   	    
	   	    //Permission- read & write
	   	    driver.findElement(By.name("Allow")).click();
	   	    
	   	    //Permissions-
	   	    driver.findElement(By.name("Allow")).click();*/
	   	    
	   	  //Left menu-Winners-Feedback-screenshot from gallery
	   	    driver.findElement(By.name("Gallery")).click();
	   	    
	   	  //Left menu-Winners-Feedback-screenshot from gallery- click on gallery
	   	    driver.findElement(By.name("Gallery")).click();
	   	    
	   	    ////Left menu-Winners-Feedback-screenshot from gallery- click on cancel
	   	    driver.findElement(By.name("Cancel")).click();
	   	    
	   	    driver.findElement(By.id("in.interactive.luckystars:id/action_edit")).click();
	   		
	   	    driver.findElement(By.name("Lucky Charms")).click();
	   	 
	   	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[4]/android.widget.ImageView[1]")).click();
	   	    
	   	    driver.findElement(By.id("in.interactive.luckystars:id/btndone")).click();
	   	    
	   	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
	   	    
	   	    driver.findElement(By.name("CONFRIM")).click();
       }

@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}


}