package handling_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chatgpt_0101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		
	List<WebElement> all = driver.findElements(By.tagName("a"));

	for(int i=0;i<all.size();i++) {
		WebElement	a1=all.get(i);
		System.out.println(a1.getText());
	}
	System.out.println(all.size());
	}

}
