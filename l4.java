package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
//sleep(4000);

By i= By.className("x1i10hfl");
WebElement wi= driver.findElement(i);
wi.sendKeys("ipl@gmail.com");

By p= By.name("pass");
WebElement wp= driver.findElement(p);
wp.sendKeys("ipl123");  
	}

}
