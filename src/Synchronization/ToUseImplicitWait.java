package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15000));
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("7003756902");
		driver.findElement(By.name("password")).sendKeys("123456789045");

	}

}
