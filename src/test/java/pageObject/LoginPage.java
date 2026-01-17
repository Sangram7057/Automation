package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='username']")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassord;
	
	@FindBy(xpath="//button[@id='submit']")
	WebElement btnSubmit;
	
	public void setUsername(String uname) {
		txtUsername.sendKeys(uname);
    }
    public void setPassword(String pass) {
    	txtPassord.sendKeys(pass);
    }
    public void clickOnSubmit() {
    	btnSubmit.click();
    }
}
