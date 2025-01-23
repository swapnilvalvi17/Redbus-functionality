package com.firstCryPageLayerPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryUtilityLayerPackage.DropDownClass;
import com.firstCryUtilityLayerPackage.WebUtilsClass;

public class CartClassFC extends BaseLayerClassFC{

//	@FindBy(xpath="//a[text()='LOGIN TO PLACE ORDER']")
//	WebElement LoginButton;
	
	@FindBy(id="cty_pin")
	WebElement pincodeBox;
	
	@FindBy(xpath="//div[@class='J13M_42 cl_ff apply-pin apply_btn btn_sb6']")
	WebElement applyPin;
	
	@FindBys(@FindBy(xpath="//span[@class='remove J12M_42']"))
	List<WebElement> removeButton;
	
	public CartClassFC() {
		PageFactory.initElements(driver, this);
	}
	
	public void pinAndRemove(String pincode, int remove) throws InterruptedException {
		
		WebUtilsClass.sendKeys(pincodeBox, pincode);
		Thread.sleep(2000);
		WebUtilsClass.click(applyPin);
		
		
	}
}
