package testngs;

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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.Login;
import pages.SettingsLocations;

public class SettingsLocationTest2 {
	public static SettingsLocations settingsLocations;
	public static Login login;
	public static WebDriver driver;

	@BeforeSuite
	public void the_user_is_on_the_Locations_page() throws Throwable {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		settingsLocations = new SettingsLocations(driver);
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
		driver.findElement(By.linkText("Locations")).click();
	}

	@Test(priority = 2)
	public void deactivate() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();	
		driver.findElement(By.linkText("Locations")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr:nth-child(12)")));	
		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(1).getText().equals("BADDTest")){
				cells.get(4).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#deleteLocationModal > div > div > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#deleteLocationModal > div > div > div.modal-footer > input")).click();
			}
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean isFound = false;
		rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(0).getAttribute("ng-if").equals("location.active == 0")){
				isFound = true;
				//Don't know why it won't work so making a second test to fix it
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/ui-view/div/div[2]/div/div/table/tbody/tr[12]/td[5]/a/span")));
//				driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[2]/div/div/table/tbody/tr[12]/td[5]/a")).click();
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//*[@id=\"addLocationModal\"]/div/div/div[3]/input")));
//				driver.findElement(By.cssSelector("//*[@id=\"addLocationModal\"]/div/div/div[3]/input")).click();
			}
		}
		Assert.assertEquals(isFound,true);
	}

	@Test(priority = 3)
	public void reactivate() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));		
		driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")).click();
		driver.findElement(By.linkText("Locations")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr:nth-child(12)")));	
		ArrayList<WebElement> rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(1).getText().equals("BADDTest")){
				cells.get(4).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#addLocationModal > div > div > div.modal-footer > input")));
				driver.findElement(By.cssSelector("#addLocationModal > div > div > div.modal-footer > input")).click();
			}
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		boolean isFound = false;
		rows = (ArrayList<WebElement>) driver.findElements(By.cssSelector("body > div > ui-view > ui-view > div > div:nth-child(2) > div > div > table > tbody > tr"));
		for (WebElement row : rows){
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.tagName("td"));
			if (cells.get(0).getAttribute("ng-if").equals("location.active == 1")){
				isFound = true;
			}
		}
		Assert.assertEquals(isFound,true);
	}
	
	@AfterSuite
	public void cleanup() {
		driver.quit();
	}
}
