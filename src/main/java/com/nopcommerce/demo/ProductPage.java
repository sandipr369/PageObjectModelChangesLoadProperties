package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends Utils {
    WebDriver driver;
public ProductPage(WebDriver driver){
}

By addToCart= By.xpath("//input[@id='add-to-cart-button-4']");
By shoppingCartPopUp = By.xpath("//a[contains(text(),'shopping cart')]");


public void addtoCart(){
    //click on add to cart button
    click_element(addToCart);
}
public void shoppingCartPopup(){
    //click on shopping cart pop up
    explicityWait_Until_Element_is_Clickable(shoppingCartPopUp,30);

    click_element(shoppingCartPopUp);

}

}
