import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classtwo {
	
	
	@BeforeTest
	public void beforetest() throws InterruptedException {
		
		System.out.println("I am in Before test - class two");
		
		}
	
	@Test
	public void testone() throws InterruptedException {
		
		System.out.println("I am in Testone - class two");
		
		
	}
	@AfterTest
	public void aftertest() throws InterruptedException {
		
		System.out.println("I am in After Test - class two");
		
		}
	
	
	}


