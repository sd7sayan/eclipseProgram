package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseMultipleSelectCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multiSelect = driver.findElement(By.id("cars"));
		
		Select select = new Select(multiSelect);
		
		select.selectByValue("90");
		select.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		
		select.deselectByValue("90");
		Thread.sleep(1000);
		select.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");

	}

}
