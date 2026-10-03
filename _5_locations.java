package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5_locations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ss=driver.findElement(By.xpath("//div[@class='x3nfvp2 x1n2onr6 xh8yej3']"));
		
	System.out.println(ss.getSize());
	
	
	System.out.println(ss.getLocation());
	System.out.println(ss.getCssValue("font-size"));
	
	System.out.println(ss.getAttribute("class"));
	
	System.out.println(ss.getText());
	
	System.out.println(ss.getTagName());
	
	System.out.println(ss.getAttribute("class"));
	}

}
