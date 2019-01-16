package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends Utils {

    WebDriver driver;

    public CheckOutPage(WebDriver driver) {

    }

    By selectCountry = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By zipcode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueForPaymentMethod = By.xpath("//div[@id='billing-buttons-container']/input[@class]");
    By shippingMethod = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
    By paymentMethod = By.id("paymentmethod_1");
    By continueForCardDetails = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
    By cardHoldersName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By monthOfExpiry = By.id("ExpireMonth");
    By yearOfExpiry = By.id("ExpireYear");
    By cvv = By.id("CardCode");
    By continueToConfirmationPage = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
    By continueToOrderCompletion = By.xpath("//input[@class='button-1 confirm-order-next-step-button']");
   By logOut = By.xpath("//a[contains(text(),\"Log out\")]");


    public void billingAndShipping() {
        //select India from drop down menu

        select_Element_By_Visible_Text(selectCountry,properties.getProperty("Country"));
        //select_Element_By_Visible_Text(selectCountry, "India");

        //enter city name

        enter_Text(city,properties.getProperty("City"));

//        enter_Text(city, "Ahmedabad");

        //enter house name
        enter_Text(address1,properties.getProperty("Address1"));
        //enter zip code
        enter_Text(zipcode,properties.getProperty("Zipcode"));

        //  enter_Text(zipcode, "380016");
        // Enter phone number
        enter_Text(phoneNumber,properties.getProperty("PhoneNumber"));
        //enter_Text(phoneNumber, "+919998522389");
        //click on continue
        click_element(continueForPaymentMethod);
        //click on shipping method
        click_element(shippingMethod);
        //click on payment method
        click_element(paymentMethod);
        //continue to next
        click_element(continueForCardDetails);

    }

    public void cardDetails() {
        //enter cardholder name
        enter_Text(cardHoldersName,properties.getProperty("CardHoldersName"));
        //enter_Text(cardHoldersName, "sandip");
        //enter card number
        enter_Text(cardNumber,properties.getProperty("CardNumber"));
        //enter_Text(cardNumber, "4111111111111111");
        //expiry month
        select_Element_by_value(monthOfExpiry,properties.getProperty("MonthOfExpiry"));

       // select_Element_by_value(monthOfExpiry, "11");
        //year of expiry
        select_Element_by_value(yearOfExpiry,properties.getProperty("YearOfExpiry"));

       // select_Element_by_value(yearOfExpiry, "2020");
        //cvv code
        enter_Text(cvv,properties.getProperty("Cvv"));

        //enter_Text(cvv, "737");
        click_element(continueToConfirmationPage);
        //confirming step-2 on checkout page
        click_element(continueToOrderCompletion);

    }
    public void continueAfterOrdercomletion(){
        // need to refresh to go ahead
        driver.navigate().refresh();
//        //log out for next test case
        click_element(logOut);
    }}

