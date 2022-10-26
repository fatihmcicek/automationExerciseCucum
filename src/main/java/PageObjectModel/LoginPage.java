package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends BasePage {

    WebDriver driver;
    Actions actions;

    public LoginPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    By loginTextElement = By.xpath("//h2[contains(text(),'Login to your account')]");

    public void verifyLoginToYourAccountIsVisible() {
        checkElementWithText(loginTextElement, "Login to your account");
    }

    By emailElement = By.xpath("//input[@data-qa='login-email']");
    WebElement form;

    public void enterCorrectEmailAddressAndPassword() {

        form = findElement(emailElement);
        actions.moveToElement(form).click()
                .sendKeys("notest123@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("notest123")
                .perform();
    }

    By loginButtonElement = By.xpath("//button[contains(text(),'Login')]");

    public void clickLoginButton() {
        click(loginButtonElement);
    }

    // Incorrect Email and Password
    public void enterIncorrectEmailAddressAndPassword() {
        form = findElement(emailElement);
        actions.moveToElement(form).click()
                .sendKeys("test@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("test123")
                .perform();
    }

    By incorrectElement = By.xpath("//p[contains(text(),'Your email or password is incorrect!')]");

    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
        checkElementWithText(incorrectElement, text);
    }

    By logoutElement = By.xpath("//a[contains(text(),'Logout')]");
    public void clickLogoutButton() {
        click(logoutElement);
    }

    public void verifyThatUserIsNavigatedToLoginPage() {
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/login");
    }

}
