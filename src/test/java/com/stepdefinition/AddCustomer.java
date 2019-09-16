package com.stepdefinition;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer extends BaseClass {
	@Given("User is in Home Page")
	public void user_is_in_Home_Page() {
		Launch("https://demo.guru99.com/telecom/");
		HomePage page = new HomePage();
		Click(page.getAddcustomer());
	    
	}

	@When("User Enter the Details")
	public void user_Enter_the_Details() {
		AddCustomerPage page1 = new AddCustomerPage();
		Click(page1.getDonebutton());
		FillDetails(page1.getFirstname(), "sathish");
		FillDetails(page1.getLastname(), "kumar");
		FillDetails(page1.getEmail(), "sathish@gmail.com");
		FillDetails(page1.getAddress(), "Tirupur");
		FillDetails(page1.getPhno(), "123456789");
		Click(page1.getSubmitbutton());
	   
	}

	@Then("User verify the Customer Id")
	public void user_verify_the_Customer_Id() {
		System.out.println("Customer Id Created");
	driver.quit();
	}

}
