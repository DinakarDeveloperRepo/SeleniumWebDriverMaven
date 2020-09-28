package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
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
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
}
