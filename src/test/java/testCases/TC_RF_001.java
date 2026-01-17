package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistration;
import testBase.BaseClass;

public class TC_RF_001 extends BaseClass {

	@Test
	public void verify_Account_Registration_Page() {
		
		logger.info("******* Started TC_RF_001_Account_Registration ********");
		
		try {
		
		AccountRegistration repage = new AccountRegistration(driver);
		driver.get(p.getProperty("appUrl3"));
		logger.info("Providing customer details....");
		repage.setFirstname(randomString().toUpperCase());
		repage.setLastname(randomString().toUpperCase());
		repage.setEmail(randomString() + "@gmail.com");
		repage.setTelephone(randomNumber());
		repage.setPassword("abc12345");
		repage.setConfirmPassword("abc12345");
		repage.clickOnToggle();
        repage.clickOnSubmitBtn();
		
        logger.info("Validating expected message...");
        
        String confmsg = repage.getConfirmationMsg();
        if(confmsg.equals("Your Account Has Been Created!")) {
        	Assert.assertTrue(true);
        }
        else {
        	logger.error("Test Failed...");
        	logger.debug("Debug logs...");
        	Assert.assertTrue(false);
        }
        
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("****** Finished TC_RF_001_Account_Registration ******");
	}
}
