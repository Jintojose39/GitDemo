package com.selenium.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		//System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","F:\\geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
					
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.id("newWindowBtn")).click();
		//driver.findElement(By.xpath("//button[contains(@id,'newWindowBtn')][1]")).click();
		
		
		String parentHandle =driver.getWindowHandle();
		System.out.println();
		System.out.println("Parent window handle"+parentHandle);
		
		//driver.findElement(By.id("newWindowBtn")).click();
		/*Thread.sleep(1000);
		
		WebElement button1 =driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(button1));
		button1.click();*/
		
		Set<String>handles =driver.getWindowHandles();
		
		//Here we iterating the windows using enhanced  for loop 
		
		
		for(String handle:handles) {
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentHandle)) {
				
				System.out.println(handle);
				
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.findElement(By.id("firstName")).sendKeys("Jinto");
				driver.findElement(By.id("lastName")).sendKeys("Jose");
				
				//For Radio Button
				WebElement radio1=driver.findElement(By.id("malerb"));
				radio1.click();
				radio1.isSelected();
				System.out.println(radio1.isSelected()); 
				
				
				Thread.sleep(5000);
				driver.close();
				
			
			
			
		
		
	
		
		driver.close();
		
	
		
	}

}
	}
}
