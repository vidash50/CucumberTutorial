package com.cybertek.step_definition;

import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class CreateCarStepDefinitions {


    @Then("user navigate to Fleet Vehicles")
    public void user_navigate_to_fleet_vehicles() {
        System.out.println("Go to Fleet --> Vehicles");

    }

    @Then("user clicks on create car button")
    public void user_clicks_on_create_car_button() {
        System.out.println("Click on create car button");

    }

    @Then("user enter vehicles information:")
    public void user_enter_vehicles_information(List<Map<String, String>> dataTable) {
        System.out.println(dataTable.get(0).get("Location"));
        System.out.println(dataTable.get(1).get("License Plate"));
        dataTable.forEach(p ->{
            System.out.println(p.get("Driver"));
        });

        // NOTE: to run the 4 cukesRunners, you have to change the configuration in the pom.xml file to classes instead of methods.
        //<parallel>classes</parallel>
        // <threadCount>4</threadCount>

    }

}
