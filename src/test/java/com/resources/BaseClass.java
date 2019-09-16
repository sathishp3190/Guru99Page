package com.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
	public static void Launch(String url) {
		System.setProperty("webdriver.chrome.driver", "G:\\Guru99\\Driver\\chromedriver76.exe");
		 driver = new ChromeDriver();
		 driver.get(url);
	}
	
	public static void FillDetails(WebElement element, String value) {
		element.sendKeys(value);
		
	}
	public static void Click(WebElement ele) {
		ele.click();
	}
	
}
