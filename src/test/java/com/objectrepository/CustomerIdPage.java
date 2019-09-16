package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.resources.BaseClass;

public class CustomerIdPage extends BaseClass {

	@FindBy(xpath="//a[@class='button']")
	private WebElement HomeButton;

	public WebElement getHomeButton() {
		return HomeButton;
	}
	
}
