package sendkeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus");
		driver.findElement(By.id("nav-search-submit-button")).click();

String s1= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		
System.out.println(s1);
	}

}
