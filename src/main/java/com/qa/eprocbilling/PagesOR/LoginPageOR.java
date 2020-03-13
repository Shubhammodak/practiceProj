package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class LoginPageOR extends PageObject {
	public LoginPageOR(WebDriver driver) {
		super(driver);
		
	}

		// pagefactory
		@FindBy(name = "UserNameEntryField")
		protected
		WebElement Username;

		@FindBy(name = "Password")
		protected
		WebElement Password;

		@FindBy(name = "SubmitUser")
		protected
		WebElement loginbutton;

		@FindBy(xpath = "//div[@id='login_logo']")
		protected
		WebElement logo;
		
		@FindBy(xpath ="//*[@id='demo_text']/font/b")
		protected
		WebElement passwrodError;
		
		@FindBy(xpath ="//div[@id ='demo_text']//b//br")
		protected
		WebElement errormsg;


}
