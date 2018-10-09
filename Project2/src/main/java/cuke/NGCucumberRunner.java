package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features = {"src/test/resources/LoginSuccess.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginFailure.feature"}, glue = {"cuke"})

//@CucumberOptions(features = {"src/test/resources/NavBarHome.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarManageBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarAssessBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarQualityAudit.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarPanel.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarReports.feature"}, glue = {"cuke"})

//@CucumberOptions(features = {"src/test/resources/PanelCreatePanel.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/PanelSearchBar.feature"}, glue = {"cuke"})

//@CucumberOptions(features = {"src/test/resources/QualityAuditYear.feature"}, glue = {"cuke"})

@CucumberOptions(features = {"src/test/resources/SettingsLocationsChange.feature"}, glue = {"cuke"})

public class NGCucumberRunner extends AbstractTestNGCucumberTests {
	
}
