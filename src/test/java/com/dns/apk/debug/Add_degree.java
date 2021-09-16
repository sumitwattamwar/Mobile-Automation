
//Verified with ui automator

package com.dns.apk.debug;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Add_degree extends BaseClass {
	@Test
	static void Edit_Profile() throws InterruptedException
	{
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.healthpole.doctors.debug:id/item_profile_menu']")).click();//View_profile
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.healthpole.doctors.debug:id/button_edit_profile']")).click(); //edit profile
		

		//Scrolling

		Thread.sleep(1000);
	    util.VScroll();
	    
	    Thread.sleep(1000);
	    util.VScrollmin();

        Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Edit')]")).click(); //Edit mbbs
		                             
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_1')]")).clear();

		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_1')]")).sendKeys("JSPM RSCOE,Tathwade"); //college name


		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_2')]")).clear(); //city

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_2')]")).sendKeys("jintur"); //city


		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_3')]")).clear();


		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_3')]")).sendKeys("SPPU"); //university


		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_from_date')]")).clear();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_from_date')]")).sendKeys("2015"); //year from


		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_to_date')]")).clear();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_to_date')]")).sendKeys("2020"); //year to

		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_description')]")).clear();
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_description')]")).sendKeys("Physician"); //Brief Description

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_save')]")).click(); //save

		Thread.sleep(1000);

		//driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_cancel')]")).click(); //cancel

		//driver.findElement(By.xpath("//android.widget.ImageButton[contains(@index,'1')]")).click();//back

		Reporter.log("Profile Medical title Updated succceessfully",true);
	}
}