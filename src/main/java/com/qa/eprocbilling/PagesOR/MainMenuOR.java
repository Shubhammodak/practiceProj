package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class MainMenuOR extends PageObject {

	public MainMenuOR(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//div[@id='MainMenuDiv']//ul//li[@class='main_menu_selected']")
	protected WebElement salesPageLink;
	
	@FindBy(linkText="Receivables")
	protected WebElement receivablesPageLink;
	
	@FindBy(linkText="Purchases")
	protected WebElement purchasesPageLink;
	
	@FindBy(linkText="Payables")
	protected WebElement PayablesPageLink;
	
	@FindBy(linkText="Inventory")
	protected WebElement InventoryPageLink;
	
	@FindBy(linkText="Manufacturing")
	protected WebElement ManufacturingPageLink;
	
	@FindBy(linkText="Setup")
	protected WebElement SetupPageLink;
	
	@FindBy(linkText="Utilities")
	protected WebElement UtilitiesPageLink;
	
	@FindBy(linkText="Customers")
	protected WebElement CustomersPageLink;
	
	@FindBy(linkText="Items")
	protected WebElement ItemPageLink;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	protected WebElement LogoutPageLink;
}
