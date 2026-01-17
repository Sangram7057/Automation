package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonLoginHomePage extends BasePage {

	public AmazonLoginHomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//input[@type='email']") 
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@type='submit']") 
	WebElement btnContinue;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnSign;
	
	@FindBy(xpath = "//a[@aria-label='Amazon.in']")
	WebElement txtAmazon;
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void clickOnContinue() {
		btnContinue.click();
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void clickOnSignIn() {
		btnSign.click();
	}
	
	public String getLoginSucessfullMsg() {
		
		try {
			return(txtAmazon.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
}
