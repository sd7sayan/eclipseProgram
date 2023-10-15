package Assinments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Accepted Elements")).click();
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded' and @data-src='../../demoSite/practice/droppable/accepted-elements.html']"));
		driver.switchTo().frame(frame);
		WebElement element = driver.findElement(By.id("draggable"));
		Actions action= new Actions(driver);
		WebElement drop = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(element, drop).perform();
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("Propagation")).click();
		Thread.sleep(1000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded' and @data-src='../../demoSite/practice/droppable/propagation.html']"));
		
		driver.switchTo().frame(frame2);
		
		WebElement element2 = driver.findElement(By.id("draggable"));
		
		WebElement drop2 = driver.findElement(By.xpath("//p[text()='Inner droppable (greedy)']"));
		
		action.dragAndDrop(element2, drop2).perform();
	}

}
