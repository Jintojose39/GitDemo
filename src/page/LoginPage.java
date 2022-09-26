package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id="txtUsername")
	
	private WebElement username;
	
	
	@FindBy(id="txtPassword")
	
	private WebElement password;
	
	
	@FindBy(id="btnLogin")
	
	private WebElement lgbtn;
	
	
	
	
	public  LoginPage(WebDriver driver) {
		
		//here we using page factory pattern to initialize web elements which are defined in Page Objects
		PageFactory.initElements(driver, this);
		
	}	
	public void Login() {
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		lgbtn.click();
		
	}
		
	}
	




