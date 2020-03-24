package Com.TestRunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Feature/Sauce_Demo.feature",
		//plugin = {"pretty", "html:reports/cucumber-html-report"},
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport"},

		//tags = {"@TC01_Login_SauceDemo"},
		glue = {"Com.Stepdefinition"},
		monochrome = true
		)
public class Sauce_Demo_Runner 
{
	@AfterClass
   public static void writeExtentReport() {
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
    }
}