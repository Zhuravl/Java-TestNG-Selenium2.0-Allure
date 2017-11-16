package pages;

import org.openqa.selenium.support.PageFactory;
import utils.CommonLogger;
import utils.TestContext;
import org.apache.logging.log4j.Logger;

/**
 * Class contains common fields for all pages
 */
public abstract class BasePage {

    protected static Logger log = CommonLogger.getLogger();

    public BasePage(){
        PageFactory.initElements(TestContext.getDriver(), this);
    }
}
