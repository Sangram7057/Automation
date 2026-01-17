package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonLoginHomePage;
import pageObject.SerachProductHomePageAmazon;
import testBase.BaseClass;

public class TC006_ClickOnProductAndAddToCart extends BaseClass {

	@Test(groups={"Regression", "Master"})
	public void verify_productAddedToCart() {
		
		logger.info("***** Starting TC006_ClickOnProductAndAddToCart *****");
		
		try {
		AmazonLoginHomePage loginPage = new AmazonLoginHomePage(driver);
		SerachProductHomePageAmazon serachProduct = new SerachProductHomePageAmazon(driver);
		driver.get(p.getProperty("appUrl4"));
		logger.info("Providing customer details....");
		loginPage.setEmail("sangramshinde0105@gmail.com");
		loginPage.clickOnContinue();
		loginPage.setPassword("Sangram@2311");
		loginPage.clickOnSignIn();
		
		logger.info("Providing product details and Add to cart....");
		
		serachProduct.searchProductOnAmazon("Iphone 17 Pro");
		serachProduct.clickOnSearchbtn();
		//serachProduct.clickOnPhone();
        serachProduct.clickOnAddToCart();
        
        logger.info("Sucessfully click on add to cart....");
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("***** Finished TC006_ClickOnProductAndAddToCart *****");
	}
}
