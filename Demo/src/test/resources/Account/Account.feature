#Author: Nitisha Agrawal

@CreateAccount
Feature: CreateAccount

Scenario: check the title
Given User is on create new savings account page
Then check the title of the page

Scenario: Failure on leaving the First Name empty 
Given User is on create new savings account page
When User leaves first Name blank
Then Save the credentials

Scenario: Failure on leaving the middle name blank
Given User is on create new savings account page
When User leaves middle name blank 
Then Save the credentials

Scenario: Failure on leaving the last name blank
Given User is on create new savings account page
When User leaves last name blank 
Then Save the credentials

Scenario: Failure on leaving the address blank
Given User is on create new savings account page
When User leaves address blank 
Then Save the credentials

Scenario: Failure on leaving the city blank
Given User is on create new savings account page
When User leaves city blank 
Then Save the credentials

Scenario: Failure on leaving the gender blank
Given User is on create new savings account page
When User leaves gender blank 
Then Save the credentials

Scenario: Failure on leaving the mother tongue blank
Given User is on create new savings account page
When User leaves mother tongue blank 
Then Save the credentials

Scenario: Failure on leaving the date of birth blank
Given User is on create new savings account page
When User leaves date of birth blank 
Then Save the credentials

Scenario: Successful login with all valid data
Given User is on create new savings account page
When User enters all valid data 
Then Save the credentials

Scenario: Login with invalid data
Given User is on create new savings account page
When User enters invalid data 
Then Cancel the credentials