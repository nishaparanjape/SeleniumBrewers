#Author: Poornima
@tag
Feature: Assignment feature
## Manage assignment page Verification
Background: 
	Given Logged on the LMS portal as Admin
	
  @TS_Assignment_001 
   Scenario: Verify landing in manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see URL with "Manage assignment"

  @TS_Assignment_002
  Scenario: Capture the response time to navigate to manage assignment page
  Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage assignment page
 
  @TS_Assignment_003
  Scenario: Verify manage assignment page Header.	
  Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see header with "Manage assignment"
  
    
   @TS_Assignment_004
   Scenario: Validate text in manage assignment page
    When Admin clicks "assignment" button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields.
    
    @TS_Assignment_005
    Scenario: Verify delete icon below the header
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see disabled delete icon below the "Manage assignment"
 
    @TS_Assignment_006
   Scenario: Verify search bar on the manage assignment page
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see search bar on the manage assignment page

     @TS_Assignment_007
    Scenario: Verify add new assignment button  on manage assignment page
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see +Add New assignment button on the manage assignment page
    
     @TS_Assignment_008
    Scenario: Verify data table on the manage assignment page		
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see data table on the manage assignment page With following column headers. (check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)

    @TS_Assignment_009
    Scenario: Verify Edit icon in the data table
    When Admin clicks "assignment" button on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available
    
    @TS_Assignment_010
    Scenario: Verify Edit icon when no data in the table
    When Admin clicks "assignment" button on the navigation bar
    Then Edit Icon will not be present in data table
      
     
    @TS_Assignment_011
    Scenario: Verify delete icon in the data table
    
    When Admin clicks "assignment" button on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available
      
     
    @TS_Assignment_012
    Scenario: Verify delete icon when no data in the table
    When Admin clicks "assignment" button on the navigation bar
    Then Delete Icon will not be present in data table
      
      
    @TS_Assignment_013
    Scenario: Verify sort icon in the data table
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete

    @TS_Assignment_014
    Scenario: Verify check box in the data table
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see check box in the all rows  of data table when entries available
    
    #@TS_Assignment_015
    #Scenario: Validate the number entries displaying
    #When Admin clicks "assignment" button on the navigation bar
    #Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table. 
#				x- starting record number on that page
#				y-ending record number on that page
#				z-Total number of records                                                                                            Note: with or without entries

    
    @TS_Assignment_016
    Scenario: Verify Pagination control below the data table
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the pagination controls under the data table
    
    
     @TS_Assignment_017
    Scenario: Validate footer  text
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the text with total number assignments in the data table. ( " In total there are number of assignments")


     @TS_Assignment_018
    Scenario: Validate footer  text
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the text with total number assignments in the data table. ( " In total there are number of assignments")
    
    
     @TS_Assignment_018
    Scenario: Validate footer  text
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the text with total number assignments in the data table. ( " In total there are number of assignments")
    
    ##
    
     @TS_Assignment_019
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment name into search box  
    Then Displays entries with that assignment name
    
 		@TS_Assignment_020
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment  name is not existing the table into search box  
    Then it should Display empty details in the data table
    
		@TS_Assignment_021
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment description into search box  
    Then Displays entries with that assignment description
    
    @TS_Assignment_022
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment description which is not existing the table into search box  
    Then Displays empty details in the data table
    
    @TS_Assignment_023
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment due date into search box 
    Then Displays entries with that assignment due date
    
    @TS_Assignment_024
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters assignment due date which is not existing the table into search box  
    Then Displays empty details in the data table
    
     
    @TS_Assignment_025
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters grade value  into search box  
    Then Displays entries with that assignment  grade
    
     @TS_Assignment_026
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters grade value which is not existing the table into search box  
    Then Displays empty details in the data table
    
    
    @TS_Assignment_027
    Scenario: Validate search box function
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin enters grade value which is not existing the table into search box  
    Then Displays empty details in the data table
    
    ### Assignment details Popup window verification
    
     @TS_Assignment_028
    Scenario: Verify Assignment details popup window
    Given Admin clicks "assignment" button on the navigation bar and enters "manage Assignment Page"
    When Admin click "+Add "new assignment button.  
    Then Admin should see a popup  with  heading "Assignment details"
    
    
    
    
    
    