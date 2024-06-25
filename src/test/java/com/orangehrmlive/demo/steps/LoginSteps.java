package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Objects;

public class LoginSteps {

    @Given("I am on login page")
    public void iAmOnLoginPage() {

    }

    @Then("I should login successfully and verify the text {string}")
    public void iShouldLoginSuccessfullyAndVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new DashboardPage().getDashboardText(), expectedMessage);
    }

    @Then("I should see the OrangeHRM logo")
    public void iShouldSeeTheOrangeHRMLogo() {
        Assert.assertEquals("", new DashboardPage().getOrangeLogo());
    }

    @And("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("I mouse hover and click on Logout")
    public void iMouseHoverAndClickOnLogout() {
        new DashboardPage().mouseHoverAndClickOnLogOut();
    }

    @Then("I should navigate to login page and verify {string} text")
    public void iShouldNavigateToLoginPageAndVerifyText(String expectedMessage) {
//        Assert.assertEquals("Login", new LoginPage().getVerifyLogin());
    }

    @Then("I should get error message {string} depends on username {string} and password {string}")
    public void iShouldGetErrorMessageDependsOnUsernameAndPassword(String expectedError, String uName, String pass) {
        if (Objects.equals(uName, "")) {
            Assert.assertEquals(new LoginPage().getUserNameFieldErrorMessage(), expectedError);
        } else if (Objects.equals(pass, "")) {
            Assert.assertEquals(new LoginPage().getPasswordFieldErrorMessage(), expectedError);
        } else {
            Assert.assertEquals(new LoginPage().getInvalidCredentialErrorMessage(), expectedError);
        }
    }

    @Given("I am on HomePage")
    public void iAmOnHomePage() {
    }
}
