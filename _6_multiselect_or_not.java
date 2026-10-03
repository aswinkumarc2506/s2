package methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _6_multiselect_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
	driver.findElement(By.partialLinkText("Books")).click();
WebElement sortBy=	driver.findElement(By.id("products-orderby"));
	
Select s = new Select(sortBy);

//  System.out.println(s.isMultiple());
if (s.isMultiple()) {
    System.out.println("Multiselectable");
} else {
    	System.out.println("Not Multiselectable");
}
	}

}
