package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
	
		By s1= By.id("twotabsearchtextbox");
		WebElement ws=driver.findElement(s1);
		ws.sendKeys("iphone");
		
		
		
		By sc=By.id("nav-search-submit-button");
	WebElement wsc=driver.findElement(sc);
	wsc.click();
	
	}

}
