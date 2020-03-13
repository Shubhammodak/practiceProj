package com.qa.eprocbilling.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.eprocbilling.base.Base;

public class PageObject extends Base  {
public  WebDriver driver;
	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
