package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l20_xpath_addtocart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);

driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("REDMI 9i Sport (Coral Green, 64 GB)");

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[text()='REDMI 9i Sport (Coral Green, 64 GB)']/../../..//label[@class='BMOCJ3']")).click();
	
	}

}
