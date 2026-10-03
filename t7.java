package sendkeys;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();

		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ak");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert a2 = driver.switchTo().alert();
	a2.accept();
	a2.accept();
	}

}
