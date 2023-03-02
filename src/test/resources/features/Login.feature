@login

Feature: Saucedemo - Login Page

  Background:
    Given I access the saucedemo login page

  Scenario: Validate Successful Login

    When I enter a username "standard_user"
    And I enter a password secret_sauce
    And I click on the login button
    Then I should navigate on product page

    Scenario: Validate Unsuccessful Login
      When I enter a username "standard_user"
      And I enter a password joka123
      And I click on the login button
      Then I should be presented with the unsuccessful login message

      Scenario: Validate Locked_out_user Login
        When I enter a username "locked_out_user"
        And I enter a password secret_sauce
        And I click on the login button
        Then I should be presented with the message for locked out user


