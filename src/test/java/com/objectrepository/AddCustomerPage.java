package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class AddCustomerPage extends BaseClass {
 public AddCustomerPage() {
	 PageFactory.initElements(driver, this);
 } 
 @FindBy(xpath="//label[@for='done']")
 private WebElement donebutton;
 @FindBy(id="fname")
 private WebElement firstname;
 @FindBy(id="lname")
 private WebElement lastname;
 @FindBy(id="email")
 private WebElement email;
 @FindBy(name="addr")
 private WebElement address;
 @FindBy(id="telephoneno")
 private WebElement phno;
 @FindBy(xpath="//input[@type='submit']")
 private WebElement submitbutton;
public WebElement getDonebutton() {
	return donebutton;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmail() {
	return email;
}
public WebElement getAddress() {
	return address;
}
public WebElement getPhno() {
	return phno;
}
public WebElement getSubmitbutton() {
	return submitbutton;
}
 
 
	 
 
}
