
public class AbstractClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj= new M();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}

}

abstract class B implements A{
	
	public void c()
	{
		System.out.println("I am c");
	}

}

interface A{
	
	void a();
	void b();
	void c();
	void d();
}

class M extends B
{
	public void a()
	{
		System.out.println("I am a");
	}
	public void b()
	{
		System.out.println("I am b");
	}
	public void d()
	{
		System.out.println("I am d");
	}
	
}

