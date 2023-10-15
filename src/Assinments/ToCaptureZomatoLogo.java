package Assinments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToCaptureZomatoLogo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		Thread.sleep(4000);
		
		File temp = driver.findElement(By.xpath("//img[@alt='Zomato logo' and @class='sc-elhb8j-1 ixsoFB']")).getScreenshotAs(OutputType.FILE);
		File src = new File("./errorshots/zomatologo2.jpeg");
		FileHandler.copy(temp, src);
	}

}
