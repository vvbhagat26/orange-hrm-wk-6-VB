package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
    WebElement verifySystemUserText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement verifyAddUser;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmpName;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Ranga  Akunuri')]")
    WebElement enterEmpName1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement enterUsername;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
    WebElement selectStatus;
    @CacheLookup
    @FindBy(xpath = "//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]")
    WebElement selectDisable;

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement enterPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-card-container']/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement enterConfirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement clickOnSave;
    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']")
    WebElement successText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement userNameField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-filter-area']//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]")
    WebElement userRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOptionInUserRoleDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement eSSOptionInUserRoleDropDown;


    @CacheLookup
    @FindBy(xpath = "(//i)[13]")
    WebElement statusDropDown;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Disabled']")
    WebElement disableStatus;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enable']")
    WebElement enableStatusOption;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement resetButton;


    @CacheLookup
    @FindBy(xpath = "(//div[@data-v-6c07a142])[1]")
    WebElement userNameInRecord;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBox;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Delete Selected']")
    WebElement deleteButtonAgainstFirstUSerName;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']")
    WebElement yesDeleteOption;


    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);
    }


    public String getSystemUserText() {
        log.info("Verifying System User Text: " + verifySystemUserText.toString());
        return getTextFromElement(verifySystemUserText);
    }

    public void clickAddButton() {
        log.info("Clicking on Add button: " + addButton.toString());
        clickOnElement(addButton);
    }

    public String getAddUserText() {
        log.info("Verifying User added text: " + verifyAddUser.getText());
        return getTextFromElement(verifyAddUser);
    }


    public void enterEmployeeName() throws InterruptedException {
        log.info("Entering Employee name: " + enterEmpName1.toString());
        sendTextToElement(enterEmpName, "A");
        Thread.sleep(1000);
        clickOnElement(enterEmpName1);
    }

    public void enterUserNameField(String userName) {
        log.info("Entering User: " + enterUsername.toString());
        sendTextToElement(enterUsername, userName);
    }

    public void selectDisableOption() throws InterruptedException {
        log.info("Selecting Status Disable: " + selectDisable.toString());
        clickOnElement(selectStatus);
        Thread.sleep(1000);
        clickOnElement(selectDisable);
        Thread.sleep(1000);
    }


    public void enterPass(String password) {
        log.info("Entering Password: " + enterPassword.toString());
        sendTextToElement(enterPassword, password);
    }

    public void enterConfirmPass(String confPassword) {
        log.info("Entering Confirm Password: " + enterConfirmPassword.toString());
        sendTextToElement(enterConfirmPassword, confPassword);
    }

    public void clickOnSaveButton() {
        log.info("Clicking on Save: " + clickOnSave.toString());
        clickOnElement(clickOnSave);
    }

    public String getSuccessText() {
        log.info("Getting User Added Successfully message : " + successText.toString());
        return getTextFromElement(successText);
    }


    public void sendDataToUserNameField(String uName) {
        sendTextToElement(userNameField, uName);
        log.info("Enter " + uName + " to User Name field : " + userNameField.toString());
    }

    public void clickOnUserRoleDropDown() {
        log.info("Clicking on UserRole drop-down : " + userRoleDropDown.toString());
        clickOnElement(userRoleDropDown);
    }

    public void mouseHoverAndClickOnAdminOptionInUserRole() {
        log.info("Clicking on Admin option in UserRole drop-down : " + adminOptionInUserRoleDropDown.toString());
        mouseHoverToElementAndClick(adminOptionInUserRoleDropDown);
    }

    public void mouseHoverAndClickOnESSOptionInUserRole() {
        log.info("Clicking on ESS option in UserRole drop-down : " + eSSOptionInUserRoleDropDown.toString());
        mouseHoverToElementAndClick(eSSOptionInUserRoleDropDown);
    }

    public void clickOnStatusDropDown() {
        clickOnElement(statusDropDown);
        log.info("Clicking on Status drop-down : " + statusDropDown.toString());
    }

    public void mouseHoverAndCLickOndDisableStatusOption() {
        mouseHoverToElementAndClick(disableStatus);
        log.info("Clicking on Disable option in Status drop-down : " + disableStatus.toString());
    }

    public void mouseHoverAndCLickOndEnableStatusOption() {
        mouseHoverToElementAndClick(enableStatusOption);
        log.info("Clicking on Enable option in Status drop-down : " + enableStatusOption.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
        log.info("Clicking on Search button : " + searchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(resetButton);
        log.info("Clicking on Reset button : " + resetButton.toString());
    }

    public String getDataFromUserNameInRecord() {
        log.info("Getting UserName from record : " + userNameInRecord.toString());
        return getTextFromElement(userNameInRecord);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
        log.info("Clicking on checkbox against User Name found : " + checkBox.toString());
    }

    public void clickOnDeleteSelectedOption() {
        clickOnElement(deleteButtonAgainstFirstUSerName);
        log.info("Clicking on delete button against found User Name : " + deleteButtonAgainstFirstUSerName.toString());
    }

    public void clickOnYesDeleteOption() {
        clickOnElement(yesDeleteOption);
        log.info("Clicking on Yes option in the dialog-box : " + yesDeleteOption);
    }


}
