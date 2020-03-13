package com.qa.eprocbilling.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.LogoutPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;

public class LogoutPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;
	LogoutPage logoutpage;
	
	public LogoutPageTest(){
		super();
		
	}
	@BeforeMethod
	public void objoglogin() throws Exception {
		loginpage = new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Mainmenu = homepage.clickOnMainmenu();
		
		
	}
	@Test
	public void logoutTest() {
		logoutpage = Mainmenu.clickonLogout();
		driver.switchTo().alert().accept();
		System.out.println("logout successfully");

	}


}
