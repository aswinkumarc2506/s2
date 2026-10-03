package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		facebooklogin_pom fb= new facebooklogin_pom(driver);
		
		fb.usernamef("ak");
		fb.passowrdf("123");
		fb.clickf();
	}

}
