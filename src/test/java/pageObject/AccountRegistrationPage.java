package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

public AccountRegistrationPage(WebDriver driver) {
		
		super(driver);
	}
	
    @FindBy(xpath="//input[@name='username']")
    WebElement txtUsername;
    
    @FindBy(xpath="//input[@name='fname']")
    WebElement txtFirstname;
    
    @FindBy(xpath="//input[@name='lname']")
    WebElement txtLastname;
    
    @FindBy(xpath="//input[@name='email']")
    WebElement txtEmail;
    
    @FindBy(xpath="//input[@name='country_id']")
    WebElement txtCountry;
    
    @FindBy(xpath="//input[@name='password']")
    WebElement txtPassword;
    
    @FindBy(xpath="//button[@type='submit']")
    WebElement btnContinue;
    
    @FindBy(xpath="//p[text()='Your registration is completed. We will contact with you soon. Thank you !']")
    WebElement msgConfirmation;
    
    @FindBy(xpath="//input[@name='agree']")
    WebElement clickOnToggle;
    
    @FindBy(xpath="//input[@type='submit']")
    WebElement clickRegister;
    
    @FindBy(xpath="//label[text()='LinkedIn']")
    WebElement clickOnLinkedIn;
    
    @FindBy(xpath="//input[@id='nf-field-20']")
    WebElement entrPhone;
	
    public void setFirstname(String fname) {
    	txtFirstname.sendKeys(fname);
    }
    public void setLastname(String lname) {
    	txtLastname.sendKeys(lname);
    }
    public void setEmail(String email) {
    	txtEmail.sendKeys(email);
    }
    public void setPassword(String pass) {
    	txtPassword.sendKeys(pass);
    }
    public void clickOnLinkedInToggle() {
    	clickOnLinkedIn.click();
    }
    public void enterPhoneNum(String phone) {
    	entrPhone.sendKeys(phone);
    }
    
    public void clickContinue() {
    	//Sol 1
    	btnContinue.click();
    	
    	//Sol 2
    	//btnContinue.submit();

        //Sol 3
        //Actions act = new Actions(driver);
        //act.moveToElement(btnContinue).click().perform();

        //Sol 4
        //btnContinue.sendKeys(Keys.RETURN);
        
        //Sol 5
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
 
        //Sol 6
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", btnContinue);
        
    }
    public void clickOnRegister() {
    	clickRegister.click();
    	
    }
    public void clickOnToggleBtn() {
    	clickOnToggle.click();
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
