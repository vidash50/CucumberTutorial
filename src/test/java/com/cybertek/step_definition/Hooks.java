package com.cybertek.step_definition;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
    @Before
    public void setUp(Scenario scenario){
        System.out.println("Scenario name: "+scenario.getName());
        System.out.println("Empty hook before");
    }

    @Before("@scenario_1")
    public void specialSetup(){
        System.out.println("Special hook before\n");
    }


    @Before("@scenario_1")
    public void specialTearDown(){
        System.out.println("Special hook after\n");
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
        System.out.println("Empty hook after\n");
    }


}
