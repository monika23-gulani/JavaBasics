class Animalst {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogst extends Animalst {
	void eat() {
		System.out.println("eating bread...");
	}
}

class Catst extends Animalst {
	void eat() {
		System.out.println("eating rat...");
	}
}

class Lionst extends Animalst {
	void eat() {
		System.out.println("eating meat...");
	}
}

class TestPolymorphism {
	public static void main(String[] args) {
		//Animalst as;
		Dogst t1 = new Dogst();
		t1.eat();
		Catst t2 = new Catst();
		t2.eat();
		Lionst t3 = new Lionst();
		t3.eat();
	}
}