package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUsedragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		//images
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		//trash
		WebElement trash = driver.findElement(By.id("trash"));
		
		//gallery
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		Actions action = new Actions(driver);
		
		//move from gallery to trash
		//action.dragAndDrop(img1, trash).perform();
		action.dragAndDropBy(img1, 500, 0).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img2, trash).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img3, trash).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img4, trash).perform();
		Thread.sleep(3000);
		
		//move from trash to gallery
		action.dragAndDrop(img1, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img2, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img3, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(img4, gallery).perform();
		Thread.sleep(1000);
		
		
		
		
		
		
		
	}

}
