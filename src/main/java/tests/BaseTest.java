package tests;

import features.LoginFeature;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import utils.CommonLogger;
import utils.TestContext;

/**
 * Class contains common methods and fields for all tests
 */
public abstract class BaseTest {

    protected static Logger log = CommonLogger.getLogger();
    protected LoginFeature loginFeature;

    @BeforeClass
    public void setUp() {
        log.info("Start tests. Initiate features..");
        loginFeature = new LoginFeature();
    }

    @AfterSuite
    public void tearDown() {
        TestContext.closeDriver();
        log.info("Tests execution has been finished!");
    }
}
