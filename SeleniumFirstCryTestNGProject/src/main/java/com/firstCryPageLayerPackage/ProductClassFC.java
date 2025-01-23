package com.firstCryPageLayerPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryUtilityLayerPackage.DropDownClass;
import com.firstCryUtilityLayerPackage.WebUtilsClass;

public class ProductClassFC extends BaseLayerClassFC{
	
	@FindBy(xpath="//span[@class='arrow']")
	WebElement sortArrow;
	
	@FindBy(xpath="//ul[@class='sort-menu sort-hide L12_42']/li/a[text()='Price']")
	WebElement selectSortType;
	
	@FindBys(@FindBy(xpath="//div[@class='lblock lft']"))
	List<WebElement> product;
	
	@FindBys(@FindBy(xpath="//div[@class='bn_btn M14_white li_ml lft ga_bn_btn_addcart']"))
	List<WebElement> addToCartButtons;
	
	@FindBy(xpath="//span[@class='prodQuant cart-icon B18_orange paddinglft']")
	WebElement cartBox;
	
	public ProductClassFC() {
		PageFactory.initElements(driver, this);
	}
	
	public void sort() throws InterruptedException{
		
		WebUtilsClass.click(sortArrow);
		Thread.sleep(2000);
		WebUtilsClass.click(selectSortType);
		Thread.sleep(2000);
		
		
		
		
	}
	
	public void addtoCart(int quantity) throws InterruptedException {
		
		WebUtilsClass.addAndRemoveProducts(product, addToCartButtons, quantity);
		Thread.sleep(2000);
		WebUtilsClass.click(cartBox);
	}
}
