package stepdefinations;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.util.List;
import java.util.logging.LogManager;

//import org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver_manager.DriverManager;
import page_objects.Assigmentmodule;
//import page_objects.StudentModule;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.common_utils;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Manageassignmentpagesteps {
	Assigmentmodule objAssigmentmodule = Assigmentmodule.getInstance();
	static WebDriver driver = DriverManager.getDriver();
	common_utils objCommounUtils = new common_utils();
	static long startTime;
	String txtLogMessage = "";
//	private static final Logger LOGGER = 
//			LogManager.getLogger(StudentModule.class);
	private static final Logger LOGGER = 
			LogManager.getLogger();
	public Manageassignmentpagesteps () {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	} 
	
	@Given("Logged on the LMS portal as Admin")
	public void logged_on_the_lms_portal_as_admin() {
		//call login object and method
	    System.out.println("Logged on to LMS portl as Admin");
	    LOGGER.info("Logged on to LMS portl as Admin");
	}
//   @Given("IS on dashboard page after Logging in")
//   public void is_on_dashboard_page_after_logging_in() {
//	   driver.get(Constants.SIGNIN_URL);
//		driver.manage().window().maximize();
//		//SignPage.Signin(Constants.USERNAME, Constants.PASSWORD);
//		LOGGER.info("Admin is on dashboard page : ");
//		System.out.println("Admin is on dashboard page after login ");}
//  
   @Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		driver.get(Constants.SIGNIN_URL);
		driver.manage().window().maximize();
		LOGGER.info("Admin is on dashboard page : ");
		System.out.println("Admin is on dashboard page after login ");}


  @When("Admin clicks string button on the navigation bar")
  public void admin_clicks_on_the_navigation_bar() {
			objAssigmentmodule.getAssignmentlnk().click();
			txtLogMessage = "Admin Clicks on Assignment on the navigation bar";
			System.out.println(txtLogMessage);
			LOGGER.info(txtLogMessage);
 }

 @Then("Admin should see URL with string")
 public void admin_should_see_url_with(String string) {
	  String strTitle = driver.getTitle();
			LOGGER.info("Title of page :" + strTitle);
		    assertEquals(strTitle,"Manage Assignment", "Manage Assignment not seen");
		}

