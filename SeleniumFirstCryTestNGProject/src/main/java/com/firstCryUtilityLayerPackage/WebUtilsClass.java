package com.firstCryUtilityLayerPackage;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;

public class WebUtilsClass extends BaseLayerClassFC {

	public static void sendKeys(WebElement wb, String value) {

		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}

	public static void addAndRemoveProducts(List<WebElement> product, List<WebElement> addToCartButtons, int quantity) {

		Actions act = new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		for (int i = 0; i < quantity; i++) {
			if (i >= product.size() || i >= addToCartButtons.size())
			{
				break;
			}
			js.executeScript("arguments[0].scrollIntoView(true);",addToCartButtons.get(i));
			js.executeScript("arguments[0].click();",addToCartButtons.get(i));
		}
	}

}
