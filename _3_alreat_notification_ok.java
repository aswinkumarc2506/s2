package windows_handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class _3_alreat_notification_ok {
//?????????????????/
	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		ChromeOptions opt1 = new ChromeOptions();
		opt1.addArguments("start-maximized");
		opt1.addArguments("--disable-notifications");
		
	}

}
