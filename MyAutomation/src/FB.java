import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB {

	
	WebDriver driver= new ChromeDriver();
	
	
	@BeforeTest
	public void start() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	
		driver.get("http://fb.com/");
		Thread.sleep(1000);	
		
	}
	@Test
	public void fb() throws InterruptedException {
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Anam");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("Khan");
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_r']")).sendKeys("anam123khan@gmail.com");
		driver.findElement(By.xpath(".//*[@id='u_0_v']")).sendKeys("123anam");	
	}
	
	@AfterTest
	public void quit() {
		
		driver.quit();
	}
	}
	
