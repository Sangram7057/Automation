package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.ProductAddingToCart;
import testBase.BaseClass;

public class TC007_ProductAddedToCart extends BaseClass {

	@Test(groups = {"Regression", "Master"})
	public void verify_ProductAddedToCart() {
		
		logger.info("***** Starting TC007_ProductAddedToCart *****");
		
		try {
			ProductAddingToCart product = new ProductAddingToCart(driver);
			
			driver.get(p.getProperty("appUrl5"));
			product.clickOnProducts();
            product.clickOnAddToCart();
            product.clickOnContinueShopping();
            product.clickOnCart();
            product.verifyProductAddedToCart();
            
            logger.info("Sucessfully click on add to cart....");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("***** Finished TC007_ProductAddedToCart*****");
	}
}
