package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _17_keys_action_sendkeys {
/// NOT SOLVE 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Actions a= new Actions(driver);
		WebElement name = driver.findElement(By.id("_R_1cl2p4jikacppb6amH1_"));
		a.click(name).keyUp(Keys.SHIFT).sendKeys("A");	
	}

}
