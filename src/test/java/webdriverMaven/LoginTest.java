package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dinak\\OneDrive\\Desktop\\Executables\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void doLogin() {
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("dinakar2358@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		//driver.findElement(By.className("VfPpkd-RLmnJb"));
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("samreddyvimala");
		
	}
	
	@Test(priority=1)
	
	public void browse() {
		driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
}
