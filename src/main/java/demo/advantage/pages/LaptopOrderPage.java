package demo.advantage.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopOrderPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LaptopOrderPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	By LaptopLink = By.xpath("//*[@id=\"laptopsTxt\"]");
	By SelectLaptop = By.linkText("HP Chromebook 14 G1(ENERGY STAR)");
	By AddCartButton = By.xpath("//*[@id=\"productProperties\"]/div[4]/button");
	By CartLink = By.id("shoppingCartLink");
	By CheckoutButton = By.xpath("//*[@id=\"checkOutButton\"]");
	By RegButton = By.xpath("//*[@id=\"registration_btn\"]");
	
	 public void clickonLaptopLink() {
	        WebElement laptopLinkElement = wait.until(ExpectedConditions.elementToBeClickable(LaptopLink));
	        laptopLinkElement.click();
	    }

	    public void selectLaptop() {
	        WebElement selectLaptopElement = wait.until(ExpectedConditions.elementToBeClickable(SelectLaptop));
	        selectLaptopElement.click();
	    }

	    public void addtoCart() {
	        WebElement addCartButtonElement = wait.until(ExpectedConditions.elementToBeClickable(AddCartButton));
	        addCartButtonElement.click();
	    }

	    public void openCart() {
	        WebElement cartLinkElement = wait.until(ExpectedConditions.elementToBeClickable(CartLink));
	        cartLinkElement.click();
	    }

	    public void proceedCheckout() {
	        WebElement checkoutButtonElement = wait.until(ExpectedConditions.elementToBeClickable(CheckoutButton));
	        checkoutButtonElement.click();
	    }

	    public void clickonRegister() {
	        WebElement regButtonElement = wait.until(ExpectedConditions.elementToBeClickable(RegButton));
	        regButtonElement.click();
	    }
	}
