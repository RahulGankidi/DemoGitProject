package demo.advantage.tests;

import org.testng.annotations.Test;

import demo.advantage.pages.BasePage;
import demo.advantage.pages.LaptopOrderPage;

public class LaptopOrderTest extends BasePage {
	
	LaptopOrderPage laptoporderpage;
	
	@Test
	public void laptopOrder() {
		laptoporderpage = new LaptopOrderPage(driver);
		laptoporderpage.clickonLaptopLink();
		laptoporderpage.selectLaptop();
		laptoporderpage.addtoCart();
		laptoporderpage.openCart();
		laptoporderpage.proceedCheckout();
		laptoporderpage.clickonRegister();
	}

}
