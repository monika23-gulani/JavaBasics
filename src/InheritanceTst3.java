
class Test1{  
	int x =10;
void eat(){System.out.println("animal is eating...");}  
}  
/*class Test2 extends Test1{  
	int b=20;
void eat(){System.out.println("dog is eating...");}  
} */ 

public class InheritanceTst3 extends Test1{

	public static void main(String[] args) {
		int x=20;
		// TODO Auto-generated method stub
		Test1 a=new InheritanceTst3();  
		InheritanceTst3 tst= new InheritanceTst3();
		a.eat(); 
		System.out.println(a.x);
		System.out.println(tst.x);
	}

}
