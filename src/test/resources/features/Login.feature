Feature: Login Test
@wip
  Scenario: Login as standard_user
    Given The user is on the login page
    When The user is enters "standard_user" and "secret_sauce" credentials
    Then The user verifies the header "Products"