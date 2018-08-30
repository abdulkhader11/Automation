
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	

	public static void main(String[] args)  throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			   
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			
			
		
			//MouseHover functions
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
		   Thread.sleep(3000);
	      driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
	      Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("9964711440");
		   driver.findElement(By.xpath(".//*[@id='continue']")).click();
		   driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("123");
		   driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		   
		
		   //Dropdown
		 driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")).click();
		//driver.findElement(By.xpath(".//*[@id='searchDropdownBox']/option[13]")).click();   
		
		WebElement searchDropdownBox=driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
		
		Select item=new Select(searchDropdownBox);
		item.selectByValue("search-alias=appliances");
	}
	
}
	
