import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add(null);	
         
         Iterator<String> it = ll.descendingIterator();
         
         Collections.sort(ll);
         System.out.println(ll);
         while(it.hasNext())  
         {  
             System.out.println(it.next());  
         } 
	}

}
