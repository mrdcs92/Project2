package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebDriver driver;
	
	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
	}
	
	public WebElement getLQAChart() {
		return driver.findElement(By.cssSelector("select[ng-model='selectedBarState']"));
	}
	
}
