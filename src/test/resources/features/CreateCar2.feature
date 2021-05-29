Feature: Create car

  As a user, I want to be able to add new cars.

  Scenario: Add new car
    Given User is on the login page
    When User logs in as a store manager
    Then user navigate to Fleet Vehicles
    And user clicks on create car button
    Then user enter vehicles information:
      |License Plate|Driver|Location        |Model Year|Color|
      |SDET123  |Tester  |Washington D.C. |2020      |Black  |
    |  JAVA_IS_FUN       |User        | McLean, VA               |  2019        |    Red   |
