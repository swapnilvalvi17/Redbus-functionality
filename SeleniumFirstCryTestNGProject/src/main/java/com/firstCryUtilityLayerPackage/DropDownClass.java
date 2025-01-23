package com.firstCryUtilityLayerPackage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;

public class DropDownClass extends BaseLayerClassFC{

	public static void handleDropDown(List<WebElement> lsit, int value) throws InterruptedException {
		for (int i = 0; i < value; i++) {
			Thread.sleep(2000);
			lsit.get(i).click();

		}

	}

	{

	}

	

}
