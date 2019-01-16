package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class JewelryPage extends Utils {

    By jewelry= By.linkText("Jewelry");
    By selectCurrancy= By.id("customerCurrency");

    SoftAssert softAssert = new SoftAssert();

    public JewelryPage(WebDriver driver) {

    }

//    By dollar=By.xpath("//option[.='US Dollar']");
//    By euro= By.xpath("//option[.='Euro");




    public void jewelry(){click_element(jewelry);}
    public void selectCurrancy(){click_element(selectCurrancy);}
    public void usd(){select_Element_By_Visible_Text(selectCurrancy,"US Dollar");}
    public void euro(){select_Element_By_Visible_Text(selectCurrancy,"Euro");}


 //create method for checking currency

   public void checkCurrencyInUSD() {
       ArrayList<WebElement> priceInDollar = new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div/span")));
       System.out.println(priceInDollar);

       for (WebElement object : priceInDollar
       ) {
           System.out.println(object.getText().charAt(0));
           softAssert.assertEquals(object.getText().charAt(0),"$");
           softAssert.assertAll();
       }
   }

   public void checkCurrencyInEuro(){
       ArrayList<WebElement> priceInEuro = new ArrayList<>(driver.findElements(By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div/span")));
       for (WebElement objectEuro:priceInEuro
       ) {
           softAssert.assertEquals(objectEuro.getText().charAt(0),"Ђ");
           softAssert.assertAll();

       }
   }



}
