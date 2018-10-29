import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classone {
	
	
WebDriver driver= new ChromeDriver();
	
	
	@Test
	public void start() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	
		driver.get("http://fb.com/");
		Thread.sleep(1000);	
		driver.close();
	}
}
