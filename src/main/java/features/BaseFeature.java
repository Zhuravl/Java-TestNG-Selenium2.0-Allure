package features;

import enums.PageEnum;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;
import utils.CommonLogger;
import utils.TestContext;

/**
 * Class contains common fields and methods for all features
 */
public abstract class BaseFeature {

    protected static Logger log = CommonLogger.getLogger();

    /**
     * Checks if on a page
     * @return True if expected and current url is equals, otherwise false
     */
    @Step("Check is on page")
    public boolean isOnPage(PageEnum expectedPage) {
        boolean result = TestContext.getDriver().getCurrentUrl().equals(expectedPage.getUrl());
        log.info("Check if on a page '" + expectedPage.getName() + "'. Result: " + result);
        return result;
    }

    /**
     * Navigates to the target page by url
     * @param targetPage Target page
     */
    @Step("Navigate to the page")
    public void navigateToPage(PageEnum targetPage) {
        if (!isOnPage(targetPage)) {
            log.info("Moving to the '" + targetPage.getUrl() + "'");
            TestContext.getDriver().get(targetPage.getUrl());
        }
    }

    /**
     * Waits for update to be completed
     */
    protected abstract void waitForUpdateCompleted();
}
