package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> all=driver.findElements(By.tagName("a"));
for(int i=0;i<all.size();i++) {
	
	WebElement rv= all.get(i);
	System.out.println(rv.getText());
}
System.out.println("Total Links: " + all.size());
	
	}

}
