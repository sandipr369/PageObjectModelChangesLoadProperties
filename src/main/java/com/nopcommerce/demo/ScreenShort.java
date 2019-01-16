package com.nopcommerce.demo;
        import org.apache.commons.io.FileUtils;
        import org.openqa.selenium.OutputType;
        import org.openqa.selenium.TakesScreenshot;
        import org.openqa.selenium.WebDriver;
        import org.testng.ITestResult;
        import java.io.File;


public class ScreenShort {

    protected static WebDriver driver;

    public static void screenshot(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File source =ts.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(source,new File("src\\main\\java\\SaveScreenShort" + result.getName()+".png"));

            }
            catch (Exception e)
            {

            }
        }
    }
}
