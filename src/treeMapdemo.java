import java.util.NavigableMap;
import java.util.TreeMap;

public class treeMapdemo {

	static int number =10;
	int number1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer ,String> map=new TreeMap<Integer ,String>();  
		number =20;
		number=30;
		System.out.println(number); 
		
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      System.out.println("headMap: "+map.headMap(102));  
	      System.out.println("tailMap: "+map.tailMap(102));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	}
}
