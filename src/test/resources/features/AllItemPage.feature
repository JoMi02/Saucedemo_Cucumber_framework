@allItem-page

Feature: All Item Page

  Background:
    Given I access the saucedemo login page
    When I enter a username standard_user
    And I enter a password secret_sauce
    And I click on the login button

  Scenario: Verify change on shopping cart
    And I click on add button
    And I verify change number on shopping cart button
    And I click on remove button
    Then I verify change on shopping cart button

  Scenario: Verify social network links
    And I verify facebook link
    And I verify twitter link
    Then I verify linkedin link


