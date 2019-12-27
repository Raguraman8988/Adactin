package com.adactin.stepdefinition;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.BookingConfirmPage;

import cucumber.api.java.en.Then;

public class BookingConfirmStepDefinition extends BaseClass {
	@Then("^user enter Itinerary$")
	public void user_enter_Itinerary() throws Throwable {
		BookingConfirmPage bc = new BookingConfirmPage(driver);
		Thread.sleep(8000);
		clickOnElement(bc.getMyItinerary());
		
	}

}
