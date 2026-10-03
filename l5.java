  package locators_webdriver_methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		By i= By.className("input_error");
		WebElement wi= driver.findElement(i);
		wi.sendKeys("standard_user");

		By p= By.name("password");
		WebElement wp= driver.findElement(p);
		wp.sendKeys("secret_sauce");  
	

		By l= By.className("submit-button");
		WebElement wl= driver.findElement(l);
		wl.click();
	
		
	}

}