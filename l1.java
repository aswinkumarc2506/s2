package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
By ip=By.id("_R_1h6kqsqppb6amH1_");
WebElement  c1=driver.findElement(ip);
c1.sendKeys("ipl@gmail.com");

By pw=By.id("_R_1hmkqsqppb6amH1_");
WebElement p1=driver.findElement(pw);
p1.sendKeys("ipl23");



	}

}
