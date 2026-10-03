package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l12_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.cssSelector("input#newsletter-email")).sendKeys("a@gmail.com");
driver.findElement(By.cssSelector("input[type='button']")).click();

	}

}
