Feature: Login feature for FreeCRM application

#With Examples - Scenario Outline 

Scenario Outline: FreeCRM Login scenario

Given user is already on Login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on Home page
Then user closes the browser

Examples:
      | username | password |
      | GirishBaliga | test@123 |
      | GirishBaliga | test123 |