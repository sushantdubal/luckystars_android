package luckystars;



import io.appium.java_client.android.AndroidDriver;




import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



@Test
public class TC0025_Go_Lucky {



AndroidDriver driver;



@BeforeTest

public void setUp() throws MalformedURLException {



	DesiredCapabilities capabilities = new DesiredCapabilities();
	 capabilities.setCapability("appium-version", "1.0");
	 capabilities.setCapability("platformName", "Android");
	 capabilities.setCapability("platformVersion", "6.0.1");
	 capabilities.setCapability("deviceName", "0123456789ABCDEF");
	 capabilities.setCapability("app", "/Users/Desktop/Lucky_Stars.apk");
	 


driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),

capabilities);

driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);



}



public void Signin_success() throws MalformedURLException,InterruptedException 

{

driver.findElement(By.id("in.interactive.luckystars:id/bt_getStarted")).click();

        driver.findElement(By.id("in.interactive.luckystars:id/input_layout_mobile_no")).sendKeys("9561192140");

        driver.findElement(By.id("in.interactive.luckystars:id/btn_signup")).click();

        driver.findElement(By.id("android:id/button1")).click();

        driver.findElement(By.id("in.interactive.luckystars:id/otpET")).sendKeys("111111");

        

        Thread.sleep(10000);

        

        driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

        driver.findElement(By.id("in.interactive.luckystars:id/img_homeintro")).click();

        

     //   Thread.sleep(2000);



        driver.findElement(By.id("in.interactive.luckystars:id/sd_btn_go_lucky")).click();

       

        String Text = "OK";

String Text1 = "Try Again";

//String sub = driver.findElement(By.id("in.interactive.luckystars:id/btn_submit")).getText();

String sub1 = "Submit";



if(driver.findElements(By.id("in.interactive.luckystars:id/btn_submit")).size() != 0){
System.out.println("Element is Present");
}
else
{
System.out.println("Element is Absent");
}


/*boolean present;

   	if (driver.findElements( By.id("in.interactive.luckystars:id/btn_submit") ).size() != 0) {
    driver.findElement(By.id("in.interactive.luckystars:id/btn_submit")).click();
}
else {
	driver.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).click();
}

*/




boolean goBack = false;


while(!Text.equalsIgnoreCase(Text1))

{

String sub = driver.findElement(By.id("in.interactive.luckystars:id/btn_submit")).getText();

String goBack1 = driver.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).getText();


if (!sub.equalsIgnoreCase(sub1))

{

goBack = driver.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).isDisplayed();

 

if (goBack == true)

{

    driver.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).click();

return;

}

}


driver.findElement(By.id("in.interactive.luckystars:id/rb_first")).click();

driver.findElement(By.id("in.interactive.luckystars:id/btn_submit")).click();


Text1 = driver.findElement(By.id("android:id/button1")).getText();


if(Text.equalsIgnoreCase(Text1))

{

    driver.findElement(By.id("android:id/button1")).click();

    return;

}

else

{

driver.findElement(By.id("android:id/button1")).click();

}

}

   

    driver.findElement(By.id("in.interactive.luckystars:id/btn_go_back")).click();

     

     

     

    /*driver.findElement(By.id("in.interactive.luckystars:id/sd_iv_draw_details")).click();

     

    JavascriptExecutor jse = (JavascriptExecutor)driver;

    jse.executeScript("window.scrollBy(0,250)", "");*/

     

}





@AfterTest

public void teardown() throws Exception {

// driver.quit();

}



}

