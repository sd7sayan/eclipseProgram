package Assinments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BookTicketInMakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.get("https://www.makemytrip.com/");
	    Actions action = new Actions(driver);
	    driver.switchTo().frame(driver.findElement(By.id("webklipper-publisher-widget-container-notification-frame")));
	    driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	   
	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
	    for(;;) {
	    	try {
	    		driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='13']")).click();
	    		break;
	    	}
	    	catch(Exception e) {
	    		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    	}
	    }
	    

	}

}