// @Then("Get the response time for navigation from dashboard page to manage assignment page")
// public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
//	 public static void main(String[] args) {
//	      long s = System.currentTimeMillis();
//	      //URL launch
//	      driver.get("https://www.tutorialspoint.com/videotutorials/subscription.php");
//	      //verify page is loaded
//	      WebDriverWait wt = new WebDriverWait(driver,6);
//	      wt.until(ExpectedConditions.elementToBeClickable (By.className("s-buy")));
//	      //capture time after page load
//	      long e = System.currentTimeMillis();
//	      //compute time
//	      long r = e – s;
//	      System.out.println("Page load time in milliseconds: " + r);
//	      driver.close();
//	   }
	
 
 @Then("Admin should see header with string")
	 public void admin_should_see_the_in_the_header() {
		    String strHeader = objAssigmentmodule.gettxtHeaderassignPage().getText();
			LOGGER.info("Header :" + strHeader);
			assertTrue(strHeader.toLowerCase().contains("Assignment page")
					, "'Assignment page' not seen in the header");
		}

 @When("Admin clicks string button on the navigation bar and get all text from the portal page")
 public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	 objAssigmentmodule.getAssignmentlnk().click();
		txtLogMessage = "Admin Clicks on Assignment on the navigation bar";
		System.out.println(txtLogMessage);
		LOGGER.info(txtLogMessage);
}


 @Then("Admin should see correct spelling for the all the fields.")
 public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	        String placeText = objAssigmentmodule.gettxtAssignmentname()
	        				.getAttribute("placeholder");
	        LOGGER.info("Displayed text : " + placeText);
			assertEquals(placeText," Assignment name",
						"Wrong spelling of 'Assignment name'");
		}
 
 @Then("Admin should see disabled delete icon below the string")
 public void admin_should_see_disabled_delete_icon_below_the(String string) {
	 String isDisabled = objAssigmentmodule.getmuldeleteAssignmentdisabled().getAttribute("disabled");
	 if (isDisabled != null && isDisabled.equals("true")) {
	     System.out.println("The delete icon is disabled.");
	 } else {
	     System.out.println("The delete icon is not disabled.");
	 }
	 
 }

 @Then("Admin should see search bar on the manage assignment page")
 public void admin_should_see_search_bar_on_the_manage_assignment_page() {
	if( objAssigmentmodule.getsearchAssignment().isDisplayed()){
		    System.out.println("The search bar is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The search bar is not visible on the Manage Assignment page.");
		}
	 
 }

 @Then("Admin should see +Add New assignment button on the manage assignment page")
 public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
	 if( objAssigmentmodule. getnewAssignment().isDisplayed()){
		    System.out.println("The +Add New assignment is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The +Add New assignment visible on the Manage Assignment page.");
		}
 }

 @Then("Admin should see data table on the manage assignment page With following column headers. \\(check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)")
 public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers_check_box_symbol_assignment_name_assignment_description_assignment_date_assignment_grade_edit_delete() {
	 if( objAssigmentmodule.getcheckboxsymbol().isDisplayed()){
		 System.out.println("The checkboxsymbol is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The checkboxsymbol visible on the Manage Assignment page.");
		}
	 if( objAssigmentmodule.gettxtAssignmentname().isDisplayed()){
		 System.out.println("The Assignment name is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The Assignment name is  visible on the Manage Assignment page.");
		}
	 if( objAssigmentmodule.getAssigndescription().isDisplayed()){
		 System.out.println("The Assigndescription is visible on the Manage Assignment page.");
		} else {
		    System.out.println("TheAssigndescription is  visible on the Manage Assignment page.");
		}
	 if( objAssigmentmodule.getAssignGrade().isDisplayed()){
		 System.out.println("The Assignment Grade is visible on the Manage Assignment page.");
		} else {
		    System.out.println("TheAssignment Grade is  visible on the Manage Assignment page.");
		}
	 if( objAssigmentmodule.getAssignDate().isDisplayed()){
		 System.out.println("The Assign Date is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The Assign Date is  visible on the Manage Assignment page.");
		}
	 
	 }

// @Then("Edit Icon in each row of data table only  when entries are available")
// public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
//  
// }

 @Then("Edit Icon will not be present in data table")
 public void edit_icon_will_not_be_present_in_data_table() {
	 if( objAssigmentmodule.geteditAssignment().isDisplayed()){
		 System.out.println("The edit is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The edit is not  visible on the Manage Assignment page.");
		}
 }

// @Then("Delete Icon in each row of data table only  when entries are available")
// public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }

 @Then("Delete Icon will not be present in data table")
 public void delete_icon_will_not_be_present_in_data_table() {
	 if( objAssigmentmodule.getdeleteAssignment().isDisplayed()){
		 System.out.println("The delete  icon is visible on the Manage Assignment page.");
		} else {
		    System.out.println("The delete icon is not  visible on the Manage Assignment page.");
		}
 }

