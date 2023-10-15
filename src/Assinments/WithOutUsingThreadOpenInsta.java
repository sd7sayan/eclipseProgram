package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutUsingThreadOpenInsta {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		for(;;) {
			try {
			if(driver.findElement(By.name("username")).isDisplayed()== true) {
				driver.findElement(By.name("username")).sendKeys("7003756902");
				driver.findElement(By.name("password")).sendKeys("123456789045");
				break;
			}}
			catch(Exception e) {
				Thread.sleep(100);
			}
		}

	}

}
