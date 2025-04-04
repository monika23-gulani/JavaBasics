import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class queueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();    
        // Adding elements to the PriorityQueue  
        queue.add("Amit");    
        queue.add("Vijay");    
        queue.add("Karan");    
        queue.add("Jai");    
        queue.add("Rahul");    
        //queue.add(null); 
        
        System.out.println(queue);
        
        Map<Integer, String> map = new HashMap<Integer, String>();  
        // Adding key-value pairs to the map  
        map.put(100, "Amit");  
        map.put(101, "Vijay");  
        map.put(102, "Rahul");  
        
        map.entrySet().stream().sorted(Map.Entry.comparingByKey())
        .forEach(a->System.out.println(a.getValue()));
        
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(a->System.out.println(a));
        HashMap<Integer,String> hm=new HashMap<Integer,String>();    
        hm.put(100,"Amit");    
        hm.put(101,"Vijay");    
        hm.put(102,"Rahul");   
        System.out.println("Initial list of elements:");  
       for(Map.Entry m:hm.entrySet())  
       {  
          System.out.println(m.getKey()+" "+m.getValue());   
       }  
       System.out.println("Updated list of elements:");  
       hm.replace(102, "Gaurav");  
       for(Map.Entry m:hm.entrySet())  
       {  
          System.out.println(m.getKey()+" "+m.getValue());   
       }  
       System.out.println("Updated list of elements:");  
       hm.replace(101, "Vijay", "Ravi");  
       for(Map.Entry m:hm.entrySet())  
       {  
          System.out.println(m.getKey()+" "+m.getValue());   
       }   
	}

}
