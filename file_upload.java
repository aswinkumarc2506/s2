package windows_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
	WebElement file = driver.findElement(By.id("file-upload"));
		file.sendKeys("C:\\Users\\Aswin\\Downloads\\M16_5.pdf");
		driver.findElement(By.id("file-submit")).click();
		}

}
