
public class AbstractClassDemo extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new AbstractClassDemo();
		b.run();
	}
	
	public void run()
	{
		System.out.println("Running safely");
	}

}

abstract class Bike{
	abstract void run();
}
