package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginIntoDemoWebShop {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sayan7.sd@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Sd@13011997");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		
	}

}
