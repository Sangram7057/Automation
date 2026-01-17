package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtfname;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtlname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement txtpasswordConfirm;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement aggreToggle;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
    WebElement msgConfirmation;
	
	public void setFirstname(String fname) {
		txtfname.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txtlname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tnum) {
		txtTelephone.sendKeys(tnum);
	}
	
	public void setPassword(String pass) {
		txtpassword.sendKeys(pass);
	}
	
	public void setConfirmPassword(String confpass) {
		txtpasswordConfirm.sendKeys(confpass);
	}
	
	public void clickOnToggle() {
		aggreToggle.click();
	}
	
	public void clickOnSubmitBtn() {
		submitBtn.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
}
