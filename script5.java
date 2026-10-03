package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver= new  ChromeDriver();
		driver.get("https://www.google.com/");
		String s1=driver.getTitle();
		String s2=driver.getCurrentUrl();
		System.out.println(s1);
		System.out.println(s2);
		
		}

}
