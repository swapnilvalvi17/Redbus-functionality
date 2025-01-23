package com.firstCryBaseLayerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseLayerClassFC {
	
	protected static WebDriver driver;
	
	public static void initialization(String browserName, String url) {
		
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\swapn\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} 
		
		else if (browserName.equals("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			driver = new ChromeDriver(opt);
		} 
		else {
			System.out.println("Please Enter valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);

		
		
	}
	
	public static void closeBrowser() {
		driver.quit();
	}

}
