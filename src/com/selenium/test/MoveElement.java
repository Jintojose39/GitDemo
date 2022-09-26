package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Account')]"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(element).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Sign')])[2]")).click();
		//driver.findElement(By.xpath("(//*[contains(text(),'Sign')])[2]")).click();
		driver.close();
	}

}
