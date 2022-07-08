package com.vnv.unacademy.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public static void launch(Scenario scenario) {
    	 System.out.println("========start of Scenario===========");
        System.out.println("Scenario: " +scenario.getName());
    }

    @After
    public static void teardown(Scenario scenario) {
        System.out.println("Status: " +scenario.getStatus());
        System.out.println("==========End of Scenario================");
    }

}
