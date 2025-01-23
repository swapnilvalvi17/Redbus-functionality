package com.firstCryTestLayerPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.firstCryBaseLayerPackage.BaseLayerClassFC;
import com.firstCryPageLayerPackage.HomePageClass;

public class HomePageTesting extends BaseLayerClassFC{
	
	@Parameters({"Browser", "Url"})
	@BeforeSuite
	public void initializingBrowser(String browser, String url) {
		
		BaseLayerClassFC.initialization(browser, url);
	}
	
	@Parameters({"Producttype"})
	@Test(priority=1)
	public void verifyingHomePageOperations(String ProductType) throws InterruptedException {
		HomePageClass hp = new HomePageClass();
		hp.searchProduct(ProductType);
	}
	
	@AfterSuite
	public void closingTheBrowser() {
		BaseLayerClassFC.closeBrowser();
	}

}
