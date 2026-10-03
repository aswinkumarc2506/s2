package methodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _7_no_of_books {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");

driver.findElement(By.linkText("Books")).click();

WebElement display = driver.findElement(By.id("products-pagesize"));

Select s = new Select(display);
List <WebElement> all=s.getOptions();

for(int i=0;i<all.size();i++) {
	
	WebElement rv= all.get(i);

}
System.out.println("total options"+all.size());

	}

}
