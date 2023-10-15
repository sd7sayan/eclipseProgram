package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshotOfEntirePage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File temp= ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorshots/youtube.jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);

	}

}
