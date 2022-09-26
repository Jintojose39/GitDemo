package testNGTest;




import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLoginTest {
	
static WebDriver driver;
	
	
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
				
		}
	
	@Test(dataProvider = "data")
	public void invalidLogin(String username, String password) {
		
		// Test Steps
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		
		//Actual Result 
		String actMsg = driver.findElement(By.id("spanMessage")).getText();
		//Expected Result 
		String expMsg = "Invalid credentials"; 
		
		//Verification
		AssertJUnit.assertEquals(actMsg, expMsg);
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtPassword")).clear();
		
	}
	
	@DataProvider(name = "data")
	public Object[][] userdata(){
		return new Object[][] {{"Admin","ad"},
							   {"ad","admin123"},
							   {"adb","axb"}};

}
}
