package dataDrivenMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ToReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		// step 1: create fileInnputStream object
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		
		//create workbook obj
		 Workbook workbook = WorkbookFactory.create(fis);
		 
		 //call methods
		 String url = workbook.getSheet("data").getRow(0).getCell(0).toString();
		 String username = workbook.getSheet("data").getRow(1).getCell(0).toString();
		 String password = workbook.getSheet("data").getRow(2).getCell(0).toString();
		 
		 //Automation Script
		 
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
