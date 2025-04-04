import java.util.*;

class Booktst implements Comparable<Booktst> {
	int id;
	String name, author, publisher;
	int quantity;

	public Booktst(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

// implementing the abstract method  
	/*
	 * public int compareTo(Booktst b) { if (id > b.id) { return 1; } else if (id <
	 * b.id) { return -1; } else { return 0; } }
	 * 
	 * }
	 */
	@Override
	public int compareTo(Booktst b) {
		return this.name.compareTo(b.name);
	}

	public class hassetdemo {
		public static void main(String[] args) {
			Set<Booktst> set = new TreeSet<Booktst>();
			// Creating Books
			Booktst b1 = new Booktst(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
			Booktst b2 = new Booktst(233, "Operating System", "Galvin", "Wiley", 6);
			Booktst b3 = new Booktst(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
			// Adding Books to TreeSet
			set.add(b1);
			set.add(b2);
			set.add(b3);
			// Traversing TreeSet
			for (Booktst b : set) {
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
			}

			TreeSet<String> set3 = new TreeSet<String>();
			set3.add("Ravi");
			set3.add("Vijay");
			set3.add("Ajay");
			System.out.println("Traversing element through Iterator in descending order");

		}
	}
}