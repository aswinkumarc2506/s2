package poup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_st {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
Alert e1 = driver.switchTo().alert();

e1.accept();

	}

}
