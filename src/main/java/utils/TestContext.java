package utils;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static constants.Constants.*;

/**
 * Class contains test context methods
 */
public class TestContext {

    protected static Logger log = CommonLogger.getLogger();
    private static WebDriver driver;

    /**
     * Creates and returns WebDriver instance
     */
    public static WebDriver getDriver(){
        if (driver == null){
            log.info("Create driver");

            System.setProperty(FIREFOX_DRIVER_KEY, PROJECT_DIR + MAIN_RESOURCES_PATH + FIREFOX_DRIVER_NAME);

            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    /**
     * Closes WebDriver
     */
    public static void closeDriver(){
        if (driver != null){
            log.info("Close driver");
            driver.close();
        }
    }
}
