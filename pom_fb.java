package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom_fb {

	private WebElement username;
	private WebElement password;
	private WebElement clicklogin;
	
	
	public pom_fb(WebDriver driver) {
		username=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		password=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		clicklogin=driver.findElement(By.xpath("//span[text()='Log in']"));
		
	}
	
	public void un(String name) {
		username.sendKeys(name);
	}public void pwd(String password_) {
		
		password.sendKeys(password_);
	}
	
	public void click_log() {
		clicklogin.click();
	}
}
