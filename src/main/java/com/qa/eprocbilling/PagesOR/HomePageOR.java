package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class HomePageOR extends PageObject {

	public HomePageOR(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//*[@id='menu']/li[1]/a")
	protected	WebElement mainmenu;

}
