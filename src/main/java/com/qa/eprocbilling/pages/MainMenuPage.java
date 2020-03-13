package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.MainMenuOR;

public class MainMenuPage extends MainMenuOR {
	public MainMenuPage(WebDriver driver) {
		super(driver);

	}

	public String validateMenuPagetitle() {
		return driver.getTitle();
	}

	/*public PurchasePage validatePurchasesPageLink() {
		purchasesPageLink.click();
		return new PurchasePage();
	}

	public SalesPage salesPageLinkTest() {
		salesPageLink.click();
		return new SalesPage();
	}*/

	public CustomerPage validatecustomerpageLink() {
		CustomersPageLink.click();
		return new CustomerPage(driver);

	}
	public ItemPage validateitempageLink() {
		ItemPageLink.click();
		return new ItemPage(driver);

	}

	public ItemPage clickonaddNewitem() {
		ItemPageLink.click();
		 return new ItemPage(driver);
	}
	
	public LogoutPage clickonLogout(){
		LogoutPageLink.click();
		
		 return new LogoutPage(driver);
	}
}
