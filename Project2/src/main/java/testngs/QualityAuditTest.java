package testngs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;
import pages.NavBar;
import pages.QualityAudit;
import util.PropertyParser;

public class QualityAuditTest {

	public static WebDriver driver;
	public static Login login;
	public static NavBar nav;
	public static QualityAudit qa;

	@BeforeClass
	public void setupDriverAndPage() {
		String userDriver = PropertyParser.getProp("ec2driver");
		File file = new File(userDriver);

		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		login = new Login(driver);
		nav = new NavBar(driver);
		qa = new QualityAudit(driver);
		driver.get("https://dev-caliber.revature.tech/");
		login.getUsernameField().sendKeys("calibot@revature.com");
		login.getPasswordField().sendKeys("*6Ak4-&kXnNTfTh6");
		login.getLoginButton().click();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/home"));
		nav.getQualityAuditButton().click();
		wait.until(ExpectedConditions.urlToBe("https://dev-caliber.revature.tech/caliber/#/vp/audit"));
	}

	@Test
	public void individualFeedback() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		for (int i = 1; i <= 6; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getTraineeFace(i)));
			qa.getTraineeFace(i).click();
		}
	}

	@Test
	public void notes() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		for (int i = 1; i <= 6; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getNotesTextField(i)));
			qa.getNotesTextField(i).click();
			wait.until(ExpectedConditions.elementToBeClickable(qa.getNotesTextField(i)));
			qa.getNotesTextField(i).click();
			qa.getNotesTextField(i).clear();
			qa.getNotesTextField(i).sendKeys("Test");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

	@Test
	public void overallFeedbackFaces() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		for (int i = 1; i <= 3; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(qa.getBatchFace(i)));
			qa.getBatchFace(i).click();
		}
	}

	@Test
	public void overallFeedbackTextField() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(qa.getFeedbackField()));
		qa.getFeedbackField().click();
		wait.until(ExpectedConditions.elementToBeClickable(qa.getFeedbackField()));
		qa.getFeedbackField().click();
		qa.getFeedbackField().clear();
		qa.getFeedbackField().sendKeys("Test");
	}

	@Test
	public void save() {
		qa.getSaveButton().click();
	}

	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

}
