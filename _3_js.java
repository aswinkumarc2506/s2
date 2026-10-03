package js_selenium_java_script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_js {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
WebElement r1 = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
WebElement r2 = driver.findElement(By.xpath("//input[@type='password']"));


		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   
	       js.executeScript("arguments[0].value='aa@gmail.com'",r1);
	       js.executeScript("arguments[0].value='aa123456'",r2);

	}

}
