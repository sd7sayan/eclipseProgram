package webDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTitle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String titleOfTheWebPage = driver.getTitle();
		System.out.println(titleOfTheWebPage);

	}

}
