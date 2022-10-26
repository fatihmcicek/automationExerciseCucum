package stepDefinitions;

import PageObjectModel.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class LoginPageSteps {

    LoginPage loginPage = new LoginPage();

    @Then("Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        loginPage.verifyLoginToYourAccountIsVisible();
    }

    @And("Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        loginPage.enterCorrectEmailAddressAndPassword();
    }

    @And("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        loginPage.enterIncorrectEmailAddressAndPassword();
    }

    @Then("Verify error {string} is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
        loginPage.verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(text);
    }

    @And("Click Logout Button")
    public void clickLogoutButton() {
        loginPage.clickLogoutButton();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        loginPage.verifyThatUserIsNavigatedToLoginPage();
    }

    @After
    public void close() {
        Driver.TearDown();
    }

}
