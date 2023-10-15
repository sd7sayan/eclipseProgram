package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDounbleClickAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/product.php?Product=selenium-tarining");
		
		WebElement add = driver.findElement(By.id("add"));
		
		Actions action= new Actions(driver);
		Thread.sleep(1000);
		action.doubleClick(add).perform();
		Thread.sleep(1000);
		action.doubleClick(add).perform();
		Thread.sleep(1000);
		action.doubleClick(add).perform();
		//action.doubleClick(driver.findElement(By.id("add"))).perform();

	}

}
