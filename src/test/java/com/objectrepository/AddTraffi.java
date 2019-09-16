package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClass;

public class AddTraffi extends BaseClass {

	public AddTraffi() {

		PageFactory.initElements(driver, this);	
	}
	@FindBy(id="rental1")
	private WebElement MonthlyRental;
	@FindBy(id="local_minutes")
	private WebElement 	FreeLocalMinutes;
	@FindBy(id="inter_minutes")
	private WebElement FreeInterMinutes;
	@FindBy(id="sms_pack")
	private WebElement FreeSMS;
	@FindBy(id="minutes_charges")
	private WebElement MinuteCharge;
	@FindBy(id="inter_charges")
	private WebElement InterCharge;
	@FindBy(id="sms_charges")
	private WebElement SMSCharge;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitButton;
	public WebElement getMonthlyRental() {
		return MonthlyRental;
	}
	public WebElement getFreeLocalMinutes() {
		return FreeLocalMinutes;
	}
	public WebElement getFreeInterMinutes() {
		return FreeInterMinutes;
	}
	public WebElement getFreeSMS() {
		return FreeSMS;
	}
	public WebElement getMinuteCharge() {
		return MinuteCharge;
	}
	public WebElement getInterCharge() {
		return InterCharge;
	}
	public WebElement getSMSCharge() {
		return SMSCharge;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
	
	
}
