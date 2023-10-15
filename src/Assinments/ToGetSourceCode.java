package Assinments;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		
		String source = driver.getPageSource();
		System.out.println(source);

	}

}
