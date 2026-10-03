package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.get("https://www.facebook.com/");
driver.navigate().back();
String str =driver.getTitle();
if(str.equals("Google")){
	System.out.println("google webpage is displayed");
}else {
	System.out.println("google webpage is not displayed");
}

driver.manage().window().setSize(new Dimension(500,400));
driver.manage().window().setPosition(new Point (250,400));
driver.manage().window().maximize();
driver.navigate().forward();
String s2=driver.getTitle();

if(s2.equals("Facebook")) {
	System.out.println("facrbook webpage is displayed");
}else {
	System.out.println("facebook webpage is not displayed");
}
Thread.sleep(200);
driver.navigate().refresh();
driver.close();

	}

}
