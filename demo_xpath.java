package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
Thread.sleep(2000);
driver.get("https://www.amazon.com/");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("iphone",Keys.ENTER);;
//driver.findElement(By.xpath("(//div[@class='puisg-col-inner']/..//div[@class='a-section a-spacing-small a-spacing-top-small'])[7]")).click();
String p = driver.findElement(By.xpath("//div[@class='puisg-col-inner']/.//span[@class='a-offscreen' and contains(text(),'25')]")).getText();
	System.out.println(p);
	}

}
