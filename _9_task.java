package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _9_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.linkText("Books")).click();

WebElement display1 = driver.findElement(By.id("products-orderby"));

Select s1 = new Select(display1);
 s1.selectByVisibleText("Price: Low to High");
 
 WebElement display2 = driver.findElement(By.id("products-pagesize"));

Select s2 = new Select(display2);
 s2.selectByIndex(2);
 

 WebElement display3 = driver.findElement(By.id("products-viewmode"));

Select s3 = new Select(display3);
 s3.selectByIndex(1);


	}

}
