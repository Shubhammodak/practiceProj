package com.qa.eprocbilling.PagesOR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.eprocbilling.pages.PageObject;

public class AddItemPageOR extends PageObject{

	public AddItemPageOR(WebDriver driver) {
		super(driver);
		
	}
	// Add item
	@FindBy(xpath = "//a[contains(text(),'Items')]")
	protected WebElement clickonaddNewItem;
	
	
	@FindBy(xpath = "//input[@placeholder='alpha-numeric only']")
	protected WebElement ItemCode;
	
	@FindBy(xpath = "//input[@name='Description']")
	protected WebElement PartDescriptionS;
	
	@FindBy(xpath = "//input[@name='Description_fr_FR_utf8']" )
	protected WebElement FrançaisDescriptionS;
	
	@FindBy(xpath = "//textarea[@name='LongDescription']" )
	protected WebElement PartDescriptionL;
	
	@FindBy(xpath = "//textarea[@name='LongDescription_fr_FR_utf8']" )
	protected WebElement FrançaisLongDescription;
	
	@FindBy(xpath = "//input[@name='EOQ']" )
	protected WebElement EconomicOrderQuantity;
	
	@FindBy(xpath = "//input[@name='Volume']" )
	protected WebElement PackagedVolume;
	
	@FindBy(xpath = "//input[@name='GrossWeight']" )
	protected WebElement PackagedGrossWeight;
	
	@FindBy(xpath = "//input[@name='NetWeight']" )
	protected WebElement NetWeight;
	
	@FindBy(xpath = "//input[@name='BarCode']" )
	protected WebElement BarCode;
	
	@FindBy(xpath = "//input[@name='DiscountCategory']" )
	protected WebElement DiscountCategory; 
	
	@FindBy(xpath = "//input[@id='PanSize']" )
	protected WebElement PanSize;
	
	@FindBy(xpath = "//input[@id='ShrinkageFactor']" )
	protected WebElement ShrinkageFactor;
	
	@FindBy(xpath = "//input[@name='submit']")
	protected WebElement submit;
	
}
