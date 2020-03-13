package com.qa.eprocbilling.test;

import org.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.AddNewCustomerPage;
import com.qa.eprocbilling.pages.CustomerPage;
import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.pages.MainMenuPage;
import com.qa.eprocbilling.testbase.TestBase;
import com.qa.eprocbilling.util.ExcelRead;

public class AddNewCustomerPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MainMenuPage Mainmenu;
	CustomerPage customerPage;
	AddNewCustomerPage addnewcust;

	AddNewCustomerPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		// initialization();
		loginpage = new LoginPage(driver);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Mainmenu = homepage.clickOnMainmenu();
		Thread.sleep(2000);
		customerPage = Mainmenu.validatecustomerpageLink();
		
		addnewcust = customerPage.clickonaddNewCustomer();

	}

	@DataProvider
	public Object[][] getCustomerData()
			throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {

		Object[][] data = ExcelRead.getTestData("AddCustDetails");

		return data;
	}

	@Test(dataProvider = "getCustomerData")
	public void customerpageTest(String custcode, String custname, String custaddres1,String custcity,String CustomerState1, String custpostlcode,
			String custcountry, String salestype,String custDiscount,String custDcode,String custPymtDisc, String taxref ) {
		
		addnewcust.insertCustomerDetail(custcode, custname, custaddres1, custcity, CustomerState1, custpostlcode,
				custcountry, salestype, custDiscount, custDcode, custPymtDisc,  taxref);

		Assert.assertEquals("", "");
		System.out.println("cust page tset");
	}

}
