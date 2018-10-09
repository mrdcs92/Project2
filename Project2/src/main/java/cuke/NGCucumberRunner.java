package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = {"src/test/resources/AssessBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginSuccess.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginFailure.feature"}, glue = {"cuke"})
<<<<<<< HEAD
@CucumberOptions(features = {"src/test/resources/AssessBatchTest.feature"}, glue = {"cuke"})

//@CucumberOptions(features = {"src/test/resources/NavBarHome.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarManageBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarAssessBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarQualityAudit.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarPanel.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarReports.feature"}, glue = {"cuke"})
=======
//@CucumberOptions(features = {"src/test/resources/NavBarHome.feature"}, glue = {"cuke"})
>>>>>>> 447dc26ca4b094281f61b48d8e2a8e682d8770b6

public class NGCucumberRunner extends AbstractTestNGCucumberTests {

}
