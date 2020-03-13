package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.CustomerPageOR;

public class CustomerPage extends CustomerPageOR  {

	public CustomerPage(WebDriver driver) {
		super(driver);
		
	}
	public String VerifyTiltle(){
		 return driver.getTitle();
	}
	
	public AddNewCustomerPage clickonaddNewCustomer() {
		AddaNewCustomerLink.click();
		return new AddNewCustomerPage(driver);
	}

	
}
