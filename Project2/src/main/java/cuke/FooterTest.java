package cuke;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;
import util.PropertyParser;

public class FooterTest {

	public static Login login;
	public static WebDriver driver;

	@Given("^the user has logged in with username and password$")
	public static void the_user_has_logged_in_with_username_and_password() throws Throwable{
		String userDriver = PropertyParser.getProp("ec2driver");
		File file = new File(userDriver);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		login = new Login(driver);
		
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
	}

	@When("^the user clicks revature$")
	public void the_user_clicks_revature() throws Throwable {
		WebElement we = driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[3]"));
		we.click();
	}

	@Then("^the user is directed to the revature home page$")
	public void the_user_is_directed_to_the_revature_home_page() throws Throwable {
		// wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String url;
		
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		url = driver.getTitle();
		
		driver.quit();
		Assert.assertEquals(url, "Technology Talent Development | Technology Solutions | Revature");
	}

	

}
