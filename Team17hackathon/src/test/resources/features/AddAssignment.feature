
Feature: Add New Assignment in Assignment module

Background: 
Given Admin click "+Add" new assignment button after reaching to manage assignment page
And Admin is in  assignment details+++ popup window
 

 
   @TS_Add_new_Assignment_001
     Scenario: Validate admin able to add new assignment with valid data in mandatory fields
    When Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)
    Then Admin should see new assignment details is added in the data table
    
    @TS_Add_new_Assignment_002
     Scenario: Validate admin able to add new assignment with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Error message should appear in alert
    
    @TS_Add_new_Assignment_003
     Scenario: Validate admin able to add new assignment with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see new assignment details is added in the data table
    
    @TS_Add_new_Assignment_004
     Scenario: Validate admin able to add new assignment with invalid data  in optional fields
    When Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Error message should appear in alert
    
    @TS_Add_new_Assignment_005
     Scenario: Validate admin able to add new assignment missing program name
    When Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Program Name is missing
    
    @TS_Add_new_Assignment_006
     Scenario: Validate admin able to add new assignment missing batch number
    When Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Batch number is missing
    
    
    @TS_Add_new_Assignment_007
     Scenario: Validate admin able to add new assignment missing assignment name
    When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date ) 
    Then Assignment name is missing
    
    
    @TS_Add_new_Assignment_008
     Scenario: Validate admin able to add new assignment missing due date
    When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
    Then Assignment due date is missing
    
    
    @TS_Add_new_Assignment_009
     Scenario: Validate admin able to add new assignment missing grade by
    When Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date)
    Then Grade by is missing
    
    @TS_Add_new_Assignment_011
     Scenario: Validate  admin able to add new assignment passing past date
    When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment cannot be created for the passed date
    
    @TS_Add_new_Assignment_012
     Scenario: Validate date picker
    When Admin clicks date from date picker
    Then selected date should be their in class date text box
    
    
    @TS_Add_new_Assignment_013
     Scenario: validate date picker should be correct format
    When Admin clicks date from date picker
    Then selected date should be in  mm/dd/yyyy format
    
    
    @TS_Add_new_Assignment_014
     Scenario: Validate right arrow in data picker to navigate to next month
    When Admin clicks right arrow in the date picker near month
    Then Next month calender should visible
    
    
    @TS_Add_new_Assignment_015
     Scenario: Validate left arrow in data picker to navigate to previous mon
    When Admin clicks left arrow in the date picker near month
    Then previous month calender should visible
    
    
    @TS_Add_new_Assignment_016
     Scenario: Validate current date is highlighted in the date picker
    When Admin clicks date picker button
    Then Admin should see current date is highled in the date picker
    
    
    @TS_Add_new_Assignment_017
     Scenario: Validate selected date is highlighted in the date picker
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highled in the date picker
    
    @TS_Add_new_Assignment_018
     Scenario: Validate cancel button function in assignment details popup window

    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on manage assignment page
    
    
   @TS_Add_new_Assignment_019
     Scenario: Validate cancel button function in assignment details popup window with values in field
    When Admin clicks Cancel button entering values in the fields
    Then Admin should see new assignment details is added in the data table
    
    
   
    
    
    
    
    
    
    
   