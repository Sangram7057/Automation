package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	
	@Test(groups={"Regression", "Master"})
	public void verify_account_registration() {
		
		
		logger.info("****** Started TC001_AccountRegistrationTest ******");
		
		//HomePage hp = new HomePage(driver);
		//hp.clickMyAccount();
		//hp.clickRegister();
		
		try {
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		driver.get(p.getProperty("appUrl1"));;
		logger.info("Providing customer details....");
		regpage.setFirstname(randomString().toUpperCase());
		regpage.setLastname(randomString().toUpperCase());
		regpage.setEmail(randomString() + "@gmail.com");
		regpage.enterPhoneNum(randomNumber());
		
		//String password = randomAlphaNumeric();
		//regpage.setPassword(password);
		//regpage.clickOnToggleBtn();
		//regpage.clickContinue();
		regpage.clickOnLinkedInToggle();
		regpage.clickOnRegister();
		
		logger.info("Validating expected message...");
		String confmsg = regpage.getConfirmationMsg();
		if(confmsg.equals("Your registration is completed. We will contact with you soon. Thank you !")) {
			Assert.assertTrue(true);
		}
		else {
			logger.error("Test Failed....");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(confmsg, "Your registration is completed. We will contact with you soon. Thank you !");
		}
		catch(Exception e) {
			
			Assert.fail();
		}
	    logger.info("***** Finished TC001_AccountRegistrationTest *****");
	}
}
