//verified
package com.drs.apk;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Personal_info extends BaseClass 

{


	@Test
	static void Add_Edu() throws InterruptedException
	{

		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'item_profile_menu')]")).click();//View_profile
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_edit_profile')]")).click(); //edit profile
		
		Thread.sleep(100);
	    util.VScroll();
	    
	    Thread.sleep(100);
	    util.VScroll();

	    Thread.sleep(100);
	    util.VScroll();
	    
	    Thread.sleep(100);
	    util.VScroll();
	    
	    Thread.sleep(100);
	    util.VScroll();
	   
		

		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@text='Edit' and (./preceding-sibling::* | ./following-sibling::*)[@text='Personal Information']]")).click(); //edit personal profile
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='text_view_clear']")).click(); //clear birthday
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='edit_text_birth_date']")).sendKeys("09 June 1997");
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='check_box_item']")).click(); //toggle hide mail
		
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id='button_save']")).click(); //save
		
		
		
		
	}
}