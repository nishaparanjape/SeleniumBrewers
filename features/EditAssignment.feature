
@tag
Feature: Edit assignment
 Background:
 Given Admin clicks Edit button in manage assignment after reaching manage assignment page
	And Admin is in  Edit assignment detail popup window
  
    @TS_Edit_Assignment_001
     Scenario: Verify Edit assignment popup window
    When Admin is in  Edit assignment detail popup window
    Then Edit popup window appears with heading Assignment Details
 
    @TS_Edit_Assignment_002
     Scenario: Verify values in popup window
    When Admin clicks Edit button from one of the row in data table 
    Then Edit popup window appears with same row values in the all fields




    @TS_Edit_Assignment_003
     Scenario: Validate admin able to update assignment with valid data in mandatory fields
    When Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)
    Then Admin should see updated assignment details is added in the data table
    
     @TS_Edit_Assignment_004
     Scenario: Validate admin able to update assignment with invalid data in mandatory fields
    When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )
    Then Error message should appear in alert
    
      @TS_Edit_Assignment_005
     Scenario: Validate admin able to update assignment with valid data  in all fields
    When Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Admin should see updated assignment details is added in the data table
 
      @TS_Edit_Assignment_006
     Scenario: Validate admin able to update assignment with invalid data  in optional fields
    When Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Error message should appear in alert
  
      @TS_Edit_Assignment_007
    Scenario: Validate admin able to update assignment missing program name
    When Admin enters  data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Program Name is missing
    
      @TS_Edit_Assignment_008
    Scenario: Validate admin able to update assignment missing batch number
    When Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)
    Then Batch number is missing
    
        
      @TS_Edit_Assignment_009
    Scenario: Validate admin able to update assignment missing assignment name
    When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment name is missing
    
            
      @TS_Edit_Assignment_010
    Scenario: Validate admin able to update assignment missing due date
    When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)
    Then Assignment due date is missing
    
      @TS_Edit_Assignment_011
    Scenario: Validate admin able to update assignment missing grade by
    When Admin enters data missing value in grade by  and clicks save button (Program name, batch number,Assignment Name, Assignment due date)
    Then Grade by is missing
    
      @TS_Edit_Assignment_012
    Scenario: Validate  admin able to update assignment passing past date 
    When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name,  grade by, Assignment Due date )
    Then Assignment cannot be updated for the passed date
    
      @TS_Edit_Assignment_013
    Scenario: Validate cancel button function in assignment details popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on manage assignment page
    
      @TS_Edit_Assignment_014
    Scenario: Validate cancel button function in assignment details popup window with values in field
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on manage assignment Page and validate new assignment is not created in the data table
    
    
    
    
    
    
    
    
    
    
    
    
    