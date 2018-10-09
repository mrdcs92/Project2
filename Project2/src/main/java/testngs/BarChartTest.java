package testngs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;

public class BarChartTest {

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
		//driver.get("https://dev-caliber.revature.tech/caliber/#/vp/home");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
	}
	
	@Test
	public void checkWV() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement barChart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[ng-model='selectedBarState']")));
		
		barChart.click();
		for (int i = 0; i < 4; i++) {
			barChart.sendKeys(Keys.ARROW_DOWN);
		}
		barChart.sendKeys(Keys.ENTER);
		
//		List <WebElement> tablerows = driver.findElements(By.cssSelector("table[ng-if='stackedBarLabels']"));
//		List <WebElement> tablerows = holdup.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tr[ng-repeat='label in stackedBarLabels']")));
		List <WebElement> tablerows = driver.findElements(By.cssSelector("tr[ng-repeat='label in stackedBarLabels']"));
//		System.out.println(tablerows.get(1).getText());
//		for (int i = 0; i < tablerows.size(); i++) {
//			System.out.println(i);
//			System.out.println(tablerows.get(i).getText());
//		}
//		for(WebElement e : tablerows) {
//	        System.out.println(e.getText());
//	    }
		Assert.assertEquals("Adam Ranieri 2018-08-29 0 0 0 1 Good", tablerows.get(0).getText());
	}
	
	@Test void checkVA() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement barChart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[ng-model='selectedBarState']")));
		
		barChart.click();
		barChart.sendKeys(Keys.ARROW_DOWN);
		barChart.sendKeys(Keys.ENTER);
		
		List <WebElement> tablerows = driver.findElements(By.cssSelector("tr[ng-repeat='label in stackedBarLabels']"));
		
		List<String> manNames = new ArrayList<String>();
		manNames.add("Patrick Walsh 2018-08-19 0 0 0 1 Good");
		manNames.add("Fred Belotte 2018-08-12 0 6 12 1 Good");
		manNames.add("Mehrab Rahman 2018-08-13 0 7 16 0 Good");
		manNames.add("Yuvaraj Damodaran 2018-07-22 0 3 12 2 Good");
		manNames.add("Richard Orr 2018-07-10 7 2 7 0 Average");
		manNames.add("Peter Alagna 2018-08-22 0 0 0 12 Good");
		
		for (int i = 0; i < tablerows.size(); i++) {
			Assert.assertEquals(manNames.get(i), tablerows.get(i).getText());
		}
	}
	
	@Test void checkFL() {
		
	}
	
	@Test void checkNY() {
		
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
	
}
