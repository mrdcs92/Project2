package cuke;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SettingsLocations;
import util.PropertyParser;

public class SettingsLocationsTest {

	public static SettingsLocations settingsLocations;
	public static WebDriver driver;

	@Given("^The user is on the Locations page$")
	public void the_user_is_on_the_Locations_page() throws Throwable {
		String userDriver = PropertyParser.getProp("ec2driver");
		File file = new File(userDriver);
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		settingsLocations = new SettingsLocations(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Locations")).click();
	}

	@When("^The user clicks on the modify data$")
	public void the_user_clicks_on_the_modify_data() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr:nth-child(12)")));	

		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(1).getText().equals("BADDTest")){
				cells.get(3).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")));
				driver.findElement(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("BADDTest2");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#editLocationModal > div > div > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#editLocationModal > div > div > div.modal-footer > input")).click();
			}
		}
	}

	@Then("^The data should change$")
	public void the_data_should_change() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		boolean isFound = false;
		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(1).getText().equals("BADDTest2")){
				isFound = true;
				cells.get(3).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")));
				driver.findElement(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"editLocationModal\"]/div/div/div[2]/div/div[1]/div[1]/input")).sendKeys("BADDTest");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#editLocationModal > div > div > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#editLocationModal > div > div > div.modal-footer > input")).click();
			}
		}
		Assert.assertEquals(isFound,true);
		driver.close();
	}
}
