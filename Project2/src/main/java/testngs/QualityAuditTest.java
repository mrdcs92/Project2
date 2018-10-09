package testngs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.Login;
import pages.NavBar;
import pages.QualityAudit;

public class QualityAuditTest {

	public static Login login;
	public static QualityAudit qa;
	public static NavBar nav;
	public static WebDriver driver;

	@BeforeSuite
	public void setupDriverAndPage() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		nav = new NavBar(driver);
		qa = new QualityAudit(driver);
		login = new Login(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getQualityAuditButton().click();
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/audit"));
	}

	@Test(enabled = false)
	public void textFields() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		qa.getWeekOne().click();
		for (int i = 1; i <= 5; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getTextField(i)));
			qa.getTextField(i).click();
			wait.until(ExpectedConditions.elementToBeClickable(qa.getTextField(i)));
			qa.getTextField(i).click();
			qa.getTextField(i).clear();
			qa.getTextField(i).sendKeys("Test");
		}
	}

	@Test(enabled = false)
	public void traineeFaceButtons() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		qa.getWeekOne().click();
		for (int i = 1; i <= 5; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getFaceButton(i)));
			qa.getFaceButton(i).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

	@Test(enabled = false)
	public void batchFaceButtons() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		qa.getWeekOne().click();
		for (int i = 1; i <= 3; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getBatchFaces(i)));
			qa.getBatchFaces(i).click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

	@Test
	public void feedbackTextField() {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		qa.getWeekOne().click();
		wait.until(ExpectedConditions.elementToBeClickable(qa.getFeedbackField()));
		qa.getFeedbackField().click();
		wait.until(ExpectedConditions.elementToBeClickable(qa.getFeedbackField()));
		qa.getFeedbackField().click();
		qa.getFeedbackField().clear();
		qa.getFeedbackField().sendKeys("Test");
		qa.getSaveButton().click();
	}

	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}

}