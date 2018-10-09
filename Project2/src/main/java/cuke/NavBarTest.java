package cuke;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;
import pages.NavBar;

public class NavBarTest {

	public static Login login;
	public static NavBar nav;
	public static WebDriver driver;

	@Given("^The user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		nav = new NavBar(driver);
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
	}

	@When("^The user clicks on the Home button$")
	public void the_user_clicks_on_the_Home_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getHomeButton().click();
	}

	@Then("^The user should be on the homepage$")
	public void the_user_should_be_on_the_homepage() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/home");
		driver.quit();
	}

	@When("^The user clicks on the Manage Batch button$")
	public void the_user_clicks_on_the_Manage_Batch_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getManageBatchButton().click();
	}

	@Then("^The user should be on the Manage Batch page$")
	public void the_user_should_be_on_the_Manage_Batch_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/manage"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/manage");
		driver.quit();
	}

	@When("^The user clicks on the Assess Batch button$")
	public void the_user_clicks_on_the_Assess_Batch_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getAssessBatchButton().click();
	}

	@Then("^The user should be on the Assess Batch page$")
	public void the_user_should_be_on_the_Assess_Batch_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/assess"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/assess");
		driver.quit();
	}

	@When("^The user clicks on the Quality Audit button$")
	public void the_user_clicks_on_the_Quality_Audit_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getQualityAuditButton().click();
	}

	@Then("^The user should be on the Quality Audit page$")
	public void the_user_should_be_on_the_Quality_Audit_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/audit"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/audit");
		driver.quit();
	}

	@When("^The user clicks on the Panel button$")
	public void the_user_clicks_on_the_Panel_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getPanelButton().click();
	}

	@Then("^The user should be on the Panel page$")
	public void the_user_should_be_on_the_Panel_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/panels"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/panels");
		driver.quit();
	}

	@When("^The user clicks on the Reports button$")
	public void the_user_clicks_on_the_Reports_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getReportsButton().click();
	}

	@Then("^The user should be on the Reports page$")
	public void the_user_should_be_on_the_Reports_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/reports"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/reports");
		driver.quit();
	}

}