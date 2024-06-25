package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends Utility {

    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-topbar-header']/div[1]/span[1]/h6[1]")
    WebElement dashboardPage;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeLogo;
    @CacheLookup
    @FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
    WebElement userProfileLogo;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;
    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
        log.info("Clicking on user profile logo : " + userProfileLogo.toString());
    }

    public void mouseHoverAndClickOnLogOut() {
        mouseHoverToElementAndClick(logoutLink);
        log.info("Clicking on logout link : " + logoutLink.toString());
    }

    public String getDashboardText() {
        log.info("Verifying Dashboard Page: " + dashboardPage.toString());
        return getTextFromElement(dashboardPage);
    }

    public String getOrangeLogo() {
        log.info("Verifying Orange HRM Logo: " + orangeLogo.toString());
        return getTextFromElement(orangeLogo);
    }

}
