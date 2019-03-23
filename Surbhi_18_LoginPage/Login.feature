#Author: Surbhi Gupta
@LoginPage

Feature: LoginPage
Scenario: Check the title
Given User is on hotel login page
Then check the title of the page

Scenario: Successful hotel login with all valid data
Given User is on hotel login page
When user enters all valid data 
Then navigate to welcome page 

Scenario: Failure in hotel login on leaving the userName empty 
Given User is on hotel login page
When user leaves userName blank
And clicks the button
Then display alert msg

Scenario: Failure in hotel login on leaving the password empty 
Given User is on hotel login page
When user leaves password blank and clicks the button
Then display alert msg

Scenario: Failure in hotel login on incorrect userName 
Given User is on hotel login page
When user enters incorrect userName
Then display alert msg

Scenario: Failure in hotel login on incorrect password 
Given User is on hotel login page
When user enters incorrect password
Then display alert msg

