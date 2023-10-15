package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSourceCode {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
	    String toCaptureSourceCode = driver.getPageSource();
	    System.out.println(toCaptureSourceCode);
	}

}
