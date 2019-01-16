package com.nopcommerce.demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.util.concurrent.TimeUnit;

public class CrossBrowser extends Utils {
  Loadprop loadprop= new Loadprop();
        public void crossbrowser(){
            String browser=loadprop.getProperty("browser");
// String crossbrowser=System.getProperty("crossbrowser");
            if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","src\\BrowserDriver\\geckodriver.exe");
                System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
                driver = new FirefoxDriver();
                implecity_Wait(20, TimeUnit.SECONDS);
                driver.get(loadprop.getProperty("url"));
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe ");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-crossbrowser-side-navigation");
                options.addArguments("--incognito");
                options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
                driver = new ChromeDriver(options);
                implecity_Wait(20, TimeUnit.SECONDS);
                driver.get(loadprop.getProperty("url"));

                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver",
                        "src\\BrowserDriver\\IEDriverServer.exe");
                InternetExplorerOptions options = new InternetExplorerOptions();
                options.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
                options.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
                driver = new InternetExplorerDriver(options);
                driver.get(loadprop.getProperty("url"));

                driver.manage().window().maximize();
                implecity_Wait(20, TimeUnit.SECONDS);

            }else{
                System.out.println("Browser name is empty or typed wrong :"+browser);
            }
        }
    }




