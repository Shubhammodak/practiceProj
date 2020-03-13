package com.qa.eprocbilling.test;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;

public class MainMenuTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;

	public MainMenuTest() {
		super();
	}


	@BeforeMethod
	public  void setUp() {
		//initialization();
		loginpage=new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Mainmenu=  homepage.clickOnMainmenu();
		
	}
	@Test(priority=1)
	public  void menupagetitleTest() {
		
	String title=	Mainmenu.validateMenuPagetitle();
	System.out.println(title);
	AssertJUnit.assertEquals(title,"Main Menu");
	
	}
	/*@Test(priority=2)
	public void purchaseLinkTest() {
		
		Mainmenu.validatecustomerpageLink();
		AssertJUnit.assertTrue(true);
		
}*/
			
	}
