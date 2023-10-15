package webDriver_Methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseNavigateMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://baskinrobbinsindia.com/");
		
		 driver.navigate().to(new URL("https://baskinrobbinsindia.com/"));
		
	     Navigation nav = driver.navigate();
	     nav.back();
	     Thread.sleep(3000);
	     
	     nav.forward();
	     Thread.sleep(3000);
	     
	     nav.refresh();
	     Thread.sleep(3000);
	     
	     driver.quit();
	}

}
