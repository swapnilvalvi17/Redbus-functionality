package com.firstCryTestLayerPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryPageLayerPackage.ProductClassFC;

public class ProductPageTest extends BaseLayerClassFC{
	
	
	@Parameters({"Quantity"})
	@Test(priority=1)
	public void verifyingProductPageOperations( int quantity) throws InterruptedException {
		
		ProductClassFC pp = new ProductClassFC();
		pp.sort();
		pp.addtoCart(quantity);
	}

}
