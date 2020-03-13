package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class AddNewCustomerPageOR extends PageObject {

	public AddNewCustomerPageOR(WebDriver driver) {
		super(driver);

	}

	// Add a New Customer
	

	@FindBy(xpath = "//input[@name='DebtorNo']")
	protected WebElement customerCode;

	@FindBy(xpath = "//input[@name='CustName']")
	protected WebElement customerName;

	@FindBy(xpath = "//input[@name='Address1']")
	protected WebElement customerAddress1;
	
	@FindBy(xpath = "//input[@name='Address3']")
	protected WebElement CustomerCity;
	
	@FindBy(xpath = "//input[@name='Address4']")
	protected WebElement CustomerState;

	@FindBy(xpath = "//input[@name='Address5']")
	protected WebElement customerAddressPostalcode;

	@FindBy(xpath = "//select[@name='Address6']")
	protected WebElement selectCountry;

	@FindBy(xpath = "//select[@name='SalesType']")
	protected WebElement selectSalesType;

	@FindBy(xpath = "//input[@name='Discount']")
	protected WebElement SelectDiscount;
	
	@FindBy(xpath = "//input[@name='DiscountCode']")
	protected WebElement SelectDiscountcode;
	
	@FindBy(xpath = "//input[@name='PymtDiscount']")
	protected WebElement SelectPymtDiscount;
	
	@FindBy(xpath = "//input[@name='TaxRef']")
	protected WebElement SelectTaxReft;

	/*@FindBy(xpath = "//select[@name='CurrCode']")
	protected WebElement selectCurrency;
	
	/*@FindBy(xpath = "//select[@name='CreditLimit']")
	protected WebElement SelectCreditLimit;
	
	@FindBy(xpath = "//select[@name='PaymentTerms']")
	protected WebElement SelectPaymentTerms;

	@FindBy(xpath = "//select[@name='HoldReason']")
	protected WebElement SelectcreditStatus;
	
	@FindBy(xpath = "//select[@name='LanguageID']")
	protected WebElement SelectcustomrLanguage;
	
	@FindBy(xpath = "//select[@name='CustomerPOLine']")
	protected WebElement SelectCustomerPOLine;
	
	@FindBy(xpath = "//select[@name='AddrInvBranch']")
	protected WebElement SelectinvoicAdresing;*/
	
	@FindBy(xpath = "//input[@name='submit']")
	protected WebElement submit;
}
