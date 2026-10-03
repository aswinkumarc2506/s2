package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("aswin");
	
WebElement cli = driver.findElement(By.xpath("//button[@id='submit']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()", cli);

WebElement name = driver.findElement(By.xpath("//p[text()='aswin']"));
if(name.isDisplayed()) {
	System.out.println("is display");
}else {
	System.out.println("not display ");
}
	}

}
