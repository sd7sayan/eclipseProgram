package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		//by using frame(int index)
		//driver.switchTo().frame(0);
		
		//by using fame(String id or name)
		//driver.switchTo().frame("send-sms-iframe");
		
		//by using fame(WebElement)
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		
		
		driver.findElement(By.id("regEmail")).sendKeys("7003756902");
		
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("About Us")).click();
		

	}

}
