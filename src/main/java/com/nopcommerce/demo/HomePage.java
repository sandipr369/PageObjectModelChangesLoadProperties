package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class HomePage extends Utils {
    SoftAssert softAssert = new SoftAssert();

    public HomePage(WebDriver driver) {

    }


    public void countAddToCartButton() {
        ArrayList<WebElement> add_To_cart_Button = new ArrayList<>(driver.findElements(By.xpath("//div[2][@class='item-grid']//div/div[2]/div[3]//input[@value='Add to cart']")));
        for (WebElement object : add_To_cart_Button) {
            System.out.println(object.getAttribute("value"));
            softAssert.assertEquals(object.getAttribute("Value"), "Add to cart");
        }
    }

    By clickOnAnyProductOnHomePage = By.xpath("//img[@alt=\"Picture of Apple MacBook Pro 13-inch\"]");
    By clickEmailToFriendButton = By.className("email-a-friend");
    By enterFriendEmailAddress = By.id("FriendEmail");
    By enterUsersEmailAddress = By.id("YourEmailAddress");
    By messageToFriend = By.id("PersonalMessage");
    By clickOnSendEmailButton = By.xpath("//input[@name='send-email']");
Loadprop loadprop= new Loadprop();
    public void clickOnAnyProductOnHomePage() {
        //click on any product
        click_element(clickOnAnyProductOnHomePage); }
        public void clickEmailToFriendButton(){
        //click to email friend
        click_element(clickEmailToFriendButton);}
        public void enterFriendEmailAddress(){

        //properties.getProperty("EmailAddress");
        //enter friends email address, edit date stamp to generate new mail address


        enter_Text(enterFriendEmailAddress,loadprop.getProperty("Friend's_email")+date_Stamp()+"@gmail.com");
    }
        public void enterUsersEmailAddress(){
        //users email address
        enter_Text(enterUsersEmailAddress, loadprop.getProperty("Your_email_address")+date_Stamp()+"@gmail.com");}
        public void messageToFriend(){
        //string message
        enter_Text(messageToFriend, loadprop.getProperty("Personal_message"));}
        public void clickOnSendEmailButton() {
        // click on send email button
        click_element(clickOnSendEmailButton);

    }


    By clickOnMacbook=By.xpath("//div[2][@class='item-grid']/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    public void clickOnMacBook(){
        //click on mackbook
        click_element(clickOnMacbook); }


        By addToCartHTC=By.xpath("//div[2][@class='item-grid']/div[3]/div/div[2]/div[3]//input[@value='Add to cart']");
        public void addToCartHTC(){
            //Click on add to cart for HTC phone
            click_element(addToCartHTC);
        }
}


