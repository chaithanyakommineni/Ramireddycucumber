#Author: chaithanya

@tag
Feature: Functionality of nakuri

@tag2
Scenario Outline: Valid login
Given open browser "firefox" And url "https://www.naukri.com/"
When enter username<username> And password<password> And click on login
Then Successfully <status> in step

Examples:
   | username  |password | status |
    | komminenichaithanya@gmail.com |  9492055182k| success|
    | komminenichaithanya@gmail.com|9492055182k|success|
