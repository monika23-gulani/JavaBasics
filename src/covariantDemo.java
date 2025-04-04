class A1 {
	A1 foo() {
		return this;
	}

	void get() {
		System.out.println("I am in A1");
	}
}

class A2 extends A1 {
	@Override  
	A2 foo() {
		return this;
	}

	void get() {
		System.out.println("I am in A2");
	}
}

class A3 extends A2 {
	@Override  
	A3 foo() {
		return this;
	}

	void get() {
		System.out.println("I am in A3");
	}
}

public class covariantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a1 = new A1();
		a1.foo().get();

		A2 a2 = new A2();
		a2.foo().get();

		A3 a3 = new A3();
		a3.foo().get();
	}

}
