package com.qa.eprocbilling.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.eprocbilling.pages.HomePage;
import com.qa.eprocbilling.pages.LoginPage;
import com.qa.eprocbilling.testbase.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() throws Exception {
		super();

	}

	@BeforeMethod
	public void objoglogin() throws Exception {
		loginpage = new LoginPage(driver);
	}


	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String acttitle = loginpage.verifypageTitle();

		Assert.assertEquals(acttitle, "webERP Login screen");

	}

	@Test(priority = 4)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 2)
	public void validateLogo() {
		boolean logo = loginpage.eprocbillingLogo();
		Assert.assertTrue(logo);

	}

	@Test(priority = 3)
	public void invalidLoginPageTest() {

		String Pwderror = loginpage.validateInvalidLoginDetails("khjhnbyb", "hhftyyyg");
		System.out.println(Pwderror);
		Assert.assertEquals(Pwderror, "incorrect password");

	}
	
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}


	
}