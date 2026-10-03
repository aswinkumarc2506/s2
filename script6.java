package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script6 {

	public static void main(String[] args) {
			WebDriver driver= new  ChromeDriver();
			driver.get("https://www.amazon.in/");
			String s1=driver.getTitle();
			String s2=driver.getCurrentUrl();
			System.out.println(s1);
			System.out.println(s2);
			
			}

	}
