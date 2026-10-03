package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l15_xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//label[@class='forcheckbox' and text()='Male']")).click();

		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("arun");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@data-val-email='Wrong email']")).sendKeys("a23iuhhjk@gmail.com");
		driver.findElement(By.xpath("//input[@data-val-length-max='999']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	
	}

}
