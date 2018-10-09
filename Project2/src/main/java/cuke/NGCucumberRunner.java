package cuke;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//LOGIN
//@CucumberOptions(features = {"src/test/resources/LoginSuccess.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/LoginFailure.feature"}, glue = {"cuke"})

//FOOTER
// Needs to be fixed //@CucumberOptions(features = {"src/test/resources/footer.feature"}, glue = {"cuke"})

//NAVBAR
//@CucumberOptions(features = {"src/test/resources/NavBarHome.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarManageBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarAssessBatch.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarQualityAudit.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarPanel.feature"}, glue = {"cuke"})
//@CucumberOptions(features = {"src/test/resources/NavBarReports.feature"}, glue = {"cuke"})

//ASSESS BATCH
//@CucumberOptions(features = {"src/test/resources/AssessBatchTest.feature"}, glue = {"cuke"})

//PANEL
// Broken Feature //@CucumberOptions(features = {"src/test/resources/PanelCreatePanel.feature"}, glue = {"cuke"})
// Broken Feature - Will Lock-Up Browser //@CucumberOptions(features = {"src/test/resources/PanelSearchBar.feature"}, glue = {"cuke"})

//QUALITY AUDIT
//@CucumberOptions(features = {"src/test/resources/QualityAuditYear.feature"}, glue = {"cuke"})

//SETTINGS LOCATIONS
@CucumberOptions(features = {"src/test/resources/SettingsLocationsChange.feature"}, glue = {"cuke"})

public class NGCucumberRunner extends AbstractTestNGCucumberTests {	
}
