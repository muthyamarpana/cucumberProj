Feature: Login Action
Scenario: Verify Login for valid data it displays Login Successful
Given User is on Home page
When user clicks on Signin link
Then Next page is displayed check title
When user enters valid user name and valid password
And User clicks on Submit button
Then User gets connected to his account display message as successful
And Logout