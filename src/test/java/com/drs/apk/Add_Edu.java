//Verified
package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add_Edu extends BaseClass 

{


	@Test
	static void Add_Edu() throws InterruptedException
	{

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='image_view_tab_icon' and ./parent::*[./parent::*[./parent::*[@contentDescription='Menu']]]]")).click();//menu
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='button_edit_profile']")).click(); //edit profile
		
		Thread.sleep(100);
	    util.VScroll();
	    
	    Thread.sleep(100);
	    util.VScrollmin();
	   

      	driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Additional Medical Education']]")).click();//Add 

		driver.findElement(By.xpath("//*[@id='edit_text_title']")).sendKeys("MD"); //Degree Title

		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_1']")).sendKeys("JSPM"); //College name

		
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_2']")).sendKeys("jintur"); //city
		

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_3']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_3']")).sendKeys("SPPU"); //university
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_from_date']")).sendKeys("2015"); //year from
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).clear();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_to_date']")).sendKeys("2020"); //year to

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).clear();
		driver.findElement(By.xpath("//*[@id='edit_text_description']")).sendKeys("Physician"); //Brief Description
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='button_save']")).click(); //save
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel

		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back
		
		Reporter.log("Edu Added succceessfully",true);
	}
}