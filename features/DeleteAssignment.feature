
@tag
Feature: Delete Assignment
  
 Background:
	Given Admin logged into LMS portal and clicks assignment button on the navigation bar
	And Admin is in manage assignment page
	
  @tag1
  Scenario: Verify Delete Assignment alert
    When Admin clicks delete button in data table row level
    Then Admin should see dialog box
    
    
   @tag2
   Scenario: Verify Delete Assignment alert
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept 
    
    @tag3
   Scenario: Verify Delete Assignment alert
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject

    @tag3
   Scenario: Verify Delete Assignment alert
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table

    
    @tag3
   Scenario: Verify Delete Assignment alert
    Given Admin is in delete alert
    When Admin clicks NO button
    Then Redirected to assignment page and selected assignment details are deleted from the data table

    
    
   
