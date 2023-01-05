Feature: Purchase E2E Test

    Background:
    Given The user is on the login page
    When The user is enters "standard_user" and "secret_sauce" credentials

      Scenario: Product Purchase
        Then The user should be able to sort the product "Price (high to low)"
        And The user select the item no "6"
        And The user select the item no "2"
        And The user clicks the open the basket
        Then The user verifies the header "Your Cart"
        And The user checks out
        Then The user verifies the header "Checkout: Your Information"
        And The user enters name "Süheda", lastname "Simsek" postal code "06200" and click
        Then The user verifies the header "Checkout: Overview"
        And The user clicks finish button
        Then The user verifies the header "Checkout: Complete!"

  @wip
  Scenario: Taking item names

    When The user takes all products names and control product "Test.allTheThings() T-Shirt (Red)" is in the list