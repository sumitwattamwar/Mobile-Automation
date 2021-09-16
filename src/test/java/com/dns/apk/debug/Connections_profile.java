//verified

package com.dns.apk.debug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Connections_profile extends BaseClass {
	@Test
    static void Edit_Profile() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='image_view_tab_icon' and ./parent::*[./parent::*[./parent::*[@contentDescription='Menu']]]]")).click();//menu
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='button_edit_profile']")).click(); //edit profile
		
		Thread.sleep(1000);
		
	    util.VScroll();
	    
	   
			
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='text_view_button_see_all']")).click(); // connections see all 
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='action_filter']")).click(); //filter 
		
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='First Name']")).click(); //by_first_name or (//*[@class='android.widget.ListView']/*/*/*/*[@id='title'])[1]
		
		
	    Reporter.log("connections filtered_by_first_name",true);
		 
	    
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='action_filter']")).click(); //filter 
	    
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Recently added']")).click(); //filter_by_recently_added or (//*[@class='android.widget.ListView']/*/*[@id='content'])[2]
		
		Thread.sleep(2000);
		Reporter.log("connections filtered_by_recently_added",true);
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click(); //back
		
		
		
    }
}
