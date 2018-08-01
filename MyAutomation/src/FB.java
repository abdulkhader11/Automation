import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://fb.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='day']")).click();
	driver.findElement(By.xpath(".//*[@id='day']/option[8]")).click();
	
	}
}
