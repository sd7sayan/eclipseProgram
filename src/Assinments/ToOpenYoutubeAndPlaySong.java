package Assinments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToOpenYoutubeAndPlaySong {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("jhumka song by muza");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Xefer x Muza - Jhumka (Official Music Video)")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		Thread.sleep(1000);
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[@class='ytp-ad-skip-button-icon']")).click();
				break;
			}
			catch(Exception e) {
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		for(;;) {
			
			try {
			if(driver.findElement(By.xpath("//button[@data-title-no-tooltip='Replay']")).isDisplayed()==true) {
			driver.findElement(By.xpath("//button[@title='Exit full screen (f)']")).click();
			  }  break;
			     }
				catch(Exception e1 ) {
					Thread.sleep(100);
				}
			 
			}
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.clear();
		search.sendKeys("jawan chaleya song");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(3000);
        driver.findElement(By.linkText("JAWAN: Chaleya (Hindi) | Shah Rukh Khan | Nayanthara | Atlee | Anirudh | Arijit S, Shilpa R | Kumaar")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		
	}

}
