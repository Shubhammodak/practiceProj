package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;

import com.qa.eprocbilling.PagesOR.AddItemPageOR;

public class AddItemPage extends AddItemPageOR {

	public AddItemPage(WebDriver driver) {
		super(driver);
		

	}

	public String validatepageTitle() {
		return driver.getTitle();
	}

	public void insertItemDetail(String Itemcode, String PartdescriptionS, String FrançaisdescriptionS,
			String PartdescriptionL, String FrançaislongDescription, String EconomicorderQuantity,
			String Packagedvolume, String PackagedgrossWeight, String Netweight, String Barcode,
			String Discountcategory, String Pansize, String Shrinkagefactor) {

		ItemCode.sendKeys(Itemcode);
		
		PartDescriptionS.sendKeys(PartdescriptionS);
		
		FrançaisDescriptionS.sendKeys(FrançaisdescriptionS);
		
		PartDescriptionL.sendKeys(PartdescriptionL);
		
		FrançaisLongDescription.sendKeys(FrançaislongDescription);
		
		EconomicOrderQuantity.sendKeys(EconomicorderQuantity);
		
		PackagedVolume.sendKeys(Packagedvolume);
		
		PackagedGrossWeight.sendKeys(PackagedgrossWeight);
		
		NetWeight.sendKeys(Netweight);
	
		BarCode.sendKeys(Barcode);
		
		DiscountCategory.sendKeys(Discountcategory);
		
		PanSize.sendKeys(Pansize);
		
		ShrinkageFactor.sendKeys(Shrinkagefactor);
		

		submit.click();

	}
}
