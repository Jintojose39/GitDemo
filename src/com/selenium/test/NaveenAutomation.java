package com.selenium.test;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("http://www.freecrm.com");
		
		System.out.println("Title:"+""+driver.getTitle());
		
		System.out.println("URL:"+""+driver.getCurrentUrl());
		
		
		
		
		//driver.navigate().to("https://ui.freecrm.com/");
		
		
		try {
			driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
			driver.findElement(By.name("email")).sendKeys("jinto@123gmail.com");
			
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("pass123");
			
			
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			
			
			String exp ="Something went wrong...";
			
			
			String act =driver.findElement(By.xpath("//div[@class='header']")).getText();
			
			if(exp.equals(act)) {
				System.out.println("Test is passed");
				
				
				
			}else {
				
				System.out.println("Test is failed");
			}
			
		}catch(NoSuchElementException e) {
			
			System.out.println("Handled NoSuchElementException");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		Thread.sleep(3000);
		driver.close();
		
	
	}

}
