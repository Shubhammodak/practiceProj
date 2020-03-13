package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class LogoutPageOR extends PageObject{
	public LogoutPageOR(WebDriver driver){
		
		super(driver);
		
	}
	@FindBy(linkText = "Logout")
	protected  WebElement logoutlink;

}
