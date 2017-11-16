package features;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Step;
import utils.TestContext;

/**
 * Class contains specific methods for work with content from Login page
 */
public class LoginFeature extends BaseFeature {

    private LoginPage loginPage = new LoginPage();

    @Override
    protected void waitForUpdateCompleted() {
        WebDriverWait wait = new WebDriverWait(TestContext.getDriver(), 1);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginField()));
    }

    /**
     * Signs in to the resource
     */
    @Step("Sign in to the service")
    public void signIn(String login, String password) {
        log.info("Sign in to the host with credentials: '" + login + "', '" + password + "'.");
        loginPage.enterLogin(login);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();
        waitForUpdateCompleted();
    }
}
