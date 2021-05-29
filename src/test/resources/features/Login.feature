Feature: Login
  As a user, I want to be able to login with username and password

  Background: go to login page
    Given User is on the login page

  @Smoke
  Scenario: Login as store manager
    Given User is on the login page
    When User logs in as a store manager
    Then User should be able to see Dashboard page title

    @Scenario_2
    Scenario: Login as sales manager
      Given User is on the login page
      When User logs in as a sales manager
      Then User should be able to see Dashboard page title

  @Scenario_3
  Scenario: Login as driver
    Given User is on the login page
    When User logs in as a driver
    Then User should be able to see Dashboard page title

  @Scenario_outline
    Scenario Outline: Login under different credentials as <username>
      When user enters "<username>" and "<password>"
      Then User should be able to see Dashboard page title
      Examples:
      |username|password|
      |user10 | UserUser123|
      |user15 | UserUser123|
      |user22 | UserUser123|
      |user 110 | UserUser123|
      |storemanager85 | UserUser123|
      |storemanager120 | UserUser123|
      |storemanager110 | UserUser123|
