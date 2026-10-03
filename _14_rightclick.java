package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _14_rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
//1
		WebElement w1=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions a1= new Actions(driver);
		Thread.sleep(2000);

		a1.doubleClick(w1).perform();
		
///2
		
		WebElement w2=driver.findElement(By.id("rightClickBtn"));
		Actions a2= new Actions(driver);
		a2.contextClick(w2).perform();
		//3
		
		
		WebElement w3=driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions a3= new Actions(driver);
		
		Thread.sleep(2000);
		a3.click(w3).perform();
	}

}
