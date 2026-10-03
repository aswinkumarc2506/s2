package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4_sum_total_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
		
	driver.get("file:///C:/Users/Aswin/OneDrive/Desktop/alll1.html");
	List<WebElement> all = driver.findElements(By.xpath("//td[3]"));

int sum = 0;

for (int i = 0; i < all.size()-1; i++) {

sum += Integer.parseInt(all.get(i).getText());
}

System.out.println("Sum = " + sum);

WebElement act= driver.findElement(By.xpath("(//td[3])[6]"));


int total = Integer.parseInt(
		driver.findElement(By.xpath("(//td[3])[6]")).getText());

if (sum == total) {
	System.out.println("PASS");
} else {
	System.out.println("FAIL");
}

}}