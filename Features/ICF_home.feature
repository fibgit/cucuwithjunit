Feature: As a user
          I want to be able to create a Fundraiser on the ICF Homepage

  Scenario: Visit the ICF create account page
        New users should be able to signup for an ICF account
    Given I am on the ICF Homepage
    When I click the create account button
    Then the create account page is displayed
    And the create account form is displayed


