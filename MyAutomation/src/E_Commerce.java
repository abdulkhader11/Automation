import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Commerce 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.ecwid.com/cp/?partner=ecwid_e6c#register");
		//sign up
		//driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div[1]/a")).click();
		Thread.sleep(2000);
		//name
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div[1]")).click();
		//name text
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[1]/div[2]/div[1]/div[1]/input")).sendKeys("Name");
		//email
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[2]/div[2]/div[1]/div[1]")).click();
		//email text
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[2]/div[2]/div[1]/div[1]/input")).sendKeys("aasu@gmail.com");
		//password
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[3]/div[2]/div[1]/div[1]")).click();
		//password text
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/div[3]/div[2]/div[1]/div[1]/input")).sendKeys("Minds123");
		//okay button
		driver.findElement(By.xpath("html/body/div[8]/div/div[2]/div[2]/div/div[1]/div/div[2]/form/div/button")).click();
		Thread.sleep(10000);
		//expirence
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[1]/select")).click();
		Thread.sleep(10000);
		//started
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[1]/select/option[2]")).click();
		//products
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/select")).click();
		//comp
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div[1]/div[1]/select/option[6]")).click();
		//website
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/select")).click();
		//no
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/select/option[3]")).click();
		//facebook
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[2]/div[1]/div[1]/select")).click();
		//no
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[4]/div/div[2]/div[1]/div[1]/select/option[3]")).click();
		//store
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[5]/div/div[2]/div[1]/div[1]/select")).click();
		//no
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[2]/div/div/div/div[5]/div/div[2]/div[1]/div[1]/select/option[3]")).click();
		//complete registration
		driver.findElement(By.xpath("html/body/div[7]/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/button")).click();
	}
}
