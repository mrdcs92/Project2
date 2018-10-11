package testngs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import util.PropertyParser;

public class HomePageTest {

	public static HomePage homePage;
	public static Login login;
	public static WebDriver driver;
	
	@BeforeClass
	public void setUpDriverAndPage() {
		String userDriver = PropertyParser.getProp("ec2driver");
		File file = new File(userDriver);
		
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		homePage = new HomePage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
	}
	
	@Test
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
	
	@Test
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
	
	@Test(priority = 2)
	void selectFL() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("FL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Tampa");
	}
	
	@Test(priority = 2)
	void selectFL2() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("FL");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Tampa");
	}
	
	@Test(priority = 3)
	void selectNY() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("NY");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Queens");
	}
	
	@Test(priority = 3)
	void selectNY2() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("NY");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Queens");
	}
	
	@Test(priority = 4)
	void selectWV() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("WV");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Morgantown");
	}
	
	@Test(priority = 4)
	void selectWV2() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("WV");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[1]/option[2]")).getText(),
				"Morgantown");
	}
	
	@Test(priority = 5)
	void selectAllStates() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("All States");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select/option[1]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select/option[1]")).getText(),
				"All States");
	}
	
	@Test(priority = 5)
	void selectAllStates2() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));	
		Select states = new Select(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[2]/div/div/div[1]/select[2]")));
		states.selectByVisibleText("All States");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select/option[1]")));
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div/div[1]/div/div/div[1]/select/option[1]")).getText(),
				"All States");
	}
	
	@AfterClass
	public void cleanup() {
		driver.quit();
	}
	
}
