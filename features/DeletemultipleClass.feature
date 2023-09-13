
@tag
Feature: Delete Multiple assignment
  I want to use this template for my feature file

 Background:
 
Given Admin logged into LMS portal and clicks assignment button on the navigation bar
  
  @tag1
  Scenario: Verify delete multiple class  button is enabled
  Given Admin is in manage assignment page
  When Admin clicks single  row level check box in the data table
  Then Admin should see delete icon below the header is enabled
  
  
   @tag2
  Scenario: Verify delete multiple class  button is enabled
  Given Admin clicks delete button under header after selecting the check box in the data table
  And Admin is in delete alert
  When Admin clicks "yes" button
  Then Redirected to assignment page and selected assignment details are deleted from the data table
  
     @tag3
  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
  Given Admin clicks delete button under header after selecting the check box in the data 
  And Admin is in delete alert
  When Admin clicks "NO" button
  Then Redirected to assignment page and selected assignment details are not deleted from the data table
  
       @tag4
  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
  Given Admin clicks delete button under header after selecting the multiple check box in the data table
  And Admin is in delete alert
  When Admin clicks "yes" button
  Then Redirected to assignment page and selected assignment details are deleted from the data table
  
        @tag5
  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
  Given Admin clicks delete button under header after selecting the multiple check box in the data table
  And Admin is in delete alert
  When Admin clicks "NO" button
  Then Redirected to assignment page and selected assignment details are not deleted from the data table
  
  
  
  
  
  
  
  
  
  