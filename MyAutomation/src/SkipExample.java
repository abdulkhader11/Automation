
import org.testng.annotations.Test;


public class SkipExample {
	
	@Test ()
	public void testCaseEnabling(){
			System.out.println("This should run");
		}
	@Test(enabled=false)
	public void testCaseSkipException(){
			System.out.println("Im in skip exception");
	}
	@Test(enabled=true)
	public void testCaseSkipExceptionnn(){
	System.out.println("This should run1");
			
		}

	}

