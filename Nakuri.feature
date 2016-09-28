#Author: chaithanya kommineni

@tag
Feature: Functionality of nakuri
Background:
Given open browser as "firefox" And enter url as "https://www.naukri.com/"
@Regression
Scenario: Nakuri valid login
When enter username And password And click on login
|komminenichaithanya@gmail.com|949205518|
|komminenichaithanya@gmail.com|9492055182k|
Then Successfully login to nakuri