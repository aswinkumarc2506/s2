package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebooklogin_pom {
private WebElement username;
private WebElement password;
private WebElement clicklogin;



public   facebooklogin_pom(WebDriver driver) {
	username=driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
	password=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
	clicklogin=driver.findElement(By.xpath("//span[text()='Log in']"));
	
}
public void  usernamef(String name) {
	username.sendKeys(name);
}
public void passowrdf(String pwd) {
	password.sendKeys(pwd);
}
public void clickf() {
	
	clicklogin.click();
}
}
