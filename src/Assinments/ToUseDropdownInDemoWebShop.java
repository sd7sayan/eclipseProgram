package Assinments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseDropdownInDemoWebShop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/");
	    driver.findElement(By.partialLinkText("Books")).click();
	    
	   WebElement dropDown = driver.findElement(By.id("products-orderby"));
	   
	   Select select = new Select(dropDown);
	   
	   select.selectByVisibleText("Price: Low to High");
	   

	}

}
