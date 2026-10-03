package locators_webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpat_tm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		driver.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//String sdriver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='col col-5-12 mao5dl']/div[@class='oFEPlD']/div[@class='QiMO5r']/div[@class='hZ3P6w DeU9vF']")).getText();
	
		//String s=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/../..//div[@class='hZ3P6w DeU9vF']")).getText();
	
		//String s=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/parent::div[@class='col col-7-12']/parent::div[@class='ZFwe0M row']/child::div[@class='col col-5-12 mao5dl']/child::div[@class='oFEPlD']/child::div[@class=\"QiMO5r\"]/child::div[@class='hZ3P6w DeU9vF']")).getText();
	
		//String s=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']/ancestor::div[@class='ZFwe0M row']/descendant::div[@class='hZ3P6w DeU9vF']")).getText();
	
		//String s=driver.findElement(By.xpath("")).getText();
	
		//String s=driver.findElement(By.xpath("")).getText();

	
	
	}

}
