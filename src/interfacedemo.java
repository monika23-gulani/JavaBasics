interface Aint{  
void a();  
void b();  
void c();  
void d();  
}  

abstract class intest1 implements Aint{  
public void c(){System.out.println("I am c");}  
}  

class Mtest extends intest1{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  

public class interfacedemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aint a=new Mtest();  
		a.a();  
		a.b();  
		a.c();  
		a.d(); 
	}

}
