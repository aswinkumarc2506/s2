package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
driver.findElement(By.className("a-link-normal")).click();
     driver.findElement(By.name("businessEmail")).sendKeys("a@gmail.com");
     driver.findElement(By.className("b-button")).click();
     
     
     
     driver.close();
	}

}
