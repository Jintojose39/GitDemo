package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
				//System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		
				//WebDriver driver =new FirefoxDriver();
		
				driver.manage().window().maximize();
			
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
				
				
				driver.findElement(By.xpath("*//*[contains(@id,'alert')]")).click();
				driver.findElement(By.xpath("(*//*[text()='Click me'])[2]")).click();
				driver.switchTo().alert().dismiss();
				
				//Thread.sleep(4000);
				
				Thread.sleep(4000);
				
				driver.close();
				
				
				

	}

}
