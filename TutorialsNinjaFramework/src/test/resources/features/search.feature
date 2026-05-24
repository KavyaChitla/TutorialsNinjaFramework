Feature: Search Product Functionality

Scenario: Search product using valid keyword

Given User opens home page
When User enters valid product in search box
And User clicks search button
Then Matching product should display

Scenario: Search product using invalid keyword

Given User opens home page
When User enters invalid product in search box
And User clicks search button
Then No product found message should display

Scenario: Search product with empty field

Given User opens home page
When User clicks search without product
Then Search warning message should display

Scenario: Verify search results

Given User opens home page
When User searches for a valid product
And User clicks search button
Then Search results should display

Scenario: Verify product details

Given User opens home page
When User searches product details
And User clicks search button
And User opens searched product
Then Product details page should display