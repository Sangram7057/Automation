package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductAddingToCart extends BasePage{

	public ProductAddingToCart(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement btnProduct;
	
	@FindBy(xpath = "//div[@class='col-sm-4'][4]")
	WebElement btnaddToCart;
	
	@FindBy(xpath = "//a[normalize-space()='Cart']//i[@class='fa fa-shopping-cart']")
	WebElement btnCart;
	
	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	WebElement btnPopCart;
	
	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement btnContinueShopping;
	
	@FindBy(xpath = "//img[@alt='Product Image']")
	WebElement imgProduct;
	
	public void clickOnProducts() {
		btnProduct.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	public void clickOnAddToCart() {
		btnPopCart.click();
	}
	public void clickOnContinueShopping() {
		btnContinueShopping.click();
	}
	public void clickOnCart() {
		btnCart.click();
	}
	public String verifyProductAddedToCart() {
		
		try {
			return(imgProduct.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	}
	
}
