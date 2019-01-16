package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static com.nopcommerce.demo.Utils.*;
import static org.openqa.selenium.By.name;

public class RegistrationPage extends Utils {
    WebDriver driver;
    SoftAssert softAssert= new SoftAssert();
    By register = By.className("ico-register");
    By gender = By.id("gender-male");
    By firstname = By.id("FirstName");
    By lastname = By.id("LastName");
    By birthDay = By.name("DateOfBirthDay");
    By birthMonth = By.name("DateOfBirthMonth");
    By birthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By company = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By clickRegistrationButton = By.id("register-button");
    By continueFurthur = By.xpath("//input[@name='register-continue']");

    public RegistrationPage(WebDriver driver) {                   //need more explaination-sandip
        this.driver = driver;
    }

    public void register() {
        click_element(register);
    }

    public void gender() {
        click_element(gender);
    }

    public void firstname() {
        enter_Text(firstname, properties.getProperty("First_name"));
    }

    public void lastname() {
        enter_Text(lastname,properties.getProperty("Last_name"));
    }

    public void birthDay() {
        select_Element_by_value(birthDay,properties.getProperty("Day"));
    }

    public void birthMonth() {
        select_Element_By_Visible_Text(birthMonth,properties.getProperty("Month") );
    }

    public void birthYear() {
        select_Element_by_value(birthYear,properties.getProperty("Year"));
    }

    public void email() {
        enter_Text(email, date_Stamp()+properties.getProperty("Your_email_address")+date_Stamp()+"@gmail.com");
    }

    public void company() {
        enter_Text(company, properties.getProperty("Company_name"));
    }

    public void password() {
        enter_Text(password,properties.getProperty("Password"));
    }

    public void confirmPassword() {
        enter_Text(confirmPassword,properties.getProperty("Confirm_password"));
    }

    public void clickRegistrationButton() {
        click_element(clickRegistrationButton);
    }



    public void continueFurthur() {
        click_element(continueFurthur);
    }


}
