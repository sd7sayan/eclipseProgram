package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("sayan@123");
		
		WebElement eyeIcon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.clickAndHold(eyeIcon).perform();
		Thread.sleep(1000);
		action.release(eyeIcon).perform();
		

	}

}
