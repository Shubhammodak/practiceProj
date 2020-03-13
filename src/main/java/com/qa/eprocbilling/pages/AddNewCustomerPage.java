package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.eprocbilling.PagesOR.AddNewCustomerPageOR;

public class AddNewCustomerPage extends AddNewCustomerPageOR {
	Select select;

	public AddNewCustomerPage(WebDriver driver) {
		super(driver);

	}
	
	public String validatepageTitle(){
		return driver.getTitle();
	}
	
	public void insertCustomerDetail(String custcode, String custname, String custaddres1,String custcity,String CustomerState1, String custpostlcode,
			String custcountry, String salestype,String custDiscount,String custDcode,String custPymtDisc, String taxref ) {
		
		customerCode.sendKeys(custcode);
		customerName.sendKeys(custname);
		customerAddress1.sendKeys(custaddres1);
		
		CustomerCity.sendKeys(custcity);
		CustomerState.sendKeys(CustomerState1);
		customerAddressPostalcode.sendKeys(custpostlcode);

		Select select1 = new Select(selectCountry);
		select1.selectByVisibleText(custcountry);

		Select select2 = new Select(selectSalesType);
		select2.selectByVisibleText(salestype);

		/*selectdate.click();*/
		SelectDiscount.sendKeys(custDiscount);
		SelectDiscountcode.sendKeys(custDcode);
		
		SelectPymtDiscount.sendKeys(custPymtDisc);
		
		
		SelectTaxReft.sendKeys(taxref);
		 /*select = new Select(SelectPaymentTerms);
		select.selectByVisibleText("CashOnly");
		SelectCreditLimit.sendKeys(custcrdlimit);
		 select = new Select(SelectcreditStatus);
		select.selectByVisibleText("Watch");
		

		 select = new Select(selectCurrency);
		select.selectByVisibleText(currency);
		

		 select = new Select(SelectcustomrLanguage);
		select.selectByVisibleText("English United Kingdom");
		
		 select = new Select(SelectCustomerPOLine);
		select.selectByVisibleText("NO");
		
		 select = new Select(SelectinvoicAdresing);
		select.selectByVisibleText("Address to HO");*/
		
		
		submit.click();
		
		
	}
	

}
