#Author: Oliver Felicity
@LoginPage

Feature: LoginPage

Scenario: Successful login with all valid data
Given User is on login page
When user enters all valid data 
Then navigate to welcome page 

Scenario: Failure in login page on leaving the user Name empty 
Given User is on login page 
When user leaves user Name blank
And clicks the button
Then display alert msg

Scenario: Failure in login page on leaving the password blank
Given User is on login page 
When user leaves password blank
And clicks the button
Then display alert msg

Scenario: check the title
Given User is on create account page
Then check the title of the page

Scenario: Successful create account with all valid data
Given User is on create account page
When user enters all valid data 
Then navigate to welcome page 

Scenario: Failure in create account on leaving the first Name empty 
Given User is on create account page
When user leaves first Name blank
And clicks the button
Then display alert msg

Scenario: Failure in create account on leaving the last Name blank
Given User is on create account page
When user leaves last Name blank and clicks the button
Then display alert msg

Scenario: Failure in create account on not entering the address
Given User is on create account page
When user doesnot enter state
Then display alert msg


Scenario: Failure in create account on not selecting the gender
Given User is on create account page
When user doesnot select gender
Then display alert msg


Scenario: Failure in create account on not selecting the mother tongue
Given User is on create account page
When user doesnot select mother tongue
Then display alert msg

Scenario: Failure in create account on not entering the date of birth
Given User is on create account page
When user doesnot enter date of birth
Then display alert msg



