package popUphandiling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandingJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		Thread.sleep(2000);
		//popup.accept();
		popup.dismiss();

	}

}
