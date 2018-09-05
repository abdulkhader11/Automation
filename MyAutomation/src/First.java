

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class First
{
@Test
public  void ak () throws InterruptedException {
	
	System.out.println("Welcome to Jenkins");
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	   
	driver.get("http://automationpractice.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
}
}

	

