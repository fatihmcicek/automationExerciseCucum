package PageObjectModel;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends BasePage {

    WebDriver driver;
    Actions actions;
    Faker faker = new Faker();


    public ContactUsPage() {
        driver = Driver.getDriver();
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    By contactUsButtonElement = By.xpath("//a[@href='/contact_us']");

    public void clickOnContactUsButton() {
        click(contactUsButtonElement);
    }

    By verifyGETINTOUCHIsVisibleElement = By.xpath("//h2[contains(text(),'Get In Touch')]");

    public void verifyGETINTOUCHIsVisible(String text) {
        checkElementWithText(verifyGETINTOUCHIsVisibleElement, text);
    }

    By nameElement = By.xpath("//input[@name='name']");
    WebElement changeElement;

    public void enterNameEmailSubjectAndMessage() {
        changeElement = findElement(nameElement);
        actions.moveToElement(changeElement).click()
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.pokemon().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.color().hex())
                .perform();
    }

    By uploadElement = By.name("upload_file");

    public void uploadFile() {
        sendKey(uploadElement, "files/accountPassword.txt");
    }

    By submitButtonElement = By.xpath("//input[@name='submit']");

    public void clickSubmitButton() throws InterruptedException {
        Thread.sleep(5000);
        changeElement = findElement(submitButtonElement);
        scrollToElement(changeElement);
        click(submitButtonElement);
    }

    public void clickOKButton() throws InterruptedException {
        Thread.sleep(2000);
        Alert alert_box = driver.switchTo().alert();
        alert_box.accept();
    }

    By successElement = By.cssSelector(".status.alert.alert-success");

    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String text) {
        checkElementWithText(successElement, text);
    }

    By homeElement = By.cssSelector(".btn.btn-success");

    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() {
        click(homeElement);
        checkUrl(driver.getCurrentUrl(), "https://automationexercise.com/");
    }

}
