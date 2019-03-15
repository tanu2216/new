#Author:your.email@your.domain.com
Feature: Reset functionality on login page of application

Scenario: Verification of reset button with numbers of credentia
Given Open the Firefox and launch the application

When Enter the Username and Password
|username |password |
|User11|password11|
|User22|password22|
|User33|password33| 

Then Reset the credential
