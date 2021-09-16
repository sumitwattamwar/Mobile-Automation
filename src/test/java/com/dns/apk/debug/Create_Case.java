package com.dns.apk.debug;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Create_Case extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Post something here']")).click();//post something
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='grid_layout']/*/*[@id='image_view'])[2]")).click();//Create a Case
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Appium Case Post");//title
		
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Case desc");// desc
		
		
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("inst");//inst
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='layout_tags']/*/*/*/*[@id='text_view_tag'])[1]")).click();//tag
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='toolbar_button_next']")).click();//publish
		Thread.sleep(1000);
    }
}