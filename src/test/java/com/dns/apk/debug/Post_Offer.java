package com.dns.apk.debug;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Post_Offer extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='view_title_button']")).click();//post something
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Post Offer']")).click();//Create a Poll
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Appium Offer");//title
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("Offer Des");//Offer Des
		
		
		driver.findElement(By.xpath("")).click();//start date
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//start year
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//change year to 2022
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("")).click();//ok
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("")).click();//start time
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//ok
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//end date
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//end year
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//change year to 2022
		Thread.sleep(1000);
	
		
		driver.findElement(By.xpath("")).click();//ok
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("")).click();//end time
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//ok
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("")).click();//next
		Thread.sleep(1000);
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("ssw")).sendKeys("seller name");//seller name
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("8421222768")).sendKeys("Appium seller phone");//Appium seller phone
		
		driver.findElement(By.xpath("")).sendKeys("8421222768");//Appium seller wp
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).sendKeys("ssw@gmail.com");//Appium seller email
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("")).click();//next
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//tag
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("")).click();//publish
		Thread.sleep(2000);
		
		  Reporter.log("Successfully posted offer",true);
		
    }
}
