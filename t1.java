package sendkeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class t1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphoe");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> all= driver.findElements(By.xpath("//input[@name='submit.addToCart']"));
	     for(int i=0;i<all.size();i++){
	            WebElement a =all.get(i);
	            a.click();
	        }

	}

}
