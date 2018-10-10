package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageBatchPage {

	public static WebDriver driver;
	
	public ManageBatchPage(WebDriver driver) {
		ManageBatchPage.driver = driver;
	}
	
	public WebElement getNavbarBatchLink() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement navItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Manage Batch")));
		return navItem;
	}
	
	public WebElement getCreateBatchButton() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement webEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[ng-click='resetBatchForm()']")));
		return webEle;
	}
	
	public WebElement getTrainNameInput() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement webEle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trainingName")));
		return webEle;
		//return driver.findElement(By.id("trainingName"));
	}
	
	public WebElement getTrainTypeInput() {
		return driver.findElement(By.id("trainingType"));
	}
	
	public WebElement getSkillTypeInput() {
		return driver.findElement(By.id("skillType"));
	}
	
	public WebElement getLocationInput() {
		return driver.findElement(By.id("location"));
	}
	
	public WebElement getTrainerInput() {
		return driver.findElement(By.id("trainer"));
	}
	
	public WebElement getCoTrainerInput() {
		return driver.findElement(By.id("co-trainer"));
	}
	
	public WebElement getStartDate() {
		return driver.findElement(By.xpath("//*[@id=\"start-date\"]/input"));
	}
	
	public WebElement getEndDate() {
		return driver.findElement(By.xpath("//*[@id=\"end-date\"]/input"));
	}
	
	public WebElement getGoodGradeInput() {
		return driver.findElement(By.id("goodGrade"));
	}
	
	public WebElement getBorderLineGradeInput() {
		return driver.findElement(By.id("borderlineGrade"));
	}
	
	public WebElement getCreateModalSave() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement getCreateModalCancel() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/button"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("//*[@id=\"createBatchModal\"]/div/div/div[3]/input"));
	}
	
	public WebElement getTrainingName() {
	//	return driver.findElement(By.linkText("baddjava"));
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div[2]/div/div/table/tbody/tr[1]/td[1]"));
	}
	
	// Login Page methods
	
	public WebElement getUserName() {
		return driver.findElement(By.name("username"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.name("pw"));
	}
	
	public WebElement getCredInput() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input"));
	}
	
}
