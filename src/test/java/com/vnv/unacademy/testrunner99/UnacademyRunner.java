//package com.vnv.unacademy.testrunner99;
package com.vnv.unacademy.testrunner99;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import com.vnv.unacademy.runner.utils.SetupDriver;

@CucumberOptions(
		//strict = true, 
      features = {"src/resources/unacademy"}, 
      glue = {"com.vnv.unacademy.steps"},
    monochrome = false,
    tags = //{"@Homepage"}
   // {"@LiveClass"}
 	//{"@Test_panel"}
{"@Login"}
		)




public class UnacademyRunner extends AbstractTestNGCucumberTests {
	 @DataProvider(parallel = true)

	public Object[][] scenarios() {
		return super.scenarios();
	}

	@AfterSuite
	public void teardown() throws Exception {
		//SetupDriver.teardown();
	}
}
