package com.bdd.cucumber;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefenation {
	BaseClass baseClass;
	
	
	@Given("^open Browser$")
	public void open_Browser(DataTable arg1) throws Throwable {
		baseClass = new BaseClass();
		List<List<String>> data=	arg1.raw();
	    	String browser=	data.get(0).get(0);
	    	baseClass.openBrowser(browser);
		
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
	    
	}

	@When("^i click on menu$")
	public void i_click_on_menu() throws Throwable {
	   
	}

	@When("^i click silk saree$")
	public void i_click_silk_saree() throws Throwable {
	
	}

	@When("^i click first product$")
	public void i_click_first_product() throws Throwable {
	  
	}

	@When("^i select color$")
	public void i_select_color() throws Throwable {
	   
	}

}
