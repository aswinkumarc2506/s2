package js_selenium_java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _2_js {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.myntra.com/");

WebElement a = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));

Actions act = new Actions(driver);
act.moveToElement(a).perform();		


	
WebElement r1=	driver.findElement(By.linkText("T-Shirts"));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
			   
			   Thread.sleep(2000);
		    js.executeScript("arguments[0].click()",r1);

	}

}
