package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QualityAudit {

	public static WebDriver driver;

	public QualityAudit(WebDriver driver) {
		QualityAudit.driver = driver;
	}
	
	public WebElement getYearDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[1]/ul[1]/li[1]/a"));
	}
	
	public WebElement getTrainerDropdown() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[1]/ul[1]/li[2]/a"));
	}
	
	public WebElement getGreenFace() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[2]/div[2]/button[1]/i"));
	}
	
	public WebElement getYellowFace() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[2]/div[2]/button[2]/i"));
	}
	
	public WebElement getRedFace() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[2]/div[2]/button[3]/i"));
	}
	
	public WebElement getFeedbackField() {
		return driver.findElement(By.xpath("//*[@id=\"qcBatchNotes\"]"));
	}

	public WebElement getSaveButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[2]/div[2]/div/div/a/span"));
	}
	
	public WebElement getPlusButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[2]/ul/li[2]/a/span"));
	}
	
	public WebElement getYearChoice(String year) {
		if(year.equals("2017")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[1]/ul[1]/li[1]/ul/li[3]/a"));
		}
		if(year.equals("2018")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[1]/ul[1]/li[1]/ul/li[2]/a"));
		}
		if(year.equals("2019")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/ui-view/div[1]/div[1]/div/div[1]/ul[1]/li[1]/ul/li[1]/a"));
		}
		return null;
	}
	
}