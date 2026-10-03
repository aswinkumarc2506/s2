package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class l16_xpath_contains_text_starswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();		
		String str1=driver.findElement(By.xpath("//span[starts-with(text(),'Login ')]")).getText();
		System.out.println(str1);
		
	}

}
