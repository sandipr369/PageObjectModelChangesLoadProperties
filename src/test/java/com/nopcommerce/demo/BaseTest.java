package com.nopcommerce.demo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    CrossBrowser browser= new CrossBrowser();


@BeforeMethod
public void openWindow(){
browser.crossbrowser();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

}

@AfterMethod

public void takeScreenShot(ITestResult result){
if(ITestResult.FAILURE==result.getStatus()){
    // typecasting the interface to make object of interface
 try{  TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
    File source= takesScreenshot.getScreenshotAs(OutputType.FILE);
   // File destination = new File("C:\\Src\\Page_Object_Model\\Screenshotfile");

  FileUtils.copyFile(source, new File("C:\\Src\\Page_Object_Model\\src\\test\\java\\Screenshot\\"+result.getName() + ".png"));
    } catch (Exception e) {
        System.out.println("Exception while taking sceenshot"+e.getMessage());
        e.printStackTrace();
    }
closebrowser();
 driver.quit();
}

    }
@AfterTest
public void closebrowser(){
driver.quit();}
}


