package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _16_drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://only-testing-blog.blogspot.com/2014/09/drag-and-drop.html");
Actions a1= new Actions(driver);
WebElement d1 = driver.findElement(By.id("dragdiv"));
WebElement d2 = driver.findElement(By.id("dropdiv"));

Thread.sleep(6000);
a1.dragAndDrop(d1, d2).perform();
	}

}
