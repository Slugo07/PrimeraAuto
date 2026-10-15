Feature: Add product

  Scenario: Add product to shopping cart
    Given the user is logged in
    When the user adds a product to the cart
    Then the product should appear in the shopping cart