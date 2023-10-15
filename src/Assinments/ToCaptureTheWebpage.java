package Assinments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTheWebpage {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
	
}
}
