Feature: Login scenario

  Background: Given url is 'https://opensource-demo.orangehrmlive.com/'


    Scenario Outline: login scenario with valid credentials

      When user enters '<username>' and '<password>'
      Then dashboard should be available
      Examples:
        | username | password |
      | Admin    |  admin123 |
