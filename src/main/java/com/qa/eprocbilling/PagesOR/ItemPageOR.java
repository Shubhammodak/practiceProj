package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class ItemPageOR extends PageObject {

	public ItemPageOR(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText ="Insert New Item")
	protected WebElement AddaNewItemLink;
	
}
