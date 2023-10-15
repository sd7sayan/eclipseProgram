package Assinments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSendKeysByKeyboardInput {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("sayan1234",Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Keys.CONTROL+"v");

	}

}
