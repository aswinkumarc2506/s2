package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		pom_fb fb=new pom_fb(driver);
		fb.un("aswin@gmail.com");
		fb.pwd("123456");
		fb.click_log();
	}

}
