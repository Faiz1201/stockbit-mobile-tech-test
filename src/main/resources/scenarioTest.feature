@StockbitTesting
  Feature: AppiumTest

    @DoTest
    Scenario: Buy the following product
      Given Find and Click Item Sauce Lab Back Packs
      Given Select Color Blue and Increase Item Quantity Up To 2
      Given Click Button Cart and Proceed To Checkout
