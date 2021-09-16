//verified ui automator
package com.drs.apk;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Your_Prof_Link extends BaseClass {
	@Test 
	public void Work_Exp() throws InterruptedException
    {
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='4']")).click();//menu
		    
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.ViewGroup[contains(@resource-id,'item_profile_menu')]")).click();//View_profile
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_edit_profile')]")).click(); //edit profile
		
		
		
		Thread.sleep(2000);
		util.VScroll();

		Thread.sleep(2000);
		util.VScroll();

		Thread.sleep(2000);
		util.VScroll();

		Thread.sleep(2000);
		util.VScroll();

		Thread.sleep(2000);
		util.VScroll();
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@text='View' and (./preceding-sibling::* | ./following-sibling::*)[@text='Your Profile Link']]")).click();//Add 
		
        Thread.sleep(20000);
        
       
		driver.navigate().back();
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'button_copy')]")).click();
    	
		
        Reporter.log("Link Copied to clipboard succeessfully",true);
		
}
}