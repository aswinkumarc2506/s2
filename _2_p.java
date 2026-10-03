package poup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2_p {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
driver.findElement(By.xpath("//span[text()='Login/SignUp']")).click();
Thread.sleep(18000);



driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();



	}

}
