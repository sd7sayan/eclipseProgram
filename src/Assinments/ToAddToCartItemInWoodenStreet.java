package Assinments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAddToCartItemInWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		//item no.1
		WebElement living = driver.findElement(By.linkText("Living"));
		Actions action = new Actions(driver);
		action.moveToElement(living).perform();
		action.moveToElement(driver.findElement(By.linkText("TV Units"))).perform();
		action.click().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hailey Engineered Wood Wall-Mounted Tv Unit with Shelf & Drawers (Exotic Teak Finish)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-cart-buy-now")).click();
		Thread.sleep(1000);
		
		//item no.2
		WebElement storage = driver.findElement(By.linkText("Storage"));
		action.moveToElement(storage).perform();
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.partialLinkText("Wardrobes"))).perform();
		Thread.sleep(1000);
		action.click().perform();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[1]")).click();
		 Thread.sleep(1000);
		
		 //item no.2
		 WebElement sofa = driver.findElement(By.linkText("Sofas"));
		 action.moveToElement(sofa).perform();
		 Thread.sleep(1000);
		 action.moveToElement(driver.findElement(By.linkText("3+1+1 Sofa Sets"))).perform();
		 Thread.sleep(1000);
		 action.click().perform();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[1]")).click();
		 Thread.sleep(1000);
		 
		 String cartValue = driver.findElement(By.id("cart-total")).getText();
		 System.out.println(cartValue);
		 
		 WebElement cart = driver.findElement(By.xpath("//a[@title='Cart']"));
		 action.moveToElement(cart).perform();
		 Thread.sleep(1000);
		 action.click().perform();
		 
		 

	}

}
