package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.RetryAnalyzer;

public class TC01_LaunchApplication extends BaseClass {

    private static final Logger logger = LogManager.getLogger(TC01_LaunchApplication.class);

    @Test(groups = {"sanity", "regression"},
    		retryAnalyzer = utilities.RetryAnalyzer.class)
    void testLaunchApplication() {

        logger.info("===== TC01_LaunchApplication STARTED =====");

        try {
            logger.debug("Initializing HomePage object");
            HomePage hp = new HomePage(getDriver());

            logger.debug("Fetching page title");
            String title = getDriver().getTitle();
            logger.debug("Page title fetched: {}", title);

            logger.debug("Asserting page title");
            Assert.assertEquals(title, "Your store of fun");

            logger.info("Application launched successfully with correct title");

        } catch (AssertionError ae) {
            logger.error("Assertion failed: Page title mismatch", ae);
            throw ae; // important to fail the test

        } catch (Exception e) {
            logger.error("Unexpected exception occurred during test execution", e);
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }

        logger.info("===== TC01_LaunchApplication FINISHED =====");
    }
}
