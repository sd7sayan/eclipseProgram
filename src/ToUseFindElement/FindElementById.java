package ToUseFindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginButton")).click();
		
	}

}
