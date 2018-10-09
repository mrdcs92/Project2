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

import pages.QualityAudit;

public class QualityAuditTest {

	public static Login login;
	public static QualityAudit qa;
	public static NavBar nav;
	public static WebDriver driver;

	@Given("^The user is on the Quality Audit Page$")
	public void the_user_is_on_the_Quality_Audit_Page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		nav = new NavBar(driver);
		qa = new QualityAudit(driver);
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getQualityAuditButton().click();
	}

	@When("^The user clicks the Year tab$")
	public void the_user_clicks_the_Year_tab() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/audit"));
		qa.getYearDropdown().click();
	}

	@When("^The user clicks on a \"([^\"]*)\"$")
	public void the_user_clicks_on_a(String arg1) throws Throwable {
		qa.getYearChoice(arg1).click();
	}

	@Then("^The tag should change to \"([^\"]*)\"$")
	public void the_tag_should_change_to(String arg1) throws Throwable {
		Assert.assertEquals(qa.getYearDropdown().getText(), arg1);
		driver.quit();
	}

}