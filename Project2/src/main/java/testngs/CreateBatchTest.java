package testngs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.ManageBatchPage;
import util.PropertyParser;

public class CreateBatchTest {

	public static ManageBatchPage mbPage;
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUpDriverAndPage() {
		String dylandriver = PropertyParser.getProp("dylandriver");
		
		File file = new File(dylandriver);
		File testfile = new File(dylandriver);
		System.out.println("absolute path: " + testfile.getAbsolutePath());
		
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		mbPage = new ManageBatchPage(driver);
		driver.get("https://dev-caliber.revature.tech/");
		mbPage.getUserName().sendKeys("calibot@revature.com");
		mbPage.getPassword().sendKeys("*6Ak4-&kXnNTfTh6");
		mbPage.getCredInput().click();
    
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
		
		mbPage.getSaveButton().click();
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		Assert.assertEquals(mbPage.getTrainingName().getText(), "baddjava");
		
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
