package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWorkRunner {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
						
				driver.get("https://netbanking.hdfcbank.com/netbanking/");
				
				//Using name
				//driver.switchTo().frame("login_page");
				
				//driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("dfd");
				
				
				driver.switchTo().frame(driver.findElement(By.xpath("//frame[contains(@name,'login')]")));
				driver.findElement(By.name("fldLoginUserId")).sendKeys("dsfdg");
				
				
				
				
				
				
				
				
			

		}

	}
	

