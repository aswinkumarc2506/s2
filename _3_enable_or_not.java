package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_enable_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/javase-jdk21-doc-downloads.html");
		
		driver.findElement(By.xpath("//a[@data-type='java']")).click();
		
		WebElement ss=driver.findElement(By.xpath("//a[@class='download-file icn-download']"));
	System.out.println(ss.isEnabled());	
	
	
	}

}
