package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

	WebElement e1=	driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']"));
	//driver.findElement(By.xpath("//i[@class='oxd-icon bi-chevron-left']")).click();
	Thread.sleep(2000);
if(e1.isDisplayed()) {
	System.out.println("is display ");
	
	
}else {
	System.out.println("not display");
}
	}

}
