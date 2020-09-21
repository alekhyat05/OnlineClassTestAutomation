import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateQuiz {

	
	
	String driverPath = "drivers/chromedriver.exe";
	public WebDriver driver;
	File folder;

	
	
	@Test(priority = 2, dependsOnMethods = { "onlineClassLoginPage" })
	public void onlineClassTeacherPage() {
		System.out.println("inside second page::::");
		
	}
}
