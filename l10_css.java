package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l10_css {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
		
		driver.findElement(By.cssSelector("a[id='ab-registration-ingress-link']")).click();
		
		  driver.findElement(By.cssSelector("input[id='businessEmail-field-id']")).sendKeys("dummy123@gmail.com");
		  driver.findElement(By.cssSelector("button[type='submit']")).click();

	driver.close();
	}

}
