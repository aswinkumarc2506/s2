package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saurceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");

saurcelogin al=new saurcelogin(driver);
al.enterusername("standard_user");
al.enterpassword("secret_sauce");
al.clicklogin();

	}

}
