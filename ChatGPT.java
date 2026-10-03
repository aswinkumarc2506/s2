package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatGPT {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://chatgpt.com/");
		
		String s1= "C:\\Users\\Aswin\\Downloads\\sampleFile.jpeg";// file path 
		//driver.findElement(By.id("composer-plus-btn")).click(); no needed to click  the + button directly we can click to upload the image 
		driver.findElement(By.id("upload-photos")).sendKeys(s1);// locator  and s1 to send no click
		
driver.findElement(By.id("prompt-textarea")).sendKeys("explain this ");// content box

driver.findElement(By.id("composer-submit-button")).click();// send button 

}}

