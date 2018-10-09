package testngs;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

import pages.Login;
import pages.SettingsTrainers;

public class SettingsTrainersTest {

	public static SettingsTrainers settingsTrainers;
	public static Login login;
	public static WebDriver driver;

	@BeforeSuite
	public void setUpDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		settingsTrainers = new SettingsTrainers(driver);
		driver.get("https://dev-caliber.revature.tech/");
		driver.findElement(By.name("username")).sendKeys("calibot@revature.com");
		driver.findElement(By.name("pw")).sendKeys("*6Ak4-&kXnNTfTh6");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input")).click();
	}

	@Test(priority = 1)
	public void goToPage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Trainers")).click();
		Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[2]")).isDisplayed(),true);
	}

	@Test(priority = 2)
	public void modifyTrainer() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Trainers")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li/a")));

		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(0).getText().equals("Ravi Singh")){
				cells.get(4).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")));
				driver.findElement(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")).sendKeys("Ravi SinghTest");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#editTrainerModal > div > div > div.modal-body > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#editTrainerModal > div > div > div.modal-body > div.modal-footer > input")).click();
			}
		}

		boolean isFound = false;
		rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(0).getText().equals("Ravi SinghTest")){
				isFound = true;
				cells.get(4).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")));
				driver.findElement(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")).clear();
				driver.findElement(By.xpath("//*[@id=\"editTrainerModal\"]/div/div/div[2]/div[1]/div[1]/div[1]/input")).sendKeys("Ravi Singh");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#editTrainerModal > div > div > div.modal-body > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#editTrainerModal > div > div > div.modal-body > div.modal-footer > input")).click();
			}
		}
		Assert.assertEquals(isFound,true);	
	}

	@Test(priority = 3)
	public void createTrainer() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Trainers")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li/a")));
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trainerModalLabel")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trainerTier")));
		driver.findElement(By.id("trainerName")).sendKeys("BADDTrainerNameTest");
		driver.findElement(By.id("trainerEmail")).sendKeys("BADDTrainerEmailTest@gmail.com");		
		driver.findElement(By.id("Title")).sendKeys("Bot User");
		Select t = new Select(driver.findElement(By.id("trainerTier")));
		t.selectByValue("TRAINER");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"createTrainerModal\"]/div/div/div[2]/div[2]/input")));
		driver.findElement(By.xpath("//*[@id=\"createTrainerModal\"]/div/div/div[2]/div[2]/input")).click();;

		boolean isFound = false;
		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			if(row.getText().equals("BADDTrainerNameTest Bot User BADDTrainerEmailTest@gmail.comTRAINER")) {
				isFound = true;
			}
			//			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			//			System.out.println(row.getText());
			//			if (cells.get(0).getText().equals("BADDTrainerNameTest")){
			//				isFound = true;
			//			}
		}
		Assert.assertEquals(isFound,false);	
	}

	@Test(priority = 5)
	public void createTrainerButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Trainers")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li/a")));
		driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trainerModalLabel")));
		Assert.assertEquals("Add Trainer",driver.findElement(By.id("trainerModalLabel")).getText());
	}
	//	Cannot be tested because things will break for everyone!!!
	//	@Test(priority = 6)
	//	public void deleteTrainer() {
	//	}

	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
