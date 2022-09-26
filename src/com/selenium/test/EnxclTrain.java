package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnxclTrain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");
		
		driver.findElement(By.xpath("*//*[@type='password']")).sendKeys("rahulshettyacademy");
		
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}
