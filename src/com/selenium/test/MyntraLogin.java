package com.selenium.test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		
		try {
			
			
			
			driver.get("https://www.myntra.com/login");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("547544788");
			driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Get help']")).click();
			driver.findElement(By.xpath("//li[1]//a[1]")).click();
			
			
				
			
		}catch(NoSuchElementException e) {
			
			System.out.println();
			
			
		}
		
		
		
		
		
		Thread.sleep(2000);
		
		driver.close();
	

	}

}
