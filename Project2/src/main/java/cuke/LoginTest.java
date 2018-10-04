package cuke;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class LoginTest {

	public static Login login;
	public static WebDriver driver;

	@Given("^The user is on the Caliber Login Page$")
	public void the_user_is_on_the_Caliber_Login_Page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
	}

	@Given("^The user types in username \"([^\"]*)\"$")
	public void the_user_types_in_username(String arg1) throws Throwable {
		login.getUsernameField().sendKeys(arg1);
	}

	@Given("^The user types in password \"([^\"]*)\"$")
	public void the_user_types_in_password(String arg1) throws Throwable {
		login.getPasswordField().sendKeys(arg1);
	}

	@When("^The user clicks the login button$")
	public void the_user_clicks_the_login_button() throws Throwable {
		login.getLoginButton().click();
	}

	@Then("^The URL of the page is \"([^\"]*)\"$")
	public void the_header_of_the_page_is(String arg1) throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), arg1);
		driver.quit();
	}

}