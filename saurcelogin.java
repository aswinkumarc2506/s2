package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class saurcelogin {

	private WebElement username;
	private WebElement password;
	private WebElement login;
	
	
	
	public saurcelogin(WebDriver driver) {
		username=		driver.findElement(By.id("user-name"));
		password=		driver.findElement(By.id("password"));
		login=			driver.findElement(By.id("login-button"));
	}
	
	
	public void enterusername(String name) {
		username.sendKeys(name);
		
	}
	
	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clicklogin() {
		
	login.click();
	}
	
	//  https://edgemobileapp.microsoft.com/share/?rh=VDGyYQO7tMI&adjustId=1y5a1rux_1yprs5lb&lang=en&sid=refc
}
