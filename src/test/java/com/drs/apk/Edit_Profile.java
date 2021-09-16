package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Edit_Profile extends BaseClass 

{
	@Test
    static void Edit_Bio() throws InterruptedException
    {
			
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='image_view_tab_icon' and ./parent::*[./parent::*[./parent::*[@contentDescription='Menu']]]]")).click();//menu
		
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='item_profile_menu']")).click();//View_profile
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='button_edit_profile']")).click(); //edit profile
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='button_edit_bio']")).click(); //edit bio
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_fname']")).sendKeys("Appium");//first name
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_mname']")).sendKeys("User");//middle name
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_lname']")).sendKeys("SW");//last name
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_1']")).sendKeys("Automator");//HeadLine
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_2']")).sendKeys("Buster");//Medical Title
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_3']")).sendKeys("jintur");//city
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("(//*[@id='places_autocomplete_list']/*/*[@id='places_autocomplete_prediction_primary_text'])[1]")).click();//select
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='edit_text_subtitle_4']")).sendKeys("QA Engineer");//professional summary
		
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='button_save']")).click(); //save
		
		/*ActualString=  driver.findElement(By.xpath("//*[@text='Dr. Appium User Sw']")).getText();
	    Expected String  = Dr. Appium User Sw*/
		
		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel
		
	    Reporter.log("Profile Bio Updated succceessfully",true);
    }
	
	
	 }

