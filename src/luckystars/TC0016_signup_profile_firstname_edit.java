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

//import luckystars.*;


public class TC0016_signup_profile_firstname_edit
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
public void signup_profile_firstname_edit() 
	{
	    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
		
	    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
	    
	    driver.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("1");
	    
	    driver.navigate().back();
	    
	    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
	   
	    driver.findElement(By.name("CONFRIM")).click();
  	    
	}


@AfterTest
public void teardown() throws Exception
{
// driver.quit();
}
}
