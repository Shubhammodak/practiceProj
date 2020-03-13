package com.qa.eprocbilling.test;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		//initialization();
		loginpage = new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void validatePageTitle() {
		String acttitle = homepage.verifytitle();
		System.out.println(acttitle);
		AssertJUnit.assertEquals(acttitle, "Main Menu");
	}

	@Test(priority = 2)
	public void onMainmenupage() {
		homepage.clickOnMainmenu();

	}

}
