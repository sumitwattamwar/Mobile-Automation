//vrified
package com.drs.apk;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Add_Specialization extends BaseClass {
	@Test
    static void Edit_Profile() throws InterruptedException
    {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='image_view_tab_icon' and ./parent::*[./parent::*[./parent::*[@contentDescription='Menu']]]]")).click();//menu
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='button_edit_profile']")).click(); //edit profile
		
		
		Thread.sleep(100);
	    util.VScroll();
	    
	   
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='text_view_edit']")).click(); //add specialization
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checkbox_button' and (./preceding-sibling::* | ./following-sibling::*)[@text='Child psychiatry']]")).click(); //edit specialization-Child psychiatry check
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='DONE']")).click(); //edit specialization-Child psychiatry-done
		
		
		Thread.sleep(1000);
		
		
		 Reporter.log("Profile specialization Updated succceessfully",true);
    }
}