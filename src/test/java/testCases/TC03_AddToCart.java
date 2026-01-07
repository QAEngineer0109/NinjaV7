package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CategoryPage;
import pageObjects.ProductPage;
import testBase.BaseClass;
import utilities.RetryAnalyzer;

public class TC03_AddToCart extends BaseClass {

    private static final Logger logger = LogManager.getLogger(TC03_AddToCart.class);

    @Test(groups = {"sanity", "regression"}, retryAnalyzer = utilities.RetryAnalyzer.class)
    public void testAddToCart() throws InterruptedException {

        logger.info("===== TC03_AddToCart TEST STARTED =====");

        try {
            logger.debug("Initializing CategoryPage");
            CategoryPage cp = new CategoryPage(getDriver());

            logger.debug("Clicking on Laptops & Notebooks");
            cp.clickLaptopsAndNotebooks();

            logger.debug("Clicking on Show All");
            cp.clickShowAll();

            logger.debug("Waiting for product list to load");
            Thread.sleep(500);

            logger.debug("Selecting HP product");
            cp.selectHPProduct();

            logger.debug("Initializing ProductPage");
            ProductPage pp = new ProductPage(getDriver());

            logger.debug("Setting delivery date");
            pp.setDeliveryDate();

            logger.debug("Clicking Add to Cart");
            pp.clickAddToCart();

            logger.debug("Validating success message for Add to Cart");

            try {
                Assert.assertTrue(
                        pp.isSuccessMessageDisplayed(),
                        "Add to Cart Failed!"
                );
                logger.info("Product successfully added to cart");

            } catch (AssertionError ae) {
                logger.error("Assertion failed: Add to Cart validation failed", ae);
                throw ae;
            }

        } catch (Exception e) {
            logger.error("Unexpected exception occurred in TC03_AddToCart", e);
            Assert.fail("Test failed due to exception: " + e.getMessage());
        }

        logger.info("===== TC03_AddToCart TEST FINISHED =====");
    }
}
