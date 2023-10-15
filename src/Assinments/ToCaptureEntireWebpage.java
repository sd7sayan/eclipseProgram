package Assinments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import screenShot.ToTakeScreenshotOfEntirePage;

public class ToCaptureEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=12990658828154242515&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061995&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        Thread.sleep(4000);
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File src = new File("./errorshots/amazone.jpeg");
        FileHandler.copy(temp, src);
	}

}
