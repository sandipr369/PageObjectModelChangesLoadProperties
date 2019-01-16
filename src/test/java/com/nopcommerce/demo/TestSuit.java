package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {
    RegistrationPage register = new RegistrationPage(driver);
    HomePage add_To_Cart = new HomePage(driver);
    HomePage unRegisterUser = new HomePage(driver);
    HomePage selectProductYouWish = new HomePage(driver);
    OrderCartPage checkOutOrderCartPage = new OrderCartPage(driver);
    ProductPage addToCart = new ProductPage(driver);
    CheckOutPage checkoutCheckOutPage = new CheckOutPage(driver);
    JewelryPage currancyChecker = new JewelryPage(driver);
    SoftAssert softAssert = new SoftAssert();
    EmailToFriendPage emailToFriendPage = new EmailToFriendPage(driver);
    AssertionMethods assertionMethods = new AssertionMethods();


    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {

        register.register();
        register.gender();
        register.firstname();
        register.lastname();
        register.birthDay();
        register.birthMonth();
        register.birthYear();
        register.email();
        register.company();
        register.password();
        register.confirmPassword();
        register.clickRegistrationButton();
        assertionMethods.yourregistrationcompletedMsgAssert();
        softAssert.assertAll();
        register.continueFurthur();

    }

    @Test
    public void registerUserShouldBeAbleToSendProductEmailSuccessfully() {
        userShouldBeAbleToRegisterSuccessfully();

        emailToFriendPage.addProductToCartToRefer();
        emailToFriendPage.clickEmailfriendButton();
        emailToFriendPage.friendEmailAddress();
        emailToFriendPage.personalMessage();
        emailToFriendPage.sendEmailToFriend();
        assertionMethods.yourMessageHasBeenSentAssert();
        softAssert.assertAll();
        emailToFriendPage.logOut();


    }

    @Test
    public void unRegisteredUseShouldNotBeAbleToSendEmail() {

        unRegisterUser.clickOnAnyProductOnHomePage();
        unRegisterUser.clickEmailToFriendButton();
        unRegisterUser.enterFriendEmailAddress();
        unRegisterUser.enterUsersEmailAddress();
        unRegisterUser.messageToFriend();
        unRegisterUser.clickOnSendEmailButton();
        assertionMethods.onlyRegisteredCustomersCanUseEmailaFriendFeatureAssert();
        softAssert.assertAll();

    }

    @Test
    public void toVerifyUserNeedToAcceptTC() {
        selectProductYouWish.clickOnMacBook();
      //  addToCart.addtoCart();
        addToCart.shoppingCartPopup();
        checkOutOrderCartPage.clickOnCheckOut();
        assertionMethods.pleaseAcceptTheTermsOfServiceBeforeTheNextStepAssert();
        softAssert.assertAll();
        checkOutOrderCartPage.cancelPopUpandRefresh();
    }

    @Test
    public void toVerifyRegister_User_Should_Be_able_to_Buy_Product_Successfully() {

        userShouldBeAbleToRegisterSuccessfully();
        add_To_Cart.addToCartHTC();
        addToCart.shoppingCartPopup();
        checkOutOrderCartPage.acceptTermsCondition();
        checkOutOrderCartPage.clickOnCheckOut();
        checkoutCheckOutPage.billingAndShipping();
        checkoutCheckOutPage.cardDetails();

        assertionMethods.yourOrderHasBeenSuccessfullyProcessedAssert();
        softAssert.assertAll();
        click_element(By.xpath("//a[contains(text(),\"Log out\")]"));
       // checkoutCheckOutPage.continueAfterOrdercomletion();


    }

    @Test


    public void to_Verify_NumberOf_Add_To_cartButtonOnHomePage() {
        add_To_Cart.countAddToCartButton();
        softAssert.assertAll();
    }

    @Test
    public void userShouldBeAbleToSelectPriceByEuroOrUSD() {
        currancyChecker.jewelry();
        currancyChecker.selectCurrancy();
        currancyChecker.usd();
        currancyChecker.checkCurrencyInUSD();
        softAssert.assertAll();


        //currency check in euro
        currancyChecker.euro();
        currancyChecker.checkCurrencyInEuro();
        softAssert.assertAll();


    }
}


