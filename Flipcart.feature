#Author: chaithanya kommineni

@tag
Feature: Functionality of flipcart


@tag2
Scenario Outline: Validation of flipcart
Given open browser as "firefox" And enter url as "https://www.flipkart.com/"
When Enter username as <username> And password as <password> And click on login button
Then successfully open in flipcart <status> 

Examples:
    | username  |password | status |
    | 7396618327 |  7396618327k | success|
    | 7396618327|  7396618327 | Fail   |
