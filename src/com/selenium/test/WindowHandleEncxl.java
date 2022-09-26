package com.selenium.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandleEncxl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		//driver.findElement(By.xpath("//*[text()='Register']")).click();
		//driver.findElement(By.className("mTxt")).click();
		
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		String PW = driver.getWindowHandle();
		System.out.println("The id of parent window: "+ PW);
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String win : windows) {
			
			if(!PW.equalsIgnoreCase(win)) {
				
				System.out.println("The id of child window: "+ win);
				driver.switchTo().window(win);
				/* driver.findElement(By.id("name")).sendKeys("Child Window");
				driver.findElement(By.id("lastName")).sendKeys("Jose");*/
				
				
			}
		}
			
	
		
		driver.switchTo().window(PW);
		driver.findElement(By.cssSelector(
				"#root > div.gnb-container > div.qsbWrapper > div > div > div.keywordSugg > div > div > div > input"))
				.sendKeys("Parent Window");
		Thread.sleep(2000);
		driver.quit();

	}
	}


