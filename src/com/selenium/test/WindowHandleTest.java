package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
					
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//driver.findElement(By.id("newWindowBtn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		
		//driver.findElement(By.id("newWindowBtn")).click();
		
		driver.close();

	}

}
