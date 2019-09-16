package com.stepdefinition;

import com.resources.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass {

	@Before
	public void beforebackground() {
Launch("https://demo.guru99.com/telecom/");
		
	}
	@After
	public void afterscenario() {

		driver.quit();
	}
}
