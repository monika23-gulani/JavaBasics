class Parent {
	Parent() {
		System.out.println("Parent class constructor invoked");
	}
}

class Child extends Parent {
	Child() {
		super();
		System.out.println("Child class constructor invoked");
	}

	Child(int a) {
		super();
		System.out.println("Child class param constructor invoked");
	}
	{
		System.out.println("instance initializer block is invoked");
	}
}

public class InstanceInitializerBlock {
	final int num ;
	
	InstanceInitializerBlock()
	{
		num =100;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		Child c2 = new Child(10);
	}

}