// @Then("Admin should see sort icon near the column headers except for Edit and Delete")
// public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
//	 
// 
// }

 @Then("Admin should see check box in the all rows  of data table when entries available")
 public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
	 objAssigmentmodule.getcheckboxsymbol().isDisplayed();
	 System.out.println("The checkboxsymbol is  visible on the Manage Assignment page.");
 }

 @Then("Above the footer Admin should see the text as string below the table.")
 public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
	 String txtFooter = objAssigmentmodule.getFooterAssignpaginationTxt().getText();
		LOGGER.info("Title of footer pagination text is :" + txtFooter);
 
 }

 @Then("Admin should see the pagination controls under the data table")
 public void admin_should_see_the_pagination_controls_under_the_data_table() {
			String txtFooter = objAssigmentmodule.getFooterAssignpaginationTxt().getText();
			LOGGER.info("Title of footer pagination text is :" + txtFooter);
			assertTrue(txtFooter.contains("<<"), 
					"Cant see pagination control under the data table");
		}
 
 @Then("Admin should see the text with total number assignments in the data table. \\( string)")
 public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table(String string) {
	 String txtFooter = objAssigmentmodule.getFooterAssignpaginationTxt().getText();
	 LOGGER.info("Title of footer pagination text is :" + txtFooter);
 }

 @Given("Admin clicks string button on the navigation bar and enters string")
 public void admin_clicks_button_on_the_navigation_bar_and_enters(String string, String string2) {
	 objAssigmentmodule.gettxtAssignmentname().click();
 
 }

 @When("Admin enters assignment name into search box")
 public void admin_enters_assignment_name_into_search_box() {
	 objAssigmentmodule.getsearchAssignment().sendKeys("Assign1");
		System.out.println("Admin enters assignment name into search box");
 }

 @Then("Displays entries with that assignment name")
 public void displays_entries_with_that_assignment_name() {
	 objAssigmentmodule.gettxtAssignmentname().isDisplayed();
 }

 @When("Admin enters assignment  name is not existing the table into search box")
 public void admin_enters_assignment_name_is_not_existing_the_table_into_search_box() {
	 objAssigmentmodule.getsearchAssignment().sendKeys("nonassign");
		System.out.println("Admin enters assignment name into search box which doent exist");
 }

 @Then("it should Display empty details in the data table")
 public void it_should_display_empty_details_in_the_data_table() {
	   String strError = objAssigmentmodule.gettxtAssignmentname().getText();
	   assertFalse(strError.equals("displays details in the data table"),
			   "empty details in the data table");
	   LOGGER.info("Displays empty details in the data table");
	}
	 

 @When("Admin enters assignment description into search box")
 public void admin_enters_assignment_description_into_search_box() {
	 objAssigmentmodule.getsearchAssignment().sendKeys("SDET");
		System.out.println("Admin enters assignment description which is  existing the table into search");
	    LOGGER.info("Admin enters assignment description which is  existing the table into search");
	}
	 

 @Then("Displays entries with that assignment description")
 public void displays_entries_with_that_assignment_description() {
	   String strError = objAssigmentmodule.getAssigndescription().getText();
	   assertTrue(strError.equals("displays details in the data table"),
			   "empty details in the data table");
	   LOGGER.info("Displays entries details in the data table");
	}
	 

 @When("Admin enters assignment description which is not existing the table into search box")
 public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box() {
	 objAssigmentmodule.getsearchAssignment().sendKeys("galaxy");
		System.out.println("Admin enters assignment description which is not existing the table into search");
	    LOGGER.info("Admin enters assignment description which is not existing the table into search");
	}
 

 @Then("Displays empty details in the data table")
 public void displays_empty_details_in_the_data_table() {
	   String strError = objAssigmentmodule.getAssigndescription().getText();
	   assertFalse(strError.equals("displays details in the data table"),
			   "empty details in the data table");
	   LOGGER.info("Displays empty details in the data table");
	}
	 

 @When("Admin enters assignment due date into search box")
 public void admin_enters_assignment_due_date_into_search_box() {
	 objAssigmentmodule.getsearchAssignment().sendKeys("02-08-2023");
		System.out.println("Admin enters assignment due date which is  existing the table into search box");
	    LOGGER.info("Admin enters assignment due date which is  existing the table into search box");
	}
 

 @Then("Displays entries with that assignment due date")
 public void displays_entries_with_that_assignment_due_date() {
 }

 @When("Admin enters assignment due date which is not existing the table into search box")
 public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box() {

	 objAssigmentmodule.getsearchAssignment().sendKeys("02-08-20250");
		System.out.println("Admin enters assignment due date which is not existing the table into search box");
	    LOGGER.info("Admin enters assignment due date which is not existing the table into search box");
	}

 @When("Admin enters grade value  into search box")
 public void admin_enters_grade_value_into_search_box() {
	 objAssigmentmodule.getAssignGrade().sendKeys("A");
	System.out.println("Admin  enters grade value A which is IN grade");
 }

 @Then("Displays entries with that assignment  grade")
 public void displays_entries_with_that_assignment_grade() {
	 objAssigmentmodule.getAssignGrade().isDisplayed();
 }

 @When("Admin enters grade value which is not existing the table into search box")
 public void admin_enters_grade_value_which_is_not_existing_the_table_into_search_box() {
	 		objAssigmentmodule.getAssignGrade().sendKeys("vv");
			System.out.println("Admin  enters grade value vv which is not in grade");
		    LOGGER.info("Admin   enters grade value vv which is not in grade");
		}

 @When("Admin click \"+Add \"new assignment button.")
 public void admin_click_add_new_assignment_button() {
	 objAssigmentmodule.getnewAssignment().click();
 }
	//////////////////////////////////popup////////////////
 @Given("Admin logged into LMS portal")
	public void admin_logged_into_lms_portal() {
		    System.out.println("Logged on to LMS portl as Admin");
		    LOGGER.info("Logged on to LMS portl as Admin");
		}

	@Given("clicks assignment button on the navigation bar")
	public void clicks_assignment_button_on_the_navigation_bar() {
		objAssigmentmodule.getAssignmentlnk().click();
	}

	@Given("Admin is on manage assignment Page")
	public void admin_is_on_manage_assignment_page() {
		 System.out.println("Admin loggen in and on Assignment page");
	}
	
	@Given("Admin click {string} new assignment button")
	public void admin_click_new_assignment_button(String string) {
		objAssigmentmodule.getnewAssignment().click();
	}
	

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
		 String strName=objAssigmentmodule.getheaderpopupAssigndetails().getText();
			    assertTrue(!strName.equals("Assignment details"), 
		    		"'assign details");
	}

	@Then("Admin should see input fields Text \\({string}, {string},{string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}).")
	public void admin_should_see_input_fields_text(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
		 objAssigmentmodule.getpopupProgramname().isDisplayed();
		 objAssigmentmodule.getpopupbatchnumber().isDisplayed();
		 objAssigmentmodule.getpopassignname().isDisplayed();
		 objAssigmentmodule.getheaderpopupAssigndetails().isDisplayed();
		 objAssigmentmodule.getheaderpopupAssigndetails().isDisplayed();
		 objAssigmentmodule.getheaderpopupAssigndetails().isDisplayed();
	}

	@Then("{int} textbox should be  present in Assignment details popup window")
	public void textbox_should_be_present_in_assignment_details_popup_window(Integer int1) {
		objAssigmentmodule.getpopupProgramname().sendKeys("sdet");
		 objAssigmentmodule.getpopupbatchnumber().sendKeys("2");
		 objAssigmentmodule.getpopassignname().sendKeys("assign-1");
		 objAssigmentmodule.getpopupAssignmentFile2().sendKeys("lmsproject");
		 objAssigmentmodule.getpopupAssignmentFile1().sendKeys("dsalgo");
		
	}

	@Then("Admin should see  dropdown option for Batch Number")
	public void admin_should_see_dropdown_option_for_batch_number() {
		objAssigmentmodule.getpopupbatchnumberdropdown().isDisplayed();
		
	}

	@Then("Admin should see  dropdown option for Program name")
	public void admin_should_see_dropdown_option_for_program_name() {
		objAssigmentmodule.getpopupProgramnamedrpdwn().isDisplayed();
	}

	@Then("Admin should see  calendar icon for assignment due date")
	public void admin_should_see_calendar_icon_for_assignment_due_date() {
		objAssigmentmodule.getpopupcalicon().isDisplayed(); 
	}

	@Then("Admin should see  save button in the Assignment detail popup window")
	public void admin_should_see_save_button_in_the_assignment_detail_popup_window() {
		objAssigmentmodule.getpopupAssignsave().isDisplayed();
	}

	@Then("Admin should see  cancel button in the Assignment detail popup window")
	public void admin_should_see_cancel_button_in_the_assignment_detail_popup_window() {
		objAssigmentmodule.getpopassigncancel().isDisplayed();
	
	}

	@Then("Admin should see  close button on the Assignment details popup window")
	public void admin_should_see_close_button_on_the_assignment_details_popup_window() {
		objAssigmentmodule.getpopupassignclose().isDisplayed();
	
	}

