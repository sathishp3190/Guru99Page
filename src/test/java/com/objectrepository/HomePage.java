package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class HomePage extends BaseClass {
public HomePage() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//a[text()='Add Customer'])[1]")
private WebElement Addcustomer;

@FindBy(xpath="//a[text()='Add Tariff Plan']")
private WebElement Addtraffi;

public WebElement getAddcustomer() {
	return Addcustomer;
}

public WebElement getAddtraffi() {
	return Addtraffi;
}


}
