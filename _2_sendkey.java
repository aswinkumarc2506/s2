package windows_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_sendkey {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
	
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		Thread.sleep(2000);
String s1="September 2026";
String s2="11";

		driver.findElement(By.xpath("//span[text()='"+s1+"']/../..//..//..//span[text()='"+s2+"']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Done']")).click();
	}

}
