Feature: Registration Functionality

Scenario: Verify navigation to registration page

Given User clicks My Account
When User clicks Register link
Then Registration page should display

Scenario: Register user with valid details

Given User navigates to registration page
When User enters registration first name
And User enters registration last name
And User enters registration email
And User enters registration telephone
And User enters registration password
And User enters registration confirm password
And User selects privacy policy
And User clicks continue button
Then Account should get created successfully

Scenario: Register user with existing email

Given User navigates to registration page
When User enters existing first name
And User enters existing last name
And User enters existing email
And User enters existing telephone
And User enters existing password
And User enters existing confirm password
And User selects privacy policy
And User clicks continue button
Then Warning message for existing email should display

Scenario: Verify mandatory field validation

Given User navigates to registration page
When User leaves all mandatory fields empty
And User clicks continue button
Then Mandatory field warning messages should display

Scenario: Verify password mismatch

Given User navigates to registration page
When User enters mismatch first name
And User enters mismatch last name
And User enters mismatch email
And User enters mismatch telephone
And User enters mismatch password
And User enters mismatch confirm password
And User selects privacy policy
And User clicks continue button
Then Password mismatch warning should display

Scenario: Verify successful account creation

Given User navigates to registration page
When User enters success first name
And User enters success last name
And User enters success email
And User enters success telephone
And User enters success password
And User enters success confirm password
And User selects privacy policy
And User clicks continue button
Then Success message should display