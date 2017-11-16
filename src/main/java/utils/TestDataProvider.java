package utils;

import helpers.TestDataHelper;
import org.testng.annotations.DataProvider;

/**
 * Class contains providers for tests data
 */
public class TestDataProvider {

    /**
     * Returns set of data for brute force testing
     */
    @DataProvider
    public static Object[][] bruteForceData(){
        return TestDataHelper.getLoginData(10);
    }

    /**
     * Returns set of data for unsuccessful login testing
     */
    @DataProvider
    public static Object[][] credentialsData(){
        return new Object[][]{
                {"login@test.com", "password"}
        };
    }
}
