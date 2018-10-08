package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBar {

	public static WebDriver driver;
	
	public NavBar(WebDriver driver) {
		NavBar.driver = driver;
	}
	
	public WebElement getButton(String button) {
		if(button.equals("Revature")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[1]/li/a/img"));
		} else if (button.equals("Home")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[1]/a"));
		} else if (button.equals("Manage Batch")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[2]/a"));
		} else if (button.equals("Assess Batch")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[3]/a"));
		} else if (button.equals("Quality Audit")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[4]/a"));
		} else if (button.equals("Panel")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[5]/a"));
		} else if (button.equals("Reports")) {
			return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[6]/a"));
		} else {
			return null;
		}
	}
	
	public WebElement getRevatureImageButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[1]/li/a/img"));
	}
	
	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[1]/a"));
	}
	
	public WebElement getManageBatchButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[2]/a"));
	}
	
	public WebElement getAssessBatchButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[3]/a"));
	}
	
	public WebElement getQualityAuditButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[4]/a"));
	}
	
	public WebElement getPanelButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[5]/a"));
	}
	
	public WebElement getReportsButton() {
		return driver.findElement(By.xpath("/html/body/div/ui-view/nav/div/ul[2]/li[6]/a"));
	}

}
