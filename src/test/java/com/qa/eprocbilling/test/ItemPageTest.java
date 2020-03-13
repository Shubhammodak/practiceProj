package com.qa.eprocbilling.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.ItemPage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;

public class ItemPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;
	ItemPage itempage;
	public ItemPageTest(){
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		// initialization();
		loginpage = new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Mainmenu = homepage.clickOnMainmenu();
		itempage = Mainmenu.validateitempageLink();
		
	}
	@Test
	public void chektitle(){
	String Acttitle= itempage.VerifyTiltle();
	System.out.println(Acttitle);
	Assert.assertEquals(Acttitle, "Search Inventory Items");
	
}
	@Test
	public void searchItem(){
		
	}
}
