package cuke;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class footerTest {

	public static Login login;
	public static WebDriver driver;

	@BeforeSuite
	@Given("^the user has logged in with username and password$")
	public static void login() throws Throwable{
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
	}

	@When("^the user clicks revature$")
	public void testRevature() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		WebElement we = driver.findElement(By.xpath("/html/body/footer/div/div/div/div[2]/a[3]"));
		we.click();
	}

	@Then("^the user is directed to the revature home page$")
	public void revatureHomePage() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://revature.com/");
		driver.quit();
	}

}
