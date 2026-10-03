package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class data_read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String URL=prop.getProperty("url");
		String UN =prop.getProperty("un");
		String PWD =prop.getProperty("pwd");
				
		WebDriver driver= new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PWD);
		driver.findElement(By.id("login-button")).click();
	}

}
