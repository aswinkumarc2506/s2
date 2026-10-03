package poup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_p {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");

driver.findElement(By.id("login_Layer")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("//button[text()='Got it']")).click();

driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();



	}

}
