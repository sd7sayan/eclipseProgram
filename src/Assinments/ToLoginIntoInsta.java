package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginIntoInsta {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("7003756902");
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("1234456678");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}
