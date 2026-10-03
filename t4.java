package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
			
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("ak");
		

		WebElement r1 =driver.findElement(By.id("submit"));

		
		
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   
		   Thread.sleep(2000);
	       js.executeScript("arguments[0].click()",r1);
		
		
  
	WebElement e1=	driver.findElement(By.id("output"));
	Thread.sleep(2000);
if(e1.isDisplayed()) {
	System.out.println("is display ");
}else {
	System.out.println("not display");
}
	}

}
