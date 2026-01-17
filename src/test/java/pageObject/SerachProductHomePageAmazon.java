package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SerachProductHomePageAmazon extends BasePage {

	public SerachProductHomePageAmazon(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement serachProduct;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement clickOnSerach;
	
	@FindBy(xpath = "//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']//span[contains(text(),'iPhone 17 Pro 256 GB: 15.93 cm (6.3″) Display with')]")
	WebElement selectIphone;
	
	@FindBy(xpath = "//button[@id='a-autoid-5-announce']")
	WebElement clickAddToCart;
	
	public void searchProductOnAmazon(String search) {
		serachProduct.sendKeys(search);
	}
    public void clickOnSearchbtn() {
    	clickOnSerach.click();
    }
		
	public void clickOnPhone() {
		selectIphone.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void clickOnAddToCart() {
		clickAddToCart.click();
		
		//Actions act = new Actions(driver);
        //act.moveToElement(clickAddToCart).click().perform();
        
        //JavascriptExecutor js = (JavascriptExecutor)driver;
    	//js.executeScript("arguments[0].click();", clickAddToCart);
		
		

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", clickAddToCart);
    	
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeClickable(clickAddToCart)).click();
	}
}
