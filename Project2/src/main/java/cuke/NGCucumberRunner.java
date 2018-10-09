package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources/AssessBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginSuccess.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginFailure.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarHome.feature"}, glue = {"cuke"})

public class NGCucumberRunner extends AbstractTestNGCucumberTests {

}
