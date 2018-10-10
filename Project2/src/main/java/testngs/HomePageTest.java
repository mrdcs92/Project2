package testngs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;

public class HomePageTest {

	public static HomePage homePage;
	public static Login login;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUpDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
	}
	
	@Test(priority = 1)
	void selectVA() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select")));
		states.selectByVisibleText("VA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]")).getAttribute("ng-change"),
				"onBarCharAddressCityChange(selectedBarCity.address.city)");
	}
	
	@Test(priority = 2)
	void selectVA2() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select")));
		states.selectByVisibleText("VA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]")).getAttribute("ng-model"),
				"selectedLineCity");
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
	
}
