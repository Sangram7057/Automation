package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h1[text()='Logged In Successfully']") //My account page loading
	WebElement msgHeading;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement lnkLogout;
	
	public boolean isMyaccountPageExist() {
		
		try {
		return (msgHeading.isDisplayed());
		}
		catch(Exception e) {
			
			return false;
		}
	}
	public void clickLogout() {
		lnkLogout.click();
		
	}
}
