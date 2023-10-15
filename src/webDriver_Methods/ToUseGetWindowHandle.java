package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetWindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);

	}

}
