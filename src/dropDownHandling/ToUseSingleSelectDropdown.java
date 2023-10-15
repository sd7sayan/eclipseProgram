package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUseSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(day);
		Select monthSelect = new Select(month);
		Select yearSelect = new Select(year);
		
		daySelect.selectByIndex(12);
		monthSelect.selectByValue("1");
		yearSelect.selectByVisibleText("1997");
		
		List<WebElement> allMonths = monthSelect.getOptions();
		
		for(WebElement months : allMonths) {
			System.out.println(months.getText());
			//monthSelect.selectByVisibleText(months.getText());
			///Thread.sleep(1000);
		}
	}

}
