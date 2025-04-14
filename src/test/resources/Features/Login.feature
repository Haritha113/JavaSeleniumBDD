Feature: Login to HRM application

  Background: Given url is 'https://opensource-demo.orangehrmlive.com/'


    Scenario Outline: login scenario with valid credentials

      When user enters '<username>' and '<password>'
      And User clicks on login button
      Then User should see the dashboard for valid credentials
      Examples:
        | username | password |
      | Admin    |  admin123 |