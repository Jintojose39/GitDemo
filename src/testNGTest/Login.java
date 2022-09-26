package testNGTest;


import org.testng.annotations.Test;


import org.testng.annotations.Test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	
	static WebDriver driver;
	

	
	@BeforeTest
	@Parameters("browser")
	
	public void setUp(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
			
			driver =new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");	
		
			
		}if(browser.equalsIgnoreCase("edge")) {
			

			System.setProperty("webdriver.edge","msedgedriver.exe");
			
			
			driver =new EdgeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	}
		
		@Test(priority =1 )
		
		@Parameters({"username","password"})
		
	
		public void validLogin(String username,String password) {
			
			driver.findElement(By.id("username")).sendKeys("username");
			
			driver.findElement(By.id("password")).sendKeys("password");
			
			driver.findElement(By.id("btLogin")).click();
			
			boolean lg =driver.findElement(By.cssSelector("#dashboard-quick-launch-panel-menu_holder > table > tbody > tr > td:nth-child(5) > div > a > img")).isDisplayed();
			
			Assert.assertTrue(lg);
			
		
			//LogOut Script
		
			driver.findElement(By.id("welcome")).click();
			
			driver.findElement(By.cssSelector("#welcome-menu > ul > li:nth-child(3) > a")).click();
			
		}
			
		
		@Test(dataProvider="data",priority=2)
		
		public void invalidLogin(String username, String password) {
			
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			
			driver.findElement(By.id("btnLogin")).click();
			
			driver.close();
			//Actual message
			
			String actMsg =driver.findElement(By.id("spanMessage")).getText();
			
			String expMsg ="Invalid credentials";
			
			Assert.assertEquals(actMsg, expMsg);
			
			
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtPassword")).clear();

			
		}
		
		
		
		
		@AfterTest
		
		public void tearDown() {
			
			driver.quit();
			
		}
		
		
		@DataProvider(name="data")
		
		public Object[][] userdata(){
			
			return new Object[][]
					{{"Admin","admin"},{"ad","admin123"},{"adb","adg"}};
			
		}
		
	
			
		
	
			
		
			
		}
		
		
		
	

