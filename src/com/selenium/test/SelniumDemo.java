package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		
		driver.findElement(By.cssSelector("#btnLogin")).click() ;
		//driver.close();
		
		
		
	}

}
