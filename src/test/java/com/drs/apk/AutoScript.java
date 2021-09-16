package com.drs.apk;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import java.time.Duration;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;




public class AutoScript {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;
    
    
    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "192.168.43.49:5555");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() {
    	
    	
        driver.findElement(By.xpath("//*[@id='image_view_tab_icon' and ./parent::*[./parent::*[./parent::*[@contentDescription='Menu']]]]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Dr. Appium User Sw']")));
        driver.findElement(By.xpath("//*[@text='Dr. Appium User Sw']")).click();
        
        TouchAction touchAction = new TouchAction(driver);
        
        /*new TouchAction(driver).press(360, 484).waitAction(Duration.ofMillis(1077)).moveTo(360, 152).release().perform();
        new TouchAction(driver).press(363, 478).waitAction(Duration.ofMillis(911)).moveTo(363, 147).release().perform();
        new TouchAction(driver).press(363, 478).waitAction(Duration.ofMillis(869)).moveTo(363, 147).release().perform();
        new TouchAction(driver).press(350, 797).waitAction(Duration.ofMillis(813)).moveTo(350, 1128).release().perform();
        new TouchAction(driver).press(350, 355).waitAction(Duration.ofMillis(957)).moveTo(350, 134).release().perform();
        new TouchAction(driver).press(350, 355).waitAction(Duration.ofMillis(1140)).moveTo(350, 136).release().perform();
        new TouchAction(driver).press(434, 465).waitAction(Duration.ofMillis(576)).moveTo(434, 355).release().perform();
        new TouchAction(driver).press(392, 428).waitAction(Duration.ofMillis(1012)).moveTo(392, 102).release().perform();
        driver.findElement(By.xpath("//*[@text='Edit Profile']")).click();
        new TouchAction(driver).press(450, 605).waitAction(Duration.ofMillis(1204)).moveTo(450, 163).release().perform();
        new TouchAction(driver).press(450, 605).waitAction(Duration.ofMillis(723)).moveTo(450, 273).release().perform();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Additional Medical Education']]")));
        driver.findElement(By.xpath("//*[@text='+Add' and (./preceding-sibling::* | ./following-sibling::*)[@text='Additional Medical Education']]")).click();
       
       
        Actions.press(427, 878).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)).moveTo(427,554).release().perform();

 */
        		
 
	}

	@AfterMethod
    public void tearDown() {
        driver.quit();
    }
}