/////////////Add new assignment ///
@Given("Admin click {string} new assignment button after reaching to manage assignment page")
public void admin_click_new_assignment_button_after_reaching_to_manage_assignment_page(String string) {
	objAssigmentmodule.getnewAssignment().click();
}

@Given("Admin is in  assignment details+++ popup window")
public void admin_is_in_assignment_details_popup_window() {
	 String strName=objAssigmentmodule.getheaderpopupAssigndetails().getText();
	 assertTrue(!strName.equals("Assignment details"), 
	    		"'assign details");
}

@When("Admin enters all mandatory field values with valid data and clicks save button \\( Program name, batch number,Assignment Name, grade by, Assignment due date)")
public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
	objAssigmentmodule.getpopupProgramname().sendKeys("sdet");
	 objAssigmentmodule.getpopupbatchnumber().sendKeys("2");
	 objAssigmentmodule.getpopassignname().sendKeys("assign-1");
	 objAssigmentmodule.getpopupAssignmentFile2().sendKeys("lmsproject");
	 objAssigmentmodule.getpopupAssignmentFile1().sendKeys("dsalgo");
	
}
@Then("Admin should see new assignment details is added in the data table")
public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {
	
}

@When("Admin enters all mandatory field values with invalid data and clicks save button \\(Program name, batch number,Assignment Name, grade by, Assignment due date )")
public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Error message should appear in alert")
public void error_message_should_appear_in_alert() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters values in all fields with valid data and clicks save button \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters with invalid data in optional fields and clicks save button \\(Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters  data missing value in program name and clicks save button \\(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_data1_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Program Name is missing")
public void program_name_is_missing() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Batch number and clicks save button \\(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Batch number is missing")
public void batch_number_is_missing() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment name is missing")
public void assignment_name_is_missing() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment due date is missing")
public void assignment_due_date_is_missing() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Grade by is missing")
public void grade_by_is_missing() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment cannot be created for the passed date")
public void assignment_cannot_be_created_for_the_passed_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks date from date picker")
public void admin_clicks_date_from_date_picker() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("selected date should be their in class date text box")
public void selected_date_should_be_their_in_class_date_text_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("selected date should be in  mm\\/dd\\/yyyy format")
public void selected_date_should_be_in_mm_dd_yyyy_format() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks right arrow in the date picker near month")
public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Next month calender should visible")
public void next_month_calender_should_visible() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks left arrow in the date picker near month")
public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("previous month calender should visible")
public void previous_month_calender_should_visible() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks date picker button")
public void admin_clicks_date_picker_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see current date is highled in the date picker")
public void admin_should_see_current_date_is_highled_in_the_date_picker() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks date picker button and selects future date")
public void admin_clicks_date_picker_button_and_selects_future_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see selected date is highled in the date picker")
public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks Cancel button without entering values in the fields")
public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should land on manage assignment page")
public void admin_should_land_on_manage_assignment_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks Cancel button entering values in the fields")
public void admin_clicks_cancel_button_entering_values_in_the_fields() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

/////////////edit///////////////////
@Given("Admin clicks Edit button in manage assignment after reaching manage assignment page")
public void admin_clicks_edit_button_in_manage_assignment_after_reaching_manage_assignment_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is in  Edit assignment detail popup window")
public void admin_is_in_edit_assignment_detail_popup_window() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin is in  Edit assignment detail popup window")
public void admin_is_in_edit_assignment_detail_popup_window1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Edit popup window appears with heading Assignment Details")
public void edit_popup_window_appears_with_heading_assignment_details() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks Edit button from one of the row in data table")
public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Edit popup window appears with same row values in the all fields")
public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters all mandatory field values with valid data and clicks save button \\( Program name, batch number,Assignment Name, grade by, Assignment due date)")
public void admin_enters_all_mandatory_field_values_with_valid_data1_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see updated assignment details is added in the data table")
public void admin_should_see_updated_assignment_details_is_added_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters all mandatory field values with invalid data and clicks save button \\(Program name, batch number,Assignment Name, grade by, Assignment due date )")
public void admin_enters_all_mandatory_field_values_with_invalid_data1_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Error message should appear in alert")
public void error_message_should_appear_in_alert1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters values in all fields with valid data and clicks save button \\(Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_values_in_all_fields_with_valid_data_and_1clicks_save_button_program_name_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters with invalid data in optional fields and clicks save button \\(Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_with_invalid_data_in_optional_fields1_and_clicks_save_button_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters  data missing value in program name and clicks save button \\(batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button_batch_number_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Program Name is missing")
public void program_name_is_missing1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Batch number and clicks save button \\(Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file {int}, Assignment file {int}, Assignment file {int}, Assignment file {int})")
public void admin_enters_data_missing_value_in_batch_number_and_clicks_1save_button_program_name_assignment_name_assignment_description_grade_by_assignment_due_date_assignment_file1_assignment_file_assignment_file_assignment_file_assignment_file(Integer int1, Integer int2, Integer int3, Integer int4) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Batch number is missing")
public void batch_number_is_missing1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Assignment name and clicks save button \\(Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
public void admin_enters_data_missing_value_in_1assignment_name_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment name is missing")
public void assignment_name_is_missing1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in Assignment due date and clicks save button \\( Program name, batch number,Assignment Name, grade by)")
public void admin_enters_data_missing_value_in_assignment1_due_date_and_clicks_save_button_program_name_batch_number_assignment_name_grade_by() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment due date is missing")
public void assignment_due_date_is_missing1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters data missing value in grade by  and clicks save button \\(Program name, batch number,Assignment Name, Assignment due date)")
public void admin_enters_data_missing_value_in_grade_by_and_1clicks_save_button_program_name_batch_number_assignment_name_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Grade by is missing")
public void grade_by_is_missing1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin enters passed date in the due date field and clicks save button \\( Program name, batch number,Assignment Name,  grade by, Assignment Due date )")
public void admin_enters_passed_date_in_the_due_date_field_and_clicks_1save_button_program_name_batch_number_assignment_name_grade_by_assignment_due_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Assignment cannot be updated for the passed date")
public void assignment_cannot_be_updated_for_the_passed_date() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks Cancel button without entering values in the fields")
public void admin_clicks_cancel_button_without_entering_values_in_the_fields1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should land on manage assignment page")
public void admin_should_land_on_manage_assignment_page1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks Cancel button entering values in the fields")
public void admin_clicks_cancel_button_entering_values_in_the_fields1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
/////////////////////////////delete //////////////////////////////////////
@Given("Admin logged into LMS portal and clicks assignment button on the navigation bar")
public void admin1_logged_into_lms_portal_and_clicks_assignment_button_on_the_navigation_bar() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is in manage assignment page")
public void admin_is_in_manage_assignment_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks delete button in data table row level")
public void admin_clicks_delete_button_in_data_table_row_level() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see dialog box")
public void admin_should_see_dialog_box() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Alert should have {string} button to accept")
public void alert_should_have_button_to_accept(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Alert should have {string} button to reject")
public void alert_should_have_button_to_reject(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is in delete alert")
public void admin_is_in_delete_alert() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks yes button")
public void admin_clicks_yes_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks NO button")
public void admin_clicks_no_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

////////////multipledelete///////////////
@Given("Admin logged into LMS portal and clicks assignment button on the navigation bar")
public void admin_logged_into_lms_portal_and_clicks_assignment_button_on_the_navigation_bar() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is in manage assignment page")
public void admin_is_in_manage_assignment_page1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks single  row level check box in the data table")
public void admin_clicks_single_row_level_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Admin should see delete icon below the header is enabled")
public void admin_should_see_delete_icon_below_the_header_is_enabled() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin clicks delete button under header after selecting the check box in the data table")
public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin is in delete alert")
public void admin_is_in_delete_alert1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Admin clicks {string} button")
public void admin_clicks_button(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Redirected to assignment page and selected assignment details are deleted from the data table")
public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin clicks delete button under header after selecting the check box in the data")
public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Given("Admin clicks delete button under header after selecting the multiple check box in the data table")
public void admin_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


}



