class Animal {
	Animal() {
		System.out.println("animal is created");
	}
	
	void eat()
	{
		System.out.println("Animal eating");
	}
	
}

class Dog extends Animal {
	Dog() {
		//super();
		System.out.println("dog is created");
	}
	void eat()
	{
		super.eat();
		System.out.println("dog eating");
	}
}

class inheritancedemo2 {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.eat();
	}
}