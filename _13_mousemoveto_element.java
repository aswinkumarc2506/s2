package methodes;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_mousemoveto_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");

WebElement computers = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));

Actions act = new Actions(driver);
act.moveToElement(computers).perform();		
driver.findElement(By.linkText("Notebooks")).click();

	}

}
