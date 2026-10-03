package js_selenium_java_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://doodles.google/");
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollTo(0,500)");
	       Thread.sleep(2000);
	       js.executeScript("window.scrollBy(0,700)");

	}

}
