@tag
Feature: Sort function

  Background: 
    Given Admin is in manage assignment page

  @tag1
  Scenario: Verify sort function in data table for descending order
    When Admin click on assignment name column header to sort
    Then Admin should see data table sorted in descending order

  @tag2
  Scenario: Verify sort function in data table for ascending order
    When Admin click on assignment name column1 header to sort
    Then Admin should see data table sorted in ascending order
