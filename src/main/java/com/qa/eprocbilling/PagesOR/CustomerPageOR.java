package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class CustomerPageOR extends PageObject {

	public CustomerPageOR(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText = "Add a New Customer")
	protected WebElement AddaNewCustomerLink;
	

}
