package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import javax.rmi.CORBA.Util;

public class AssertionMethods extends Utils {
    static SoftAssert softAssert = new SoftAssert();

    public static void yourregistrationcompletedMsgAssert() {
        String actualResult = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
        String expectedResult = "Your registration completed";
        softAssert.assertEquals(actualResult, expectedResult);

    }

    public void yourMessageHasBeenSentAssert() {
        String actual = driver.findElement(By.xpath("//div[contains(text(),'Your message has been sent.')]")).getText();
        String expectedResult = "Your message has been sent.";
        softAssert.assertEquals(actual, expectedResult);
    }

    public void onlyRegisteredCustomersCanUseEmailaFriendFeatureAssert() {
        String actualResult = driver.findElement(By.xpath("//li[contains(text(),'Only registered customers can use email a friend feature')]")).getText();
        String expectedResults = "Only registered customers can use email a friend feature";
        softAssert.assertEquals(actualResult, expectedResults);
    }

    public void pleaseAcceptTheTermsOfServiceBeforeTheNextStepAssert() {

        //creating string for Assert - getting the text back from the pop up
        String expectedCheckoutNotification = driver.findElement(By.id("terms-of-service-warning-box")).getText();
        String actualCheckoutnotification = "Please accept the terms of service before the next step.";
        softAssert.assertEquals(actualCheckoutnotification, expectedCheckoutNotification);
    }

    public void yourOrderHasBeenSuccessfullyProcessedAssert() {
        String expected_Order_Completed_Message = driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).getText();
        String actual_Order_complete_message = "Your order has been successfully processed!";
        softAssert.assertEquals(actual_Order_complete_message, expected_Order_Completed_Message);
    }

}















