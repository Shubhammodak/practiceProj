package com.qa.eprocbilling.test;

import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.AddItemPage;
import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.ItemPage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;
import com.qa.eprocbilling.util.ExcelRead;

public class AddItemPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;
	ItemPage Itempage;
	AddItemPage addnewItem;

	AddItemPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		// initialization();
		loginpage = new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Mainmenu = homepage.clickOnMainmenu();
		Thread.sleep(2000);
		Itempage = Mainmenu.clickonaddNewitem();
		
		addnewItem = Itempage.clickonaddNewitem();
		

	}

	@DataProvider
	public Object[][] getItemData()
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

		Object[][] data = ExcelRead.getTestData("AddItemDetails");

		return data;
	}

	@Test(dataProvider = "getItemData")

	public void ItemDetailTest(String Itemcode, String PartdescriptionS, String FrançaisdescriptionS,
			String PartdescriptionL, String FrançaislongDescription, String EconomicorderQuantity,
			String Packagedvolume, String PackagedgrossWeight, String Netweight, String Barcode,
			String Discountcategory, String Pansize, String Shrinkagefactor) {
		addnewItem.insertItemDetail(Itemcode, PartdescriptionS, FrançaisdescriptionS, PartdescriptionL,
				FrançaislongDescription, EconomicorderQuantity, Packagedvolume, PackagedgrossWeight, Netweight, Barcode,
				Discountcategory, Pansize, Shrinkagefactor);
		System.out.println("ItemDetailTest");

	}
}
