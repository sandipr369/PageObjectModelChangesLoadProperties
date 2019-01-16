package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailToFriendPage extends Utils {

    WebDriver driver;

    EmailToFriendPage(WebDriver driver) {
    }

    By addProductToCartToRefer = By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    By clickEmailfriendButton = By.className("email-a-friend");
    By friendEmailAddress = By.id("FriendEmail");
    By personalMessage = By.id("PersonalMessage");
    By sendEmailToFriend = By.xpath("//input[@name='send-email']");
    By logOut = By.xpath("//a[contains(text(),\"Log out\")]");

    //click on the product you wish to refere to friend
    public void addProductToCartToRefer() {
        click_element(addProductToCartToRefer);
    }


    //click on email to friend button
    public void clickEmailfriendButton() {
        click_element(clickEmailfriendButton);
    }
    //enter friends email address

    public void friendEmailAddress() {
   enter_Text(friendEmailAddress,properties.getProperty("Your_email_address")+date_Stamp()+"@gmail.com");

       // enter_Text(friendEmailAddress, "bhavinpatel" + date_Stamp() + "@gmail.com");

    }

    //enter presonal message
    public void personalMessage() {

       enter_Text(personalMessage,properties.getProperty("Personal_message"));
       // enter_Text(personalMessage, "please have a look this product");
    }

    //send email
    public void sendEmailToFriend() {
        click_element(sendEmailToFriend);
    }

    public void logOut() {
        click_element(logOut);
    }

}



