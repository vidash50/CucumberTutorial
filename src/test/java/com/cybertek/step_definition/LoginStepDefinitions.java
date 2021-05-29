package com.cybertek.step_definition;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    private final LoginPage loginPage;

    public LoginStepDefinitions(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://qa1.vytrack.com");
        System.out.println("I am on the login page");


    }

    @When("User logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        loginPage.login("storemanager85", "UserUser123");
        System.out.println("Trying to login as store manager");

    }

    @Then("User should be able to see Dashboard page title")
    public void user_should_be_able_to_see_dashboard_page_title() {
        System.out.println("I see that page title is a Dashboard");

    }

    @When("User logs in as a sales manager")
    public void user_logs_in_as_a_sales_manager() {
        loginPage.login("salesmanager110", "UserUser123");
        System.out.println("Trying to login as sales manager");

    }

    @When("User logs in as a driver")
    public void user_logs_in_as_a_driver() {
        loginPage.login("user10", "UserUser123");
        System.out.println("Trying to login as driver");

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.login(username, password);
        //System.out.println("Enter username %s, and password %s to login", username, password);
    }




}
