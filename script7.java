package basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
String str=driver.getTitle();
if(str.equals("Facebook")) {
	System.out.println(" facebook webpage displayed ");
}else{
	System.out.println("the facebook webpage was not displayed");
}
	}

}
