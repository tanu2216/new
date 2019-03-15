


#Author:your.email@your.domain.com
Feature: Reset functionality on login page of application

Scenario Outline: Verification of reset button with numbers of credentia
Given Open the Firefox and launch the application
When Enter the Username<username>and Password<password>
Then Reset the credential
Examples:
|username |password |
|"User11"|"password11"|
|"User22"|"password22"|
|"User33"|"password33"|
