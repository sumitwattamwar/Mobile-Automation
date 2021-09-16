//Verified with ui automator
package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test 
public class Work_Exp extends BaseClass 

{

		
	public Work_Exp() throws InterruptedException
    {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.healthpole.doctors.debug:id/item_profile_menu']")).click();//View_profile
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.healthpole.doctors.debug:id/button_edit_profile']")).click(); //edit profile
		
		
		
		Thread.sleep(1000);
		util.VScroll();

		Thread.sleep(4000);
		util.VScroll();

		

		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Work Experience']]")).click();//Add 
		
        Thread.sleep(4000);
		driver.navigate().back();
		
        
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_title')]")).sendKeys("Gp");
    	
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_1')]")).sendKeys("JSPM"); //org name
        
        Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_subtitle_2')]")).sendKeys("jintur"); //city
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_from_date')]")).sendKeys("July 2019");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_to_date')]")).sendKeys("July 2021");
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'edit_text_description')]")).sendKeys("Enjoyed");
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_save')]")).click();//save
		
		
		
			
		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel
		
		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back
		 Reporter.log("Work_Exp Added succceessfully",true);
    }
}