package testngs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ManageBatchPage;

public class CreateBatchTest {

	public static ManageBatchPage mbPage;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUpDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		mbPage = new ManageBatchPage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		//driver.get("https://dev-caliber.revature.tech/caliber/#/vp/home");
//		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		mbPage.getUserName().sendKeys("calibot@revature.com");
//		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		mbPage.getPassword().sendKeys("*6Ak4-&kXnNTfTh6");
//		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
		mbPage.getCredInput().click();
		
//		WebDriverWait batchWait = new WebDriverWait(driver, 20);
//		WebElement navItem = batchWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Manage Batch")));
//		navItem.click();
		mbPage.getNavbarBatchLink().click();
	}
	
	@Test
	public void createBatch() throws InterruptedException {
		mbPage.getCreateBatchButton().click();
		mbPage.getTrainNameInput().sendKeys("baddjava");
		
		mbPage.getTrainTypeInput().click();
		mbPage.getTrainTypeInput().sendKeys(Keys.ARROW_DOWN);
		mbPage.getTrainTypeInput().click();
		
		mbPage.getSkillTypeInput().click();
		mbPage.getSkillTypeInput().sendKeys(Keys.ARROW_DOWN);
		mbPage.getSkillTypeInput().click();
		
		mbPage.getLocationInput().click();
		mbPage.getLocationInput().sendKeys(Keys.ARROW_DOWN);
		mbPage.getLocationInput().click();

		mbPage.getTrainerInput().click();
		mbPage.getTrainerInput().sendKeys(Keys.ARROW_DOWN);
		mbPage.getTrainerInput().click();
		
		mbPage.getStartDate().click();
		mbPage.getStartDate().sendKeys("12122018");
		
		mbPage.getEndDate().click();
		mbPage.getEndDate().sendKeys("03032019");
		
		mbPage.getGoodGradeInput().click();
		mbPage.getGoodGradeInput().sendKeys("80");
		
		mbPage.getBorderLineGradeInput().click();
		mbPage.getBorderLineGradeInput().clear();
		mbPage.getBorderLineGradeInput().sendKeys("70");
		
//		Thread.sleep(5000);
//		mbPage.getCreateModalSave().click();
//		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
