package tests;

import enums.PageEnum;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import utils.TestDataProvider;

/**
 * Class contains tests for Login page (Brute force scenario)
 */
public class BruteForceLoginTest extends BaseTest {

    @Test(dataProvider = "bruteForceData", dataProviderClass = TestDataProvider.class)
    @Features("Login page")
    @Stories("Brute force")
    @Title("Ten random credentials test")
    public void bruteForceLoginTest(String login, String password) throws InterruptedException {
        loginFeature.navigateToPage(PageEnum.LOGIN);
        loginFeature.signIn(login, password);
        Assert.assertTrue(loginFeature.isOnPage(PageEnum.LOGIN), "Checks that credentials are wrong, and sign in failed");
    }
}
