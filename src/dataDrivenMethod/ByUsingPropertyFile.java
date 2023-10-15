package dataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// step 1: create fileInnputStream object
		FileInputStream fis = new FileInputStream("./testData/testdata.properties");
		
		//step 2 : create properties object
		Properties prop = new Properties();
		
		//step 3 : call methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		//Automation Scripts
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();

	}

}
