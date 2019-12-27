package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	public static void beforScenario(Scenario scenario) {
		System.out.println("Scenario Name: "+scenario.getName());
	}
	
	@After
	public static void afterScenario(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String id = scenario.getId();
			System.out.println("Scenario id is: "+id);
			takeScreenShot(id);
		}
		System.out.println("          Scenario: "+scenario.getStatus());
	}
	
	@Before("@Booking")
	public static void beforeLaseScenario(Scenario scenario) {
		System.out.println("********This will execute before @Booking**********");
		System.out.println("Scenario Name: "+scenario.getName());
	}
	
}
