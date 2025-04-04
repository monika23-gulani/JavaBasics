import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> al = new TreeSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");

		// Traversing elements
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<String> itr2 = al.descendingIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(90);
		set.add(5);
		set.add(8);
		set.add(50);
		set.add(80);
		
//		System.out.println(set.pollFirst());
//		System.out.println(set.pollLast());
		System.out.println(set);
		
		TreeSet<String> set1=new TreeSet<String>();  
        set1.add("A");  
        set1.add("B");  
        set1.add("C");  
        set1.add("D");  
        set1.add("E");  
        
        System.out.println(set1);
        System.out.println(set1.descendingSet());
        System.out.println(set1.headSet("C",true));
        System.out.println(set1.tailSet("C",false));
        System.out.println(set1.subSet("A", true, "E",false));
        System.out.println(set.headSet(80));
        System.out.println(set.tailSet(80));
        System.out.println(set.subSet(5,80));
	}

}
