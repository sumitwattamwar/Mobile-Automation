package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Other_Edu extends BaseClass 

{
	
	
	
	@Test
    static void Other_Edu() throws InterruptedException
    {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[@contentDescription='Community']] and ./*[@id='image_view_tab_icon']]")).click();//menu
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[@contentDescription='Community']] and ./*[@id='image_view_tab_icon']]")).click();//menu
		
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
        driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Other Education']]")).click();//Add 
		
        driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Gp"); //Degree Title
        
        driver.findElement(By.xpath("//*[@id='edit_text_subtitle_1']")).sendKeys("JSPM"); //College name
        
        driver.findElement(By.xpath("//*[@id='edit_text_subtitle_2']")).click();
        Thread.sleep(2000);
        
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_2']")).sendKeys("jintur"); //city
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//*[@id='places_autocomplete_list']/*/*[@id='places_autocomplete_prediction_primary_text'])[1]")).click(); //select city
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_3']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_3']")).sendKeys("SPPU"); //university
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).sendKeys("2015"); //year from
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='2015']")).click(); //select year
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).sendKeys("2020"); //year to
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@text='2020']")).click(); //select year
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).sendKeys("Other Education"); //Brief Description
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='button_save']")).click(); //save
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel
		
		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back
		 Reporter.log("Other_Edu Added succceessfully",true);
    }
}
