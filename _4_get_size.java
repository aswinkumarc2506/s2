package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_get_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement ss=driver.findElement(By.id("login-button"));
		Dimension s1=	ss.getSize();
	
	
	System.out.println(s1.getHeight());	

	System.out.println(s1.getWidth());	

	}

}
