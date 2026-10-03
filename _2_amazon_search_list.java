package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_amazon_search_list {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("PUMA");
	
	Thread.sleep(2000);

	
	
		List<WebElement> all=driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		
		System.out.println("Total Links: " + all.size());

for(int i=0;i<=all.size();i++) {
	
	WebElement rv= all.get(i);
	System.out.println(rv.getText());
}

	
	}

}
