package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class TC003_LoginDDT extends BaseClass {

	@Test(dataProvider="LoginData", dataProviderClass=utilities.DataProviders.class, groups="Datadriven")
	public void verify_loginDDT(String username, String pwd, String exp) {
	    logger.info("**** Starting TC003_LoginDDT *****");

	    try {
	        LoginPage lp = new LoginPage(driver);
	        lp.setUsername(username);
	        lp.setPassword(pwd);
	        lp.clickOnSubmit();

	        MyAccountPage macc = new MyAccountPage(driver);
	        boolean targetPage = macc.isMyaccountPageExist();

	        if (exp.equalsIgnoreCase("valid")) {
	            if (targetPage) {
	                macc.clickLogout();
	                Assert.assertTrue(true, "Login passed as expected.");
	            } else {
	                Assert.fail("Login failed but expected valid login.");
	            }
	        } else if (exp.equalsIgnoreCase("invalid")) {
	            if (targetPage) {
	                macc.clickLogout();
	                Assert.fail("Login passed but expected invalid login.");
	            } else {
	                Assert.assertTrue(true, "Login failed as expected.");
	            }
	        }
	    } catch (Exception e) {
	        Assert.fail("Test execution failed due to exception: " + e.getMessage());
	    }

	    logger.info("**** Finished TC003_LoginDDT *****");
	}

	}

