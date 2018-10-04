package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
public static WebDriver driver;
	
	public Login(WebDriver driver) {
		Login.driver = driver;
	}
	
	public WebElement getUsernameField() {
		return driver.findElement(By.name("username"));
	}
	
	public WebElement getPasswordField() {
		return driver.findElement(By.name("pw"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[3]/div/input"));
	}

}