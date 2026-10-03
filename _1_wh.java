package windows_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_wh {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/");
			
			driver.findElement(By.id("login_Layer")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[text()='Got it']")).click();

		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		
		
	Set<String> e = driver.getWindowHandles();
	
	for(String s:e) {
	driver.switchTo().window(s);
	}
	
	
		driver.findElement(By.id("identifierId")).sendKeys("a@gmail.com");
		

	}

}
