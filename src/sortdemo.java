import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));
	        // Sorting in natural (alphabetical) order
	        Collections.sort(names);
	        System.out.println("Sorted names: " + names);
	        //hello
	}

}
