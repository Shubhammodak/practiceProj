package com.qa.eprocbilling.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.eprocbilling.base.Base;
import com.qa.eprocbilling.util.TestUtil;

public class TestBase extends Base{

	public static WebDriver driver;
	
	@BeforeMethod
	public static void OpenBrowser() {
		String brz = prop.getProperty("browser");
		if (brz.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:/Testi/project/EprocbillingProject/src/main/java/com/qa/eprocbilling/driver/chromedriver79.exe");
			driver = new ChromeDriver();
		} else {
			String ff = prop.getProperty("firefox");
			System.out.println("firefox");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implycit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	@AfterMethod
	public void quitebr() {
		driver.quit();

	}

}
