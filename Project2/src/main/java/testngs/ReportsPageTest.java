package testngs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ReportPage;

public class ReportsPageTest {

	public static ReportPage reportPage;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUpDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		reportPage = new ReportPage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[6]/a")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[6]/a")).click();
	}
	
	@Test(priority = 1)
	public void selecting2019() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1)")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1)")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(1) > a")));		
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(1) > a")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")));
		String check = driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")).getText();
		Assert.assertEquals(check, "Caliber Bot - 2/28/19");
	}
	
	@Test(priority = 1)
	public void selecting2018() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(2) > a")));		
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(2) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")));
		String check = driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")).getText();
		Assert.assertEquals(check, "Ravi Singh - 12/12/18");
	}
	
	@Test(priority = 1)
	public void selecting2017() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(3) > a")));		
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(3) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")));
		String check = driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")).getText();
		Assert.assertEquals(check, "Ryan Lessley - 11/12/17");
	}
	
	@Test(priority = 2)
	public void selecting2016() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(4) > a")));		
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li.dropdown.open > ul > li:nth-child(4) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")));
		String check = driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")).getText();
		Assert.assertEquals(check, "Patrick Walsh - 11/15/16");
	}
	
	@Test(priority = 3)
	public void traineeComparison() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#caliber-container > div > div > div.row > div.col-sm-5.col-md-5.col-lg-5 > div > div.panel-heading > div")));
		driver.findElement(By.cssSelector("#caliber-container > div > div > div.row > div.col-sm-5.col-md-5.col-lg-5 > div > div.panel-heading > div")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#insert-trainee > div > div > div.modal-body > div > table > tbody > tr:nth-child(15) > th > input")));
		driver.findElement(By.cssSelector("#insert-trainee > div > div > div.modal-body > div > table > tbody > tr:nth-child(15) > th > input")).click();
		driver.findElement(By.cssSelector("#insert-trainee > div > div > div.modal-header > button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#caliber-container > div > div > div.row > div.col-sm-5.col-md-5.col-lg-5 > div > div.panel-body > div > div > table > tbody > tr:nth-child(1) > th:nth-child(3)")));
		String check = driver.findElement(By.cssSelector("#caliber-container > div > div > div.row > div.col-sm-5.col-md-5.col-lg-5 > div > div.panel-body > div > div > table > tbody > tr:nth-child(1) > th:nth-child(3)")).getText();
		Assert.assertEquals(check, "Yar, Shehar");
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
