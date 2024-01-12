package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//features/Login.feature",".//features/SearchCustomer.feature"},
		glue="Stepdefinition",
		dryRun=false,
		monochrome=true,
		tags="@Smoke or @Sanity",
		plugin= {"pretty","html:target/cucumber-Reports/HtmlReport.html",
				"json:target/cucumber-Reports/HtmlReport.json",
				"junit:target/cucumber-Reports/HtmlReport.junit",
				"pretty:target/cucumber-Reports/HtmlReport.txt"
						 }
		)
public class Run {

}
