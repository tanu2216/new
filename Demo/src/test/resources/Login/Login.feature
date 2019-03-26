#Author: Nitisha Agrawal

@Login
Feature: Login

Scenario: check the title
Given User is on login page
Then check the title of the page

Scenario: Failure on leaving the User Name empty 
Given User is on login page
When User leaves User Name blank
And Clicks the button
Then Display alert msg

Scenario: Failure on leaving the password blank
Given User is on login page
When User leaves password blank 
And Clicks the button
Then Display alert msgs

Scenario: Successful login with all valid data
Given User is on login page
When User enters all valid data 
Then Navigate to welcome page