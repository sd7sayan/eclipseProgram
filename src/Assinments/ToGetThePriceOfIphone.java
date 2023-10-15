package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetThePriceOfIphone {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone 14");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../../../..//div[text()='₹64,999']")).getText();
		
	}

}
