package basic;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
public class file_1 {

	    public static void main(String[] args) throws InterruptedException  {


	    	WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.get("https://demoqa.com/upload-download");

	        // File path from your local system
	        String filePath = "C:\\Users\\Aswin\\Downloads\\sample.pdf";

	        // Upload the file
	        driver.findElement(By.id("uploadFile")).sendKeys(filePath);

	        // Verify uploaded file name
	        String uploadedFile = driver.findElement(By.id("uploadedFilePath")).getText();
	        System.out.println(uploadedFile);
}}