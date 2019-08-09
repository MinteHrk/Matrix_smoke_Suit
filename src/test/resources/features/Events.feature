@smokeSuit
Feature: Events functionality

  Background: Log in to the web site
    Given user opens the Url of the web page
    When user logs in using "EventsCRM_Manager9@info.com" and "Ugh45wQ20"
    And user clicks on leaves button
  @Mirzat
  Scenario: Create button display
    Then user clicks on leaves summery button
    And user should see Create button
  @Minte
  Scenario: Search filter with approved requests
    When user clicks on add search filter
    And user clicks on filter button to search
    And user adds approved as a filter
    Then user should see approved as part of the filter
  @Samat
  Scenario: Calender Visibility
    When user clicks on leaves request button
    Then user should see the calender visibly
  @Samat2
  Scenario: Create leaves through calendar
    When user clicks on leaves request button
    And user clicks on one date
    Then user should see leaves request menu

  @Gula
  Scenario:save button verification
    When user clicks on leaves request button
    And user clicks on date button
    And user enters "vacation" on description box
    When user selects the first option of leaves type
    And user enters "3" on days box
    When user clicks on save button
    Then user should see warning message displayed
@yodi
Scenario: add current year filter on search
  When user clicks on add search filter
  And user clicks on filter button to search
  And user adds current year as a filter
  Then user should see current year as part of the search filter
  @Mehmet
  Scenario: discard button verififcation
    When user clicks on leaves request button
    And user clicks on date button
    And user enters "vacation" on description box
    When user selects the first option of leaves type
    And user enters "3" on days box
    When user clicks on discard button
    Then user should see message displayed