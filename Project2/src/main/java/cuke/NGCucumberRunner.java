package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\Administrator\\.jenkins\\workspace\\Project2\\Project2\\src\\test\\resources"},
tags = "@AssessBatch, @Footer, @LoginFailure, @LoginSuccess, @NavBarAssessBatch, @NavBarHome, @NavBarManageBatch, @NavBarPanel, @NavBarQualityAudit, @NavBarReports, @QualityAuditYear, @SettingsLocationsChange",
glue = {"cuke"},
plugin = {"pretty", "json:C:\\Users\\Administrator\\.jenkins\\workspace\\Project2\\Project2\\src\\main\\resources\\Cucumber.json"},
monochrome = true)

public class NGCucumberRunner extends AbstractTestNGCucumberTests {	
}
