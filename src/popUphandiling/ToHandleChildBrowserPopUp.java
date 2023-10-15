package popUphandiling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildBrowserPopUp {

	public static void main(String[] args) {
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for(String windowId :allWindowIds) {
			driver.switchTo().window(windowId);
		}
		
		driver.findElement(By.linkText("Log in")).click();

		
	}

}
