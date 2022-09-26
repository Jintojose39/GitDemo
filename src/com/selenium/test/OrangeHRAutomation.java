package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRAutomation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		/*String exp1 ="Csrf token validation failed";
		
		String act1=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		if(exp1.equals(act1)) {
			System.out.println("Message Diplayed Correctly");
			
			
		}
		
		else {
			System.out.println("Sorry wrong messsage is displayed");
		}*/
		
		
		String exp2="Admin";
		
		String act2 =driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).getText();
		
		

		if(exp2.equals(act2)) {
			System.out.println("Test is Passed");
			
			
		}
		
		else {
			System.out.println("Test is Failed");
		}
		
		
		//driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Jinto");
		driver.findElement(By.cssSelector("#searchSystemUser_userType > option:nth-child(2)")).click();
		
		
		
		
		
		//String exp="Dashboard";
		
		//String act=driver.findElement(By.cssSelector("#menu_dashboard_index > b")).getText();
		
		//if(exp.equals(act)) {
			//System.out.println("Test is Passed");
		//}
		
		//else {
			//System.out.println("Test is Failed");
		//}
		
		
	
	}

}
