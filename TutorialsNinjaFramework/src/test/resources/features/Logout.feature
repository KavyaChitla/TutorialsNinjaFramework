Feature: Logout Functionality

Scenario: Verify logout functionality

Given User opens home page for logout
When User clicks My Account
And User clicks Login option
And User enters valid logout username
And User enters valid logout password
And User clicks logout login button
And User clicks My Account after login
And User clicks Logout option
Then Logout should happen successfully

Scenario: Verify session termination after logout

Given User opens application for logout
When User logs into account for logout
And User clicks logout button
And User clicks browser back button
Then User session should terminate successfully

Scenario: Verify navigation to home page after logout

Given User opens application for logout
When User logs into account for logout
And User clicks logout button
And User clicks continue button after logout
Then User should navigate to home page