package luckystars;



import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class TC0003_signin_profile_firstname_edit extends  luckystars.TC0001_Signin_success 
{

	
		@Test
		 public void signin_profile_firstname_edit() 
		 	{
			    driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.ViewGroup[1]/android.widget.ImageButton[1]")).click();
				
			    driver.findElement(By.id("in.interactive.luckystars:id/iv_user_image")).click();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/et_first_name")).sendKeys("1");
			    
			    driver.navigate().back();
			    
			    driver.findElement(By.id("in.interactive.luckystars:id/submitBtn")).click();
			   
			    driver.findElement(By.name("CONFRIM")).click();
		   	    
		 	}
		 



 }



