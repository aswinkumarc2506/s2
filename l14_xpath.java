package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l14_xpath {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
driver.findElement(By.xpath("//a[@class='a-link-normal']")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("a@gmail.com");
driver.findElement(By.xpath("//button[@type='submit']")).click();
//use this  or this by class xplath //button[@class='b-button b-container b-mv-base b-primary']


	}

}
