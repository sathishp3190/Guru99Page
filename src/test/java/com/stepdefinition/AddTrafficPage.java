package com.stepdefinition;

import com.objectrepository.AddTraffi;
import com.objectrepository.HomePage;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTrafficPage extends BaseClass {
	@Given("User in Traffi Page")
	public void user_in_Traffi_Page() {
		Launch("https://demo.guru99.com/telecom/index.html");
		HomePage page = new HomePage();
		Click(page.getAddtraffi());
		driver.manage().window().maximize();
	}

	@When("User Enter the Traffi Details")
	public void user_Enter_the_Traffi_Details() {
		AddTraffi page1= new AddTraffi();
		FillDetails(page1.getMonthlyRental(), "198");
		FillDetails(page1.getFreeLocalMinutes(), "1000");
		FillDetails(page1.getFreeInterMinutes(), "500");
		FillDetails(page1.getFreeSMS(), "100");
		FillDetails(page1.getMinuteCharge(), "10");
		FillDetails(page1.getInterCharge(), "2");
		FillDetails(page1.getSMSCharge(), "10");
Click(page1.getSubmitButton());		
		
	}

	@Then("User Added the Traffi Plan")
	public void user_Added_the_Traffi_Plan() {
System.out.println("Traffi Added Successfully");
	}
}
