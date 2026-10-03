package screenshort_1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class _3_s {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
WebElement ts = driver.findElement(By.xpath("//div[@aria-label='Log in']"));
		File src= ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/loginbutton2.png");
		FileHandler.copy(src, dest);
	}

}
