import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class linkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");
		System.out.println("Initial list of elements: " + ll);
		// Removing specific element from arraylist
		ll.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + ll);
		// Removing element on the basis of specific position
		ll.remove(0);
		System.out.println("After invoking remove(index) method: " + ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Ravi");
		ll2.add("Hanumat");
		// Adding new elements to arraylist
		ll.addAll(ll2);
		System.out.println("Updated list : " + ll);
		// Removing all the new elements from arraylist
		ll.removeAll(ll2);
		System.out.println("After invoking removeAll() method: " + ll);
		// Removing first element from the list
		ll.removeFirst();
		System.out.println("After invoking removeFirst() method: " + ll);
		// Removing first element from the list
		ll.removeLast();
		System.out.println("After invoking removeLast() method: " + ll);
		// Removing first occurrence of element from the list
		ll.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + ll);
		// Removing last occurrence of element from the list
		ll.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + ll);
		
		Collections.sort(ll);

		// Removing all the elements available in the list
		ll.clear();
		System.out.println("After invoking clear() method: " + ll);
		
		String[] array= {"I","am","Monika"};
		
		List<String> words=Arrays.asList(array);
		System.out.println(words);
		
		
		String[] newArray= words.toArray(new String[words.size()]);
		System.out.println(Arrays.toString(newArray));
		
		List<Integer> no=new ArrayList<Integer>();
		no.add(10);
		no.add(100);
		no.add(80);
		
		
		Collections.sort(no,Collections.reverseOrder());
		System.out.println(no);
		
		ListIterator<Integer> it= no.listIterator(no.size());
		System.out.println("I am here out");
//		while(it.hasNext())
//		{
//			System.out.println("I am here");
//			System.out.println(it.next());
//		}
		while(it.hasPrevious())
		{
			System.out.println("I am here");
			System.out.println(it.previous());
		}
		

}
}