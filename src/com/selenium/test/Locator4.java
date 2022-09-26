package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator4 {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\JINTO\\Downloads\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
		//driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		driver.findElement(By.xpath("//button[contains(@class,'logout')]")).click();
		
		
		
		driver.close();
		
		
	
		
		
		
	}

}
