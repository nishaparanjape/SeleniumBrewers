
@tag
Feature: Pagination in Assignment

 
 Background: 
 Given :Admin is on dashboard page after Login
 And Admin clicks "Assignment" button on the navigation bar
  
  @tag1
  Scenario: Verify sheet one is displayed on default in data table
  Then Data table should display 1 page  when entries available
  
  @tag2
  Scenario:Verify  right arrow is enable when sheet one is displayed in data table
  Then Right arrow should be enabled in page one  when entries are more than 5 available
  
  @tag3
  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
  Then Left arrow should be disabled in page one  when entries are more than 5 available
  
  
   @tag4
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
  Then Right arrow should be enabled in page two when entries are more than 10 available
  
  
   @tag5
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table when entries are more than 10
  Then Left arrow should be enabled in page two 
  
   @tag6
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
  Then Data table should display  page 1  when entries available
  
  
   
   @tag7
  Scenario: Verify pagination controls enabled
  Then entries are more than 5 in data table pagination controls disabled
  
   
   @tag8
  Scenario: Verify pagination controls disabled
  Then  entries are less than 5 in data table pagination controls disabled
  
   
   @tag9
  Scenario: Verify next page is enabled
  Given Admin is in add assignment details popup window
  When Admin creates 6 new assignment
  Then  total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
  
   
   @tag10
  Scenario: verify next page is disabled
  Given Admin is in add assignment details popup window
  When Admin creates 6 new assignment
  Then total class entries  5 or below next page is disabled
  
  
  
  
  
  
  
  
  
  