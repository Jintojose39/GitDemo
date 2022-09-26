package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jinto");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dfds");
		 driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Forgotten account?']")).click();
		
		
		 
		
		
	}

}
