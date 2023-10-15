package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseManageMethod {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.manage().window().maximize();
	
		//driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.quit();

	}

}
