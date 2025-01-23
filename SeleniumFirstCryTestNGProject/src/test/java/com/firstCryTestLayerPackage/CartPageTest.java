package com.firstCryTestLayerPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryPageLayerPackage.CartClassFC;

public class CartPageTest extends BaseLayerClassFC{
	
	@Parameters({"Pincode", "Quantity"})
	@Test(priority=1)
	public void verifyingCartClassOperations(String pincode, int quantity) throws InterruptedException {
		CartClassFC cc = new CartClassFC();
		cc.pinAndRemove("415712", 3);
	
	}

}
