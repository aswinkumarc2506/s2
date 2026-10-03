package sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(0);
	String s1=	driver.findElement(By.xpath("//frame[@name='frame-left']")).getText();
	System.out.println(s1);
	
	driver.switchTo().frame(1);
String s2=	driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
System.out.println(s2);
driver.switchTo().parentFrame();
String s3=	driver.findElement(By.xpath("//frame[@name='frame-right']")).getAttribute("name");
System.out.println(s3);
driver.switchTo().parentFrame();
String s4=	driver.findElement(By.xpath("//frame[@name='frame-bottom']")).getAttribute("name");
System.out.println(s4);
		}

}
