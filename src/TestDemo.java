import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "My name Monika";
		String[] words = name.split(" ");
		
		List<String> l = Arrays.asList(words);
		
		Collections.sort(l);
		
		System.out.println(l);
		
//		Iterator<String> list= l.iterator();
//		if(list.hasNext())
//		{
//			System.out.println(list.next());
//		}
		
		String name2 = "monika";
		String name1 = "monika";
		String abc= new String("Monika");
		String abc2= new String("Monika"); 

		StringBuilder build = new StringBuilder();
		build.append("Enter the number");
	
		build.append(name);
		
		
		
Integer[] num= {100,200,300,400};
Arrays.sort(num);
Arrays.sort(num,Collections.reverseOrder());
for(int n:num)
{
System.out.println(n);
}
//		int flag=0;
//		int greatestno;
//		for(int i=0;i<num.length;i++)
//		{
//			for(int j=i;j<num.length;j++)
//			{
//			if(num[i]>num[i])
//				greatestno = num[i]
//						flag++;
//			break
//			}
//			else
//			{
//				co
//			}
//		}
//		
//		
		
	}

}


