@tag
Feature: Navigation feature

  Background: 
    Given Admin is manage assignment page after logged in

  @ts1
  Scenario: Verify admin is able to navigate from manage assignment to student page
    When Admin clicks " Student1" button in the navigation bar
    Then Admin should able to land on student page
#
  #@tag2
  #Scenario: Verify admin is able to navigate from manage assignment to Program page
    #When Admin clicks " Program" button in the navigation bar
    #Then Admin should able to land on " Program" page
#
  #@tag3
  #Scenario: Verify admin is able to navigate from manage assignment to "batch" page
    #When Admin clicks "batch" button in the navigation bar
    #Then Admin should able to land on "batch" page
#
  #@tag4
  #Scenario: Verify admin is able to navigate from manage assignment to " user" page
    #When Admin clicks " user" button in the navigation bar
    #Then Admin should able to land on student page
#
  #@tag5
  #Scenario: Verify admin is able to navigate from manage assignment to assignment page
    #When Admin clicks "assignment" button in the navigation bar
    #Then Admin should able to land on"assignment" page
#
  #@tag6
  #Scenario: Verify admin is able to navigate from manage "attendance" to student page
    #When Admin clicks "attendance" button in the navigation bar
    #Then Admin should able to land on "attendance" page
#
  #@tag7
  #Scenario: Verify admin should able to do logout function from manage assignment
    #When Admin clicks " Logout" button in the navigation bar
    #Then Admin should able to land on "login" page
