Feature: Sogeti Login
  As a user I should able to login into Sogeti.

  Scenario: Test Automation
    Given I navigate to "https://www.sogeti.com/"
    When I hover on Services Link
    And I clicked Automation Link
    Then Automation screen should be displayed
    And Automation text should be visible
    When I hover on Services Link
    Then Service and Automation should be selected



