package com.drs.apk;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Create_Post extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='view_title_button']")).click();//post something
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Create a Post']")).click();//Create a Post
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).sendKeys("Appium Post");//title
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='layout_details' and ./*[@text='Public']]")).click();//privacy
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='POST']")).click();//Post
		Thread.sleep(1000);
		
		
		
		
    }
}