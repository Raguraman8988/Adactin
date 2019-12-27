package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookedItineraryPage;

import cucumber.api.java.en.Then;

public class BookedItineraryStepDefinition extends BaseClass{
	
	@Then("^user enter Logout$")
	public void user_enter_Logout() throws Throwable {
		BookedItineraryPage bi = new BookedItineraryPage(driver);
		clickOnElement(bi.getLogout());
	}

}
