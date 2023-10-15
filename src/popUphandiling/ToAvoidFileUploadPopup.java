package popUphandiling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad=1&gclid=Cj0KCQjwpompBhDZARIsAFD_Fp-XM8hRAsBXhufNkpQPN-BvG_-4QpERvHDEvOmXdN_o3Y0tcc0cVZwaAlFiEALw_wcB&gclsrc=aw.ds");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Sayan\\Desktop\\RESUME\\Sayan_Das Resume (2).pdf");
		
		
		

	}

}
