package popUphandiling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopUp {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("jaurney-date")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[text()='November']/../../..//span[text()='24']")).click();
				break;
			}
			catch(Exception e){
				driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
			}
			
		}


	}

}
