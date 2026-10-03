package poup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class _3_pa_switch_to {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
 Alert e1 = driver.switchTo().alert();
 System.out.println(e1.getText());

 e1.accept();



	}

}
