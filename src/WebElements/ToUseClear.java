package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("sayan");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		Thread.sleep(2000);
		password.sendKeys("123455676");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
		

	}

}
