Feature: Login Functionality

Scenario: Login with valid credentials

Given User opens login page
When User enters email
And User enters password
And User clicks login button
Then User should login successfully

Scenario: Login with invalid email

Given User opens login page
When User enters invalid email
And User enters valid password
And User clicks login button
Then Error message should display

Scenario: Login with invalid password

Given User opens login page
When User enters valid email
And User enters invalid password
And User clicks login button
Then Error message should display

Scenario: Login with blank credentials

Given User opens login page
When User enters blank email
And User enters blank password
And User clicks login button
Then Error message should display

Scenario: Verify error message for invalid login

Given User opens login page
When User enters wrong credentials
And User clicks login button
Then Proper warning message should display

Scenario: Verify all UI elements on Login page

Given User opens login page
Then All login page elements should display