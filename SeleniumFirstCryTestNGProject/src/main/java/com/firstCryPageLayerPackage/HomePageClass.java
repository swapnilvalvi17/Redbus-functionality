package com.firstCryPageLayerPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryUtilityLayerPackage.WebUtilsClass;

public class HomePageClass extends BaseLayerClassFC{

	@FindBy(id="search_box")
	WebElement seachBox;
	
	@FindBy(xpath="//span[@class='search-button']")
	WebElement searchButon;
	
	public HomePageClass() {
		PageFactory.initElements(driver, this);
	}
	
	


public void searchProduct(String productType) throws InterruptedException {
	Actions act = new Actions(driver);
	WebUtilsClass.click(seachBox);
	WebUtilsClass.sendKeys(seachBox, productType);
	//act.keyDown(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	WebUtilsClass.click(searchButon);
	
}
}
