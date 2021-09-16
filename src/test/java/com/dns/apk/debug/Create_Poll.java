package com.dns.apk.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.time.Duration;


public class Create_Poll extends BaseClass  {
	@Test
    static void Edit_Bio() throws InterruptedException
    {
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='view_title_button']")).click();//post something
		
		
		Thread.sleep(100);
		driver.findElement(By.xpath("(//*[@id='grid_layout']/*/*[@id='text_view_title'])[4]")).click();//Create a Poll
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).sendKeys("Appium Poll");//title
		
		Thread.sleep(100);
		
		Dimension dimension = driver.manage().window().getSize();
		
		int start_x = (int) (dimension.width*0.5);
		int start_y = (int) (dimension.height*0.4);
		
		int end_x = (int) (dimension.width*0.5);
		int end_y = (int) (dimension.height*0.2);
		
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x,start_y))
	 
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		
		

		
		Thread.sleep(100);
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option'])[1]")).sendKeys("op 1");//op1
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@id='layout_options']/*/*[@id='edit_text_option'])[2]")).sendKeys("op 2");//op2
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='ADD OPTION']")).click();//add option
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_option' and (./preceding-sibling::* | ./following-sibling::*)[@id='image_view_delete_button']]")).sendKeys("Appium op");//op3
		
		
		TouchAction touch1 = new TouchAction(driver);
		touch1.press(PointOption.point(start_x,start_y))
	 
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_end_date']")).click();//select date
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='2021']")).click();//year
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='2022']")).click();//year 2022
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='OK']")).click();//ok
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='DONE']")).click();//Done
		Thread.sleep(1000);
		
		  Reporter.log("Successfully posted poll",true);
    }
}