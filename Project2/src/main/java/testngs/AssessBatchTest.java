package testngs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.AssessBatchPage;
public class AssessBatchTest {
	public static AssessBatchPage assessBatchPage;
	public static WebDriver driver;
	
	@BeforeSuite
	public void the_user_is_on_the_Locations_page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		assessBatchPage = new AssessBatchPage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.cssSelector("body > div > div > div > div.panel-body > div > form > div:nth-child(3) > div > input")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[3]/a")));
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[3]/a")).click();
	}
	
	@Test(priority = 1)
	public void check2019() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]")));
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div/div[2]/ul[1]/li[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(1) > a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")));
		String check = driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")).getText();
		Assert.assertEquals(check, "Caliber Bot - 2/28/19");
	}
	
	@Test(priority = 2)
	public void check2018() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Clicking on the years
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")).click();
		
		//Clicking Year 2018
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(2) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(2) > a")).click();
		
		//Clicking on batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")).click();
		
		//Selecting a Batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Abhishek Bhalerao - 10/18/18")));
		driver.findElement(By.linkText("Abhishek Bhalerao - 10/18/18")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Abhishek Bhalerao - 10/18/18")));
		String check = driver.findElement(By.linkText("Abhishek Bhalerao - 10/18/18")).getText();
		Assert.assertEquals(check, "Abhishek Bhalerao - 10/18/18");
	}
	
	@Test(priority = 3, enabled = false)
	public void check2017() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Clicking on the years
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")).click();
		
		//Clicking Year 2017
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(3) > a"));	
		//Clicking on batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")).click();
		//Selecting a Batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Ryan Lessley - 11/18/17")));
		driver.findElement(By.linkText("Ryan Lessley - 11/18/17")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Ryan Lessley - 11/18/17")));
		String check = driver.findElement(By.linkText("Ryan Lessley - 11/18/17")).getText();
		Assert.assertEquals(check, "Ryan Lessley - 11/18/17");
	}
	
	@Test(priority = 4)
	public void check2016() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Clicking on the years
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(1) > a")).click();
		
		//Clicking Year 2016
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(4) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li.dropdown.open > ul > li:nth-child(4) > a")).click();
		
		//Clicking on batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(2) > a")).click();
		
		//Selecting a Batch
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Ravi Singh - 10/3/16")));
		driver.findElement(By.linkText("Ravi Singh - 10/3/16")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Ravi Singh - 10/3/16")));
		String check = driver.findElement(By.linkText("Ravi Singh - 10/3/16")).getText();
		Assert.assertEquals(check, "Ravi Singh - 10/3/16");
	}
	
	@Test(priority = 4)
	public void clickCreateAssessment() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(4) > a > span")));
		driver.findElement(By.cssSelector("body > div > ui-view > ui-view > div:nth-child(1) > div > div.col-md-12.col-lg-12.top10 > ul:nth-child(1) > li:nth-child(4) > a > span")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("#createAssessmentModal > div > div > div")).getAttribute("class"), "modal-header");		
	}
	
//	@Test(priority = 4)
//	public void createAssessment() {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#category")));
//		driver.findElement(By.cssSelector("#category")).click();
//		
//		Select catagory = new Select(driver.findElement(By.cssSelector("#createAssessmentModal > div > div > form > div.modal-body > div:nth-child(1) > div > select")));
//		catagory.selectByVisibleText("Git");
//		driver.findElement(By.cssSelector("#rawScore")).sendKeys("66");
//		Select type = new Select(driver.findElement(By.cssSelector("#createAssessmentModal > div > div > form > div.modal-body > div:nth-child(2) > div:nth-child(2) > select")));
//		type.selectByVisibleText("Exam");
//		driver.findElement(By.cssSelector("#createAssessmentModal > div > div > form > div.modal-footer > input")).click();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")));
//		String check = driver.findElement(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")).getText();
//		Assert.assertEquals(check, "Git Exam (100%)");
//	}

//	@Test(priority = 5)
//	public void updateAssessment() {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		driver.findElement(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")).click();
//		
//																		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")));
//		Select category = new Select(driver.findElement(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")));
//		category.selectByVisibleText("CSS");
//		
//		driver.findElement(By.xpath("//*[@id=\"editAssessmentModal_500002035\"]/div/div/div[3]/div[2]/input")).click();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")));
//		String check = driver.findElement(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-1.col-md-1.col-lg-1.text-center.ng-binding.ng-scope")).getText();
//		Assert.assertEquals(check, "CSS Exam (100%)");
//	}
	
//	@Test(priority = 6)
//	public void deleteAssessment() {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		driver.findElement(By.cssSelector("//*[@id=\"trainer-assess-table\"]/div/div/ul/ul/table/thead/tr/th[3]")).click();;
//
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Delete")));
//		driver.findElement(By.linkText("Delete")).click();
//		
//		String check = driver.findElement(By.cssSelector("#trainer-assess-table > div > div > ul > ul > table > thead > tr > th.col-sm-9.col-md-9.col-lg-9")).getText();
//		Assert.assertEquals(check, "Notes");
//	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
