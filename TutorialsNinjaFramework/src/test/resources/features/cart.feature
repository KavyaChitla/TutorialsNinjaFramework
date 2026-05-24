Feature: Shopping Cart Functionality

Scenario: Add product to cart

Given User opens application home page
When User searches product for cart
And User clicks cart search button
And User adds product to cart
Then Product should add to cart successfully

Scenario: Update product quantity in cart

Given User opens application home page
When User searches product for quantity update
And User clicks cart search button
And User adds product for quantity update
And User opens shopping cart
And User updates product quantity
Then Product quantity should update successfully

Scenario: Remove product from cart

Given User opens application home page
When User searches product to remove
And User clicks cart search button
And User adds product into cart
And User opens shopping cart
And User removes product from cart
Then Shopping cart should become empty

Scenario: Verify product price in cart

Given User opens application home page
When User searches product for price verification
And User clicks cart search button
And User adds product for price verification
And User opens shopping cart
Then Product price should display in cart

Scenario: Verify total price in cart

Given User opens application home page
When User searches product for total price
And User clicks cart search button
And User adds product for total price
And User opens shopping cart
Then Total price should display successfully