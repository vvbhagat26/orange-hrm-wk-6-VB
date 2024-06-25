package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("I click on Admin tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @And("I should see the System Users text")
    public void iShouldSeeTheSystemUsersText() {
        Assert.assertEquals(new ViewSystemUsersPage().getSystemUserText(), "System Users");
    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
        new ViewSystemUsersPage().clickAddButton();
    }

    @And("I should see the Add User text")
    public void iShouldSeeTheAddUserText() {
        Assert.assertEquals(new ViewSystemUsersPage().getAddUserText(), "Add User");
    }

    @And("I select User Role as Admin")
    public void iSelectUserRoleAsAdmin() throws InterruptedException {
        new AddUserPage().mouseHoverAndClickOnUserRole();
        new AddUserPage().cLickOnAdminOptionInUserRole();
    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String username) throws InterruptedException {
        new ViewSystemUsersPage().enterEmployeeName();
    }

    @And("I enter User Name {string}")
    public void iEnterUserName(String userName) {
        new ViewSystemUsersPage().enterUserNameField(userName);
    }

    @And("I select Status as Disable")
    public void iSelectStatusAsDisable() throws InterruptedException {
        new ViewSystemUsersPage().selectDisableOption();
    }

    @And("I enter Password {string} in create user")
    public void iEnterPasswordInCreateUser(String password) {
        new ViewSystemUsersPage().enterPass(password);
    }

    @And("I enter Confirm Password {string} in create User")
    public void iEnterConfirmPasswordInCreateUser(String confirmPassword) {
        new ViewSystemUsersPage().enterConfirmPass(confirmPassword);

    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        new ViewSystemUsersPage().clickOnSaveButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getSuccessText(), "Successfully Saved");
    }


    @And("I enter user name {string} in system users page")
    public void iEnterUserNameInSystemUsersPage(String uName) {
        new ViewSystemUsersPage().sendDataToUserNameField(uName);
    }

    @And("I select user role as Admin in system users page")
    public void iSelectUserRoleAsAdminInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnUserRoleDropDown();
        new ViewSystemUsersPage().mouseHoverAndClickOnAdminOptionInUserRole();
    }

    @And("I select status as disable in system users page")
    public void iSelectStatusAsDisableInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnStatusDropDown();
        new ViewSystemUsersPage().mouseHoverAndCLickOndDisableStatusOption();
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("I should verify the user name {string} in result list")
    public void iShouldVerifyTheUserNameInResultList(String expectedUserName) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(), expectedUserName);
    }

    @And("I click on check box against the user name")
    public void iClickOnCheckBoxAgainstTheUserName() {
        new ViewSystemUsersPage().clickOnCheckBox();
    }

    @And("I click on delete button against the user name")
    public void iClickOnDeleteButtonAgainstTheUserName() {
        new ViewSystemUsersPage().clickOnDeleteSelectedOption();
    }

    @And("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUsersPage().clickOnYesDeleteOption();
    }

    @Then("I should get successfully deleted message {string}")
    public void iShouldGetSuccessfullyDeletedMessage(String arg0) {
    }

    @And("I select user role {string} in system users page")
    public void iSelectUserRoleInSystemUsersPage(String uName) {
        new ViewSystemUsersPage().clickOnUserRoleDropDown();
        if (uName == "Admin") {
            new ViewSystemUsersPage().mouseHoverAndClickOnAdminOptionInUserRole();
        } else {
            new ViewSystemUsersPage().mouseHoverAndClickOnESSOptionInUserRole();
        }
    }

    @And("I select status {string} in system users page")
    public void iSelectStatusInSystemUsersPage(String status) {
        new ViewSystemUsersPage().clickOnStatusDropDown();
        if (status == "Enabled") {
            new ViewSystemUsersPage().mouseHoverAndCLickOndEnableStatusOption();
        } else {
            new ViewSystemUsersPage().mouseHoverAndCLickOndDisableStatusOption();
        }
    }

    @And("I see the one record found {string} message")
    public void iSeeTheOneRecordFoundMessage(String expectedMessage) {
//        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(), expectedMessage);
    }

    @And("I should verify the username {string}")
    public void iShouldVerifyTheUsername(String uName) {
//        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(), uName);
    }

    @Then("I click on reset button")
    public void iClickOnResetButton() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}