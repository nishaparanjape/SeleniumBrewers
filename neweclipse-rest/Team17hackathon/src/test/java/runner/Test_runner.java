package runner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
             glue = "step_definitions", 
             dryRun = false, 
             monochrome = true,
             //tags = "@Test",
	         plugin = { "pretty", "html:target/LMSreport.html",
	        		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	        		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})
public class Test_runner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}

// Tips for final run
