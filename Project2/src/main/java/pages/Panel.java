package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Panel {

	public static WebDriver driver;

	public Panel(WebDriver driver) {
		Panel.driver = driver;
	}
	
	public WebElement getCreatePanelButton() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div/div/div/ul/li[1]/a"));
	}
	
	public WebElement getPanelModal() {
		return driver.findElement(By.xpath("//*[@id=\"manage\"]/div/div/div/div[2]"));
	}
	
	public WebElement getSearchBar() {
		return driver.findElement(By.xpath("//*[@id=\"searchTextBox\"]"));
	}

}