package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToRegisterIntoDemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Sayan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Das");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sayan78.sd@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("sd@12345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("sd@12345");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		Thread.sleep(3000);
		String confirmation_msg = driver.findElement(By.className("result")).getText();
		System.out.println(confirmation_msg);
	}

}
