import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus 
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
driver.findElement(By.xpath("//a[contains(@title, 'Contact Us')]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select")).click();
driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[1]/div/select/option[2]")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[4]/input")).sendKeys("email@gmail.com");
		//driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[2]/div/select")).sendKeys("OCVAJ");
		driver.findElement(By.xpath("html/body/div/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/p[5]/div/input")).sendKeys("E:\\Ttesting ResumeTest.docx");
	}
}

