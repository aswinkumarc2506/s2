package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script8 {

	public static void main(String[] args) {
	
WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String str=driver.getTitle();
if(str.equals("OrangeHRM")) {
	System.out.println(" OrangeHRM webpage displayed ");
}else{
	System.out.println("the OrangeHRM webpage was not displayed");
}
	}

}
