package cuke;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		nav.getHomeButton().click();
	}

	@Then("^The user should be on the homepage$")
	public void the_user_should_be_on_the_homepage() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dev-caliber.revature.tech/caliber/#/vp/home");
		driver.close();
	}

}
