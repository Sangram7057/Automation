package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AmazonLoginHomePage;
import testBase.BaseClass;

public class TC005_AmazonHomePage extends BaseClass {

	@Test(groups={"Regression", "Master"})
	public void verify_AmazonLoginSucessfull() {
		
		logger.info("***** Starting TC005_AmazonHomaPage *****");
		
		try {
			AmazonLoginHomePage loginPage = new AmazonLoginHomePage(driver);
			driver.get(p.getProperty("appUrl4"));
			logger.info("Providing customer details....");
			loginPage.setEmail("sangramshinde0105@gmail.com");
			loginPage.clickOnContinue();
			loginPage.setPassword("Sangram@2311");
			loginPage.clickOnSignIn();
			
			logger.info("Validating HomaPage Header...");
			
			String header = loginPage.getLoginSucessfullMsg();
			if(header.equals(".in")) {
				Assert.assertTrue(true);
			}
			else {
				logger.error("Test Failed....");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);
			}
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}
}
