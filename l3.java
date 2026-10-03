package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class l3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
Thread.sleep(4000);


/// close the login popu 
By s1= By.className("b3wTlE");
WebElement wws= driver.findElement(s1);
wws.click();



By s= By.className("nw1UBF");
WebElement ws= driver.findElement(s);
ws.sendKeys("mobile");


By sc=By.className("XFwMiH");
WebElement wsc= driver.findElement(sc);
wsc.click();
	}

}
