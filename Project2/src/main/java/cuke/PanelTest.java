package cuke;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;
import pages.NavBar;
import pages.Panel;

public class PanelTest {
	
	public static Login login;
	public static Panel panel;
	public static NavBar nav;
	public static WebDriver driver;
	
	@Given("^The user is on the Panel page$")
	public void the_user_is_on_the_Panel_page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		nav = new NavBar(driver);
		panel = new Panel(driver);
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getPanelButton().click();
	}

	@When("^The user clicks on the Create Panel button$")
	public void the_user_clicks_on_the_Create_Panel_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/panels"));
		panel.getCreatePanelButton().click();
	}

	@Then("^The Create Panel prompt appears$")
	public void the_Create_Panel_prompt_appears() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By)panel.getPanelModal()));
		driver.quit();
	}
	
	@When("^The user clicks on the Search Bar$")
	public void the_user_clicks_on_the_Search_Bar() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/panels"));
		panel.getSearchBar().click();
	}

	@When("^Types in a value \"([^\"]*)\"$")
	public void types_in_a_value(String arg1) throws Throwable {
	    panel.getSearchBar().sendKeys(arg1);
	}

	@When("^Hits the Enter button$")
	public void hits_the_Enter_button() throws Throwable {
	    panel.getSearchBar().sendKeys(Keys.RETURN);
	}

	@Then("^The search will execute$")
	public void the_search_will_execute() throws Throwable {
		driver.quit();
	}

}
