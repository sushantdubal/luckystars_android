package App_modules;


import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import Automation_Framework.Locators;

public class MD09_FAQs {
	
	MD04_Draw_Flow df;
	
	AndroidDriver wd;
	
		

public void FAQs() throws InterruptedException 

{
	  df = new MD04_Draw_Flow();
	  Automation_Framework.Locators ls = new Automation_Framework.Locators();
	  
	  //wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
	  System.out.println(ls.FAQs);
	  System.out.println(ls.FAQsbackBtn);
	  wd.findElement(By.xpath(ls.FAQs)).click();
	  df.verticalSwipeBtU();
	  
	  Thread.sleep(1000);
	  
	  df.verticalSwipeUtB();
	  
	  wd.findElement(By.xpath(ls.FAQsbackBtn)).click();
	  
}

}
