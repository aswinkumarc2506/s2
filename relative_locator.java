package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//WebElement email=driver.findElement(By.id("Email"));
		WebElement password =driver.findElement(By.id("Password"));
	
		 driver.findElement(RelativeLocator.with(By.id("Email")).above(password)).sendKeys("arun12w@gmail.com");
		
		// driver.findElement(RelativeLocator.with(By.id("Password")).below(email)).sendKeys("1234");
	}

}
