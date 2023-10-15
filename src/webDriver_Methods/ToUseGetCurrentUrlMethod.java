package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCurrentUrlMethod {

	public static void main(String[] args) {
		 ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.instagram.com/");
		 String urlOfTheWebPage = driver.getCurrentUrl();
		 System.out.println(urlOfTheWebPage);

	}

}
