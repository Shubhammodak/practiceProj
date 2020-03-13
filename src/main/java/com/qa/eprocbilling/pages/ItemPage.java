package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.ItemPageOR;

public class ItemPage extends ItemPageOR {

	public ItemPage(WebDriver driver) {
		super(driver);
		
	}
	public String VerifyTiltle(){
		 return driver.getTitle();
	}
	
	public AddItemPage clickonaddNewitem() {
		System.out.println("I am in ItemPage | clickonaddNewitem");
		AddaNewItemLink.click();
		return new AddItemPage(driver);
	}
}
