Feature: Checkout Functionality

Scenario: Verify user navigates to checkout page

Given User opens home page for checkout
When User searches HP product
And User clicks checkout search button
And User adds HP product to cart
And User opens cart for checkout
And User clicks checkout button
Then Checkout page should display

Scenario: Enter billing details

Given User opens home page for checkout
When User searches HP product
And User clicks checkout search button
And User adds HP product to cart
And User opens cart for checkout
And User clicks checkout button
Then Billing details should accept successfully

Scenario: Select shipping method

Given User opens home page for checkout
When User searches HP product
And User clicks checkout search button
And User adds HP product to cart
And User opens cart for checkout
And User clicks checkout button
Then Checkout page should display

Scenario: Select payment method

Given User opens home page for checkout
When User searches HP product
And User clicks checkout search button
And User adds HP product to cart
And User opens cart for checkout
And User clicks checkout button
And User selects payment method
Then Payment method should select successfully

Scenario: Confirm order successfully

Given User opens home page for checkout
When User searches HP product
And User clicks checkout search button
And User adds HP product to cart
And User opens cart for checkout
And User clicks checkout button
And User confirms order
Then Order should confirm successfully