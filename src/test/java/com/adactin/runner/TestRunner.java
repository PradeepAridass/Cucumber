package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.adactin.base.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature",
				glue = "com\\adactin\\stepdefinition",
				plugin = {"pretty", "html:Report/CucumberReport",
				"json:Report/Cucumber.json",
			 "com.cucumber.listener.ExtentCucumberFormatter:Report/CucumberExtentReport.html"},
			// "rerun:Report/FailedScenario.txt"},
				monochrome = true,
				dryRun = false)

public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		driver = BaseClass.browser("Chrome");
	}

}
