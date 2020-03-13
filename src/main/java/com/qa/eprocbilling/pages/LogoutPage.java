package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.LogoutPageOR;

public class LogoutPage extends LogoutPageOR {

	public LogoutPage(WebDriver driver) {
		super(driver);

	}
	
	public String verifyTitle(){
		return driver.getTitle();
	}
	
	public void clickOnLogout(){
	
			
		
		logoutlink.click();
		driver.switchTo().alert().accept();
		//return new LoginPage(driver);
		
	}

}
