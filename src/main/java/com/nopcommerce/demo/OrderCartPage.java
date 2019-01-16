package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderCartPage extends Utils{

    WebDriver driver;
    public OrderCartPage(WebDriver driver){
    }

    By checkoutButton= By.id("checkout");
    By cancellPopup= By.xpath("//button[@class=\"ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close\"]");
    By homepage= By.xpath("//img[@alt=\"nopCommerce demo store\"]");
    By acceptTermsCondition=By.id("termsofservice");



   public void clickOnCheckOut(){
       //try to check out
       click_element(checkoutButton);
   }
   public void cancelPopUpandRefresh(){
       click_element(cancellPopup);

       // refresh page
       click_element(homepage);
   }

   public void acceptTermsCondition(){
       click_element(acceptTermsCondition);
       //click on check out
   }




}
