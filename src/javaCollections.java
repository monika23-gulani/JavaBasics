import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class javaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> fruits= new ArrayList<String>();
			fruits.add("Grapes");
			fruits.add("Apple");
//			fruits.add("");
//			fruits.add("null");
//			fruits.add(null);
			fruits.add("mango");
			fruits.add("mango");
			
			for(String fruit:fruits)
			{
				System.out.println(fruit);
			}
			Collections.sort(fruits);
			for(String fruit:fruits)
			{
				System.out.println(fruit);
			}
			
			//print elememts in reverse order
			System.out.println("reverse***********************");
			ListIterator<String> list1 =fruits.listIterator(fruits.size());
			while(list1.hasPrevious())
			{
				System.out.println(list1.previous());
			}
			
			 for(int i=0;i<fruits.size();i++)  
	           {  
	            System.out.println(fruits.get(i));     
	           }  
	}

}
