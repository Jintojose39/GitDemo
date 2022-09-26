import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Locator2 {
	public static void main(String[] args) {
		/*
		 * System.setProperty("webdriver.chrome.driver","chromedriver.exe"); WebDriver
		 * driver =new ChromeDriver();
		 */

		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();

		try {
			String exp = "You are successfully logged in.";

			String act = driver.findElement(By.xpath("//p[normalize-space()='']")).getText();

			if (exp.equals(act)) {

				System.out.println(driver.findElement(By.xpath("//p[normalize-space()='']")).getText());
				System.out.println("Test is passed");

			} else {

				System.out.println("Test is  Failed");
				
				System.out.println("Try again later");
				
				
				

			}

		} catch (NoSuchElementException e) {

			System.out.println("No Such Element Exception");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			System.out.println("This is for Locator2 Changess");
			
			
			
		}

		driver.close();

	}

}
