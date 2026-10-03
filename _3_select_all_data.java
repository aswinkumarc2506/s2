package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3_select_all_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Aswin/OneDrive/Desktop/alll1.html");
		List<WebElement> all = driver.findElements(By.xpath("//tbody"));

		for (int i = 0; i < all.size(); i++) {
			WebElement rv = all.get(i);
			System.out.println(rv.getText());
		}
		
	driver.close();
	}
}
