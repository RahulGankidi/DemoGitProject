package demo.advantage.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://advantageonlineshopping.com/#/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
