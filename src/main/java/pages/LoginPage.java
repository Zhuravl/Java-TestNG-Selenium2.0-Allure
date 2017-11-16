package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class contains description of elements from Login page
 */
public class LoginPage extends BasePage {

    @FindBy(name = "email")
    private WebElement loginField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = ".//*[@id='signin']//button")
    private WebElement submitButton;

    public WebElement getLoginField() {
        return loginField;
    }

    public void enterLogin(String login) {
        log.info("Entering login: '" + login + "'");
        loginField.clear();
        loginField.sendKeys(login);
    }

    public void enterPassword(String password) {
        log.info("Entering password: '" + password + "'");
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        log.info("Clicking on submit button");
        if (submitButton.isEnabled()) {
            submitButton.click();
        }
    }
}
