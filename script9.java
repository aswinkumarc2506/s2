package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com/");

driver.manage().window().minimize();
Thread.sleep(200);
driver.manage().window().fullscreen();
driver.get("https://www.facebook.com/");
Dimension size= driver.manage().window().getSize();
System.out.println(size);
System.out.println(size.getHeight());
System.out.println(size.getWidth());


System.out.println("==========================");
driver.manage().window().maximize();
System.out.println(driver.manage().window().getSize());
System.out.println(driver.manage().window().getSize().getHeight());
System.out.println(driver.manage().window().getSize().getWidth());


System.out.println("=====");
driver.manage().window().setSize(new Dimension(300,300));


Point position=driver.manage().window().getPosition();
System.out.println(position);
System.out.println("x"+ position.getX());
System.out.println("y"+position.getY());
   //-----------------
driver.manage().window().setPosition(new Point(300,300));


	}

}
