package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups={"Sanity", "Master"})
	public void verify_Login() {
		
		logger.info("**** Starting TC002_LoginTest *****");
		
		try {
		//Home Page
		//HomePage hp = new HomePage(driver);
		//hp.clickOnLogin();
		
		//Login Page
		LoginPage lp = new LoginPage(driver);
		driver.get(p.getProperty("appUrl2"));
		lp.setUsername(p.getProperty("username"));
		lp.setPassword(p.getProperty("password"));
		lp.clickOnSubmit();
		
		
		//My Account Page
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyaccountPageExist();
		
		//Assert.assertEquals(targetPage, true, "Login Failed");
		Assert.assertTrue(targetPage);
		
		}
		catch(Exception e) {
			
			Assert.fail();
		}
		
		logger.info("**** Finished TC002_LoginTest ****");
	}
}
