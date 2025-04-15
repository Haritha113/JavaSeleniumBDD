Feature: Logout from HRM application

Background:
  Given hrm page is "https://opensource-demo.orangehrmlive.com"

Scenario Outline: login scenario with valid credentials
  When user enters <username> and <password>
  And User clicks on login button
  Then User should see the dashboard for valid credentials
  When user clicks on logout option
  Then user should be logged out successfully

  Examples:
    | username | password  |
    | Admin    |  admin123 |