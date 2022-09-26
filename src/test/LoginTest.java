package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginTest {

	static WebDriver driver;
	
	
	
	
	@BeforeTest()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	 
	@Test 
	public void loginTest() {
		LoginPage lg =new LoginPage(driver);
		
		lg.Login();
		
		
		
		boolean logo =driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(5) > div > a > img")).isDisplayed();
		
		Assert.assertTrue(logo);
	}
	


	
	@AfterTest()
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	

}

