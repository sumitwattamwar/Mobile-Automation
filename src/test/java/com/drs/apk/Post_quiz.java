package com.drs.apk;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Post_quiz extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Post something here']")).click();//post something
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Create a Quiz']")).click();//Create a Quiz
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Appium Quiz");//title
		
		
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Appium Quiz DES");//DES
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option'])[1]")).sendKeys("op1");//first op
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option'])[2]")).sendKeys("op2");//2nd po
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option' and (./preceding-sibling::* | ./following-sibling::*)[@id='image_view_delete_button']])[1]")).sendKeys("op with cross ");
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option' and (./preceding-sibling::* | ./following-sibling::*)[@id='image_view_delete_button']])[2]")).sendKeys("op with cross2");
		
		driver.findElement(By.xpath("//*[@text='+ ADD OPTION']")).click(); //add op
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option' and (./preceding-sibling::* | ./following-sibling::*)[@id='image_view_delete_button']])[3]")).sendKeys("op5");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='radio_button'])[1]")).click(); //select correct ans
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("courtesy");//courtesy
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();//next
		
		driver.findElement(By.xpath("(//*[@id='layout_tags']/*/*/*/*[@id='text_view_tag'])[1]")).click(); //tag all spec
		
		
		driver.findElement(By.xpath("//*[@text='PUBLISH']")).click(); //publish
		
		
		
    }
	
}
