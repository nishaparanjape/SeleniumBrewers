
@tag
Feature: Assignment module pop up window
  
Background: 
Given Admin logged into LMS portal 
And clicks assignment button on the navigation bar 
And Admin is on manage assignment Page
And Admin click "+Add" new assignment button


  @TS_Assignment_Popup_01
  Scenario: Verify Assignment details popup window
	Then Admin should see a popup  with  heading "Assignment details"
    
   @TS_Assignment_Popup_02
    Scenario: Verify input fields in Assignment details popup window
     Then Admin should see input fields Text ("Program name", "batch number","Assignment Name", "Assignment Description", "grade by", "Assignment due date", "Assignment File1", "Assignment file 2", "Assignment file 3", "Assignment file 4", "Assignment file 5").
     
     @TS_Assignment_Popup_03
    Scenario: Verify text box present in Assignment details popup window
     Then 8 textbox should be  present in Assignment details popup window

     @TS_Assignment_Popup_04
    Scenario: Verify drop down in Batch Number  in Assignment details popup window
     Then Admin should see  dropdown option for Batch Number
     
     @TS_Assignment_Popup_05
     Scenario: Verify drop down in Program name  in Assignment details popup window	
     Then Admin should see  dropdown option for Program name
     
     @TS_Assignment_Popup_06		
    Scenario: Verify calendar icon in Assignment due date  in Assignment details popup window
     Then Admin should see  calendar icon for assignment due date
     
     @TS_Assignment_Popup_07
    Scenario: Verify save button is present
     Then Admin should see  save button in the Assignment detail popup window
     
     @TS_Assignment_Popup_08
    Scenario: Verify cancel button is present
     Then Admin should see  cancel button in the Assignment detail popup window
     
     @TS_Assignment_Popup_09
    Scenario: Verify close button in  Assignment details popup window
     Then Admin should see  close button on the Assignment details popup window
     
     