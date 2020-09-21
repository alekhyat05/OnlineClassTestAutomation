/*
 * package com.onlineClass;
 * 
 * import java.io.File;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import org.testng.annotations.AfterTest; import
 * org.testng.annotations.BeforeClass; import org.testng.annotations.BeforeTest;
 * import org.testng.annotations.Test;
 * 
 * 
 * public class OnlineClassDemo {
 * 
 * String driverPath = "drivers/chromedriver.exe";
 * System.setProperty("webdriver.gecko.driver", driverPath);
 * System.setProperty("webdriver.chrome.driver", driverPath); WebDriver driver =
 * new ChromeDriver();
 * 
 * @BeforeClass public void initiateWebDriver() {
 * 
 * 
 * 
 * driver.get("http://localhost:3003/"); }
 * 
 * 
 * @Test public void verifyHomepageTitle() { WebElement userName=
 * driver.findElement(By.id("username")); userName.sendKeys("John"); WebElement
 * passwordField= driver.findElement(By.id("password"));
 * passwordField.sendKeys("1234"); WebElement button=
 * driver.findElement(By.id("homeSubmit")); button.click();
 * 
 * // //Teacher page
 * 
 * 
 * WebElement linkButton =driver.findElement(By.className("link-btn"));
 * linkButton.click(); }
 * 
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * //driver.get("https://www.google.com/"); //WebDriver driver; File folder;
 * 
 * // driver.findElement(By.xpath("//a[contains(.,'Create quiz')]")).click(); //
 * driver.findElement(By.linkText("Create quiz")).sendKeys(Keys.ENTER); }
 * 
 * }
 */