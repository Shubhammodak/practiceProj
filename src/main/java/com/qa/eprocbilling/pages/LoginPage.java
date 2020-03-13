package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.LoginPageOR;

public class LoginPage extends LoginPageOR {

	public LoginPage(WebDriver driver)  {
		super(driver);
		//PageFactory.initElements(driver, this);
	}

	public String verifypageTitle() {
		return driver.getTitle();

	}

	public boolean eprocbillingLogo() {
		return logo.isDisplayed();
	}

	public String validateInvalidLoginDetails(String un,String pwd) {
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		loginbutton.click();
		return passwrodError.getText();
	}

	public HomePage login(String un, String pwd) {
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		loginbutton.click();
		return new HomePage(driver);
	}
	

}