package com.adactin.stepdefinition;

import java.sql.Driver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.SelectHotelPage;

import cucumber.api.java.en.When;

public class SelectHotelStepDefinition extends BaseClass{
	SelectHotelPage sh = new SelectHotelPage(driver);
	
	@When("^user enter HotelDetails$")
	public void user_enter_HotelDetails() throws Throwable {
		clickOnElement(sh.getCheckRadio());
	}

	@When("^user select continue$")
	public void user_select_continue() throws Throwable {
		clickOnElement(sh.getGoNext());
	}

}
