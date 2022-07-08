//package com.vnv.unacademy.testrunner99;
package com.vnv.unacademy.testrunner99;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

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




public class Unacademyrunner2 extends AbstractTestNGCucumberTests {
	 @DataProvider(parallel = true)

	public Object[][] scenarios() {
		return super.scenarios();
	}

	@AfterSuite
	public void teardown() throws Exception {
		//SetupDriver.teardown();
	}
}
