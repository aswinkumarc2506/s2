package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.name("Gender")).click();
driver.findElement(By.name("FirstName")).sendKeys("aswin");
driver.findElement(By.name("LastName")).sendKeys("kumar");
driver.findElement(By.name("Email")).sendKeys("awin34auytr@gmail.com");
driver.findElement(By.id("Password")).sendKeys("123456");
driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
driver.findElement(By.id("register-button")).click();
driver.close();
	}

}
