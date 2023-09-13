package runner;

import org.testng.annotations.DataProvider;

//import io.cucumber.junit.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
                 glue = "step_definitions", 
                 dryRun = false, 
                 monochrome = true,
		     
		         plugin = { "pretty", "html:target/CucumberReport.html",
		        		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class Test_runner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}


