package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new  ChromeDriver();
driver.get("https://www.facebook.com/");
WebDriver driver1= new  ChromeDriver();
driver1.get("https://www.google.com/");
driver1.close();
driver.close();

	}

}
