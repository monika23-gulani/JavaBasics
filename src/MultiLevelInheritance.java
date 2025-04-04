class Breed {
	void eat() {
		System.out.println("eating...");
	}
}

class Lion extends Breed {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Lion {
	void meow() {
		System.out.println("meowing...");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.bark();
		c.eat();
	}

}
