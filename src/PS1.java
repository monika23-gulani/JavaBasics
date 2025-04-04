import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS1 {

	public void test() {
		// TODO Auto-generated method stub
		System.out.println("I am in parent class");
	}
	
	@BeforeMethod
	public void beforeRun()
	{
		System.out.println("Before test");
	}
	
	@AfterMethod
	public void afterRun()
	{
		System.out.println("After test");
	}

}
