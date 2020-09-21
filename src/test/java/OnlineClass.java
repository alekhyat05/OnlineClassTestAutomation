

import java.awt.List;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlineClass {

	public String baseUrl = "http://localhost:3000/";
	String driverPath = "drivers/chromedriver.exe";
	public WebDriver driver;
	File folder;

	@BeforeClass
	public void initiateWebDriver() {


		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions options = new ChromeOptions();

		driver = new ChromeDriver(options);
	}

	/*
	 * @Test(enabled = false) public void verifyHomepageTitle() {
	 * 
	 * System.out.println("launching firefox browser");
	 * System.setProperty("webdriver.gecko.driver", driverPath); driver = new
	 * ChromeDriver(); driver.get(baseUrl); String expectedTitle =
	 * "Welcome: Mercury Tours"; String actualTitle = driver.getTitle();
	 * Assert.assertEquals(actualTitle, expectedTitle); driver.close(); }
	 */
	@Test(priority = 0)
	public void verifyGitLabHomePage() {
		System.out.println("navigating to gitlab page");
		// Launch Website
		driver.navigate().to("http://localhost:3000/");
		// Maximize the browser
		//driver.manage().window().maximize();

	}
	
	
	@Test(priority = 1, dependsOnMethods = { "verifyGitLabHomePage" })
	public void onlineClassLoginPage() {
		//driver.findElement(By.linkText("Sign in")).click();

		 WebElement userName=driver.findElement(By.id("username"));
		 userName.sendKeys("John");
		// Get the web element corresponding to password
		 WebElement passwordField= driver.findElement(By.id("password"));
		 passwordField.sendKeys("1234");
		 WebElement button=driver.findElement(By.id("homeSubmit"));
		 button.click();
	}
	
	@Test(priority = 2, dependsOnMethods = { "onlineClassLoginPage" })
	public void onlineClassTeacherPage() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create quiz")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	//Create Quiz page
	@Test(priority = 1, dependsOnMethods = { "onlineClassTeacherPage" })
	public void createQuizPage() {
		
		 driver.findElement(By.id("question")).sendKeys("finding Element");
		 driver.findElement(By.id("choiceOne")).sendKeys("id");
		 driver.findElement(By.id("choiceTwo")).sendKeys("class name");
		 driver.findElement(By.id("choiceThree")).sendKeys("selector");
		 driver.findElement(By.id("choiceFour")).sendKeys("new");
		 driver.findElement(By.id("answerNumber")).sendKeys("1");
		 WebElement button=driver.findElement(By.id("finishQuizCreation"));
		 button.click();
	}
	
	@Test(priority = 1, dependsOnMethods = { "createQuizPage" })
	public void assignToStudentPage() {
		// Find the checkbox or radio button element by its name.
		WebElement chckbx=driver.findElement(By.id("123"));
		chckbx.click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.findElement(By.id("handleQuiz")).click();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//driver.navigate().to("http://localhost:3000/teacher");
		driver.navigate().to("http://localhost:3000/");
	}
	
	
	@Test(priority = 1, dependsOnMethods = { "assignToStudentPage" })
	public void nextPage() {
		// Find the checkbox or radio button element by its name.
		
		driver.navigate().to("http://localhost:3000/");
		 WebElement userName=driver.findElement(By.id("username"));
		 userName.sendKeys("Tom");
		// Get the web element corresponding to password
		 WebElement passwordField= driver.findElement(By.id("password"));
		 passwordField.sendKeys("1234");
		 WebElement button=driver.findElement(By.id("homeSubmit"));
		 button.click();
		
	}
		
	@Test(priority = 1, dependsOnMethods = { "nextPage" })
	public void invokeQuizPage() {
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.findElement(By.id("5f668ea08ae7c542d401360a")).click();
		 	
	}
	
}
