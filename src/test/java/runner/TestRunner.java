package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import stepLibrary.GenericWrappers;

import java.io.File;

@RunWith(Cucumber.class)
/*
 * @ExtendedCucumberOptions(jsonReport = "target/cucumber.json", retryCount = 0,
 * //To rerun the scenario , if the scenario fails detailedReport = true,
 * detailedAggregatedReport = true, overviewReport = true, //coverageReport =
 * true, screenShotLocation="ScreenShots/", screenShotSize="100px",
 * jsonUsageReport = "target/cucumber-usage.json", usageReport = true, toPDF =
 * true, excludeCoverageTags = {"@flaky" }, includeCoverageTags = {"@passed" },
 * outputFolder = "target/")
 */

@CucumberOptions(features = {"./src/test/java/features"}, plugin = {"json:target/cucumber.json",
		"html:target/site/cucumber-pretty", "usage:target/cucumber/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/extent-report/report.html"},
		glue = {"stepDefinitions", "helpers"}, monochrome = true, tags = "@Smoke_iOS11")

public class TestRunner {

	@AfterClass
	public static void reportGeneration() {
//		Reporter.loadXMLConfig(new File(GenericWrappers.userDir + "/extent-report-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", GenericWrappers.osName);
		Reporter.setSystemInfo("platform", GenericWrappers.platformName);
	}

}