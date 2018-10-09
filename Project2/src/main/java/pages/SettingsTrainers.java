package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsTrainers {
	public static WebDriver driver;
	
	public SettingsTrainers(WebDriver driver) {
		HomePage.driver = driver;
	}
	
	public WebElement getDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]")));
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[7]"));
	}
	
	public WebElement getDropdownTrainer() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Trainers")));
		return driver.findElement(By.linkText("Trainers"));
	}
	
	public WebElement getTrainerDiv() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[2]"));
	}
	
	public WebElement getCreateTrainerButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div/div[1]/div/div/ul/li"));
	}
	
	public WebElement getTrainerModalLabel() {
		return driver.findElement(By.id("trainerModalLabel"));
	}
	
	public WebElement getTrainerModalName() {
		return driver.findElement(By.id("trainerName"));
	}
	public WebElement getTrainerModalEmail() {
		return driver.findElement(By.id("trainerEmail"));
	}
	public WebElement getTrainerModalTitle() {
		return driver.findElement(By.id("Title"));
	}
	public WebElement getTrainerModalTeir() {
		return driver.findElement(By.id("trainerTier"));
	}
	public WebElement getModalSave() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"createTrainerModal\"]/div/div/div[2]/div[2]/input")));
		return driver.findElement(By.xpath("//*[@id=\"createTrainerModal\"]/div/div/div[2]/div[2]/input"));
	}
}
