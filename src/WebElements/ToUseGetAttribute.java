package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		String tooltipmsg = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		System.out.println(tooltipmsg);

	}

}
