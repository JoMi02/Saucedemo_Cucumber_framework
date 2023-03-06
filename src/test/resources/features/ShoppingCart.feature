@shopping-cart
Feature: Shopping Cart Page

  Background:
    Given I access the saucedemo login page
    When I enter a username standard_user
    And I enter a password secret_sauce
    And I click on the login button
    And I click on add button
    And I click on shopping cart button


  Scenario: Continue shopping
    And I click on button continue shopping
    Then I should be back on allitem page

  Scenario: Fill checkout information
    And I click on chechout button
    Then I should be navigate on checkout step one page
