package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "(//div[@class = 'oxd-select-wrapper'])[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOptionInUserRoleDropDown;


    public void mouseHoverAndClickOnUserRole() {
        log.info("Clicking on UserRole drop-down : " + userRoleDropDown.toString());
        mouseHoverToElementAndClick(userRoleDropDown);
    }

    public void cLickOnAdminOptionInUserRole() {
        log.info("Clicking on Admin option in UserRole drop-down : " + adminOptionInUserRoleDropDown.toString());
        clickOnElement(adminOptionInUserRoleDropDown);
    }

}
