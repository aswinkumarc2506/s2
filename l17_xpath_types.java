package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class l17_xpath_types {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//span[starts-with(text(),'Sign in with Google')]")).click();
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
	}

}
