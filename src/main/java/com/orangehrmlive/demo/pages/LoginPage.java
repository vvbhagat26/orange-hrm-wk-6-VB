package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")
    WebElement userNameFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    WebElement passwordFieldBlankErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement invalidCredentialErrorMessage;


    public void enterUsername(String email) {
        log.info("Enter User Name: " + email.toString());
        sendTextToElement(usernameField, email);
    }

    public void clickOnLoginButton() {
        log.info("Clicking on Login Button: " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public void enterPassword(String password) {
        log.info("Enter Password: " + password);
        sendTextToElement(passwordField, password);
    }


    public String getUserNameFieldErrorMessage() {
        log.info("Getting username field blank error message : " + userNameFieldBlankErrorMessage.toString());
        return getTextFromElement(userNameFieldBlankErrorMessage);
    }

    public String getPasswordFieldErrorMessage() {
        log.info("Getting password field blank error message : " + passwordFieldBlankErrorMessage.toString());
        return getTextFromElement(passwordFieldBlankErrorMessage);
    }

    public String getInvalidCredentialErrorMessage() {
        log.info("Getting invalid credential error message : " + invalidCredentialErrorMessage.toString());
        return getTextFromElement(invalidCredentialErrorMessage);
    }

}
