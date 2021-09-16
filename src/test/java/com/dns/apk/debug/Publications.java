//verified in ui automator
package com.dns.apk.debug;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Publications extends BaseClass

{

	//android.view.ViewGroup[@resource-id='com.healthpole.doctors.debug:id/item_profile_menu']
	//android.widget.TextView[@resource-id='com.healthpole.doctors.debug:id/button_edit_profile']
	@Test
	static void Publication() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'item_profile_menu')]")).click();//View_profile
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_edit_profile')]")).click(); //edit profile
		
		
		
		Thread.sleep(1000);
		util.VScroll();

		Thread.sleep(1000);
		util.VScroll();

		Thread.sleep(1000);
		util.VScroll();
		
		

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Publications']]")).click();//Add 

		Thread.sleep(1000);
		util.back();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Article Title']")).sendKeys("HEAlth"); //Article title

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Publication Or Publisher']")).sendKeys("publiser ssw"); //Article publisher

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='Publication Date']")).click(); //Article publish date

		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click(); //Article publish date


        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@text='Authors']")).sendKeys("publiser ssw"); //Auther 1
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='ADD AUTHORS']")).click(); //Add auther buttton

		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'image_view_clear_button')]")).click(); //close Auther 2

		                           
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Brief Description']")).sendKeys("Publishing for doctors"); //Description

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Publication Link']")).click(); //link
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Publication Link']")).sendKeys("Publishing.com"); //link
		
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click(); //save
	

		//driver.findElement(By.xpath("//*[@id='button_cancel']")).click(); //cancel

		//driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();//back

		 Reporter.log("Publication details Added succceessfully",true);
	}
	
}
