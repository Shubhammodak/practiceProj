package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.eprocbilling.PagesOR.HomePageOR;

public class HomePage extends HomePageOR {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public String verifytitle() {
		return driver.getTitle();

	}

	public MainMenuPage clickOnMainmenu() {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(mainmenu));
		mainmenu.click();
		return new MainMenuPage(driver);
	}

}
