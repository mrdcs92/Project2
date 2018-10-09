package cuke;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class AssessBatchTest {
	
	public static Login login;
	public static WebDriver driver;
	
	@Given("^the user is on the assess batch page$")
	public void the_user_is_on_the_assess_batch_page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		login = new Login(driver);
		// go to website
		driver.get("https://dev-caliber.revature.tech/");
		//enter username and password
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		// login
		login.getLoginButton().click();
		// go to assess batch
		WebDriverWait wdw = new WebDriverWait(driver, 15);
		wdw.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		WebElement we = driver.findElement(By.linkText("Assess Batch"));
		we.click();
	}
	
	//------------------------------------------------------------------------------------------------------

	@When("^the user clicks on the year drop down menu$")
	public void the_user_clicks_on_the_year_drop_down_menu() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we = driver.findElement(By.linkText("2018"));
		we.click();// assume button clicked
	}

	@When("^the user clicks on \"([^\"]*)\"$")
	public void the_user_clicks_on(String arg1) throws Throwable {
		WebElement we = driver.findElement(By.linkText(arg1));
		we.click();
		
	}

	@Then("^the drop down menu's value changes to \"([^\"]*)\"$")
	public void the_drop_down_menu_s_value_changes_to(String arg1) throws Throwable {
		WebElement we = driver.findElement(By.linkText(arg1));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Assert.assertEquals(we.getText(), arg1);
	    driver.close();
	}
	//-------------------------------------------------------------------------------------
	
	@When("^the user clicks on the trainor drop down menu$")
	public void the_user_clicks_on_the_trainor_drop_down_menu() throws Throwable {
		// change drop down to 2017 on assess page
		System.out.println("test0");
		WebDriverWait wdw = new WebDriverWait(driver, 15);
		System.out.println("test1");
		wdw.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/assess"));
		System.out.println("test2");
		WebElement we = driver.findElement(By.linkText("2020"));
		System.out.println("test3");
		we.click();
		we = driver.findElement(By.linkText("2017"));
		we.click();
		// click on the menu
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement parent, child;
//		parent = driver.findElement(By.cssSelector("li [ng-show='!noBatches']"));
		parent = driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[2]"));
//	    parent = driver.findElement(By.cssSelector("li [role='button'] [class='dropdown'] [ng-show='!noBatches']"));
		child = parent.findElement(By.cssSelector("a [class='dropdown-toggle ng-binding'] [data-toggle='dropdown'] [aria-expanded='false']"));
	    System.out.println("chose "+child.getText());
	    driver.quit();
	}

	
	
}
