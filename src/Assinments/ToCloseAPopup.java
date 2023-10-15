package Assinments;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAPopup {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		
		for(;;) {
		 try {
			 driver.findElement(By.id("loginclose1")).click();
			 break;
		 }
		 catch(Exception e) {
		Thread.sleep(3000);
		 }
		}
		List<WebElement> allEle = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
		for(WebElement ele : allEle) {
			System.out.println(ele.getText());
		}
	}

}
