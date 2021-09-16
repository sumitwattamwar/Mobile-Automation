package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.drs.apk.BaseClass;

public class Award_Recg extends BaseClass

{

	@Test
    static void Awards_Recognition() throws InterruptedException
    {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[@contentDescription='Community']] and ./*[@id='image_view_tab_icon']]")).click();//menu
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[@contentDescription='Community']] and ./*[@id='image_view_tab_icon']]")).click();//menu
		
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
        driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Medical Associations']]")).click();//Add 
		
       
        
        driver.findElement(By.xpath("//*[@id='edit_text_subtitle_1']")).sendKeys("HEAlth"); //org name
        
   
        
        driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).sendKeys("2015"); //year from
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='2015']")).click(); //select year
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).sendKeys("2020"); //year to
		
		driver.findElement(By.xpath("//*[@id='button_save']")).click(); //save
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel
		
		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back
		Reporter.log("Award_Recognition Added succceessfully",true);
    }
}