@menu
Feature: Hamburger Menu

  Background:
    Given I access the saucedemo login page
    When I enter a username standard_user
    And I enter a password secret_sauce
    And I click on the login button
    And I click on hamburger menu

  Scenario: Logout all item page
    And I click on logout button
    Then I access the saucedemo login page

  Scenario: Validate page about sauceLabs
    And I click on about page
    Then I access sauceLabs page

