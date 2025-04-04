import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list =new ArrayList<String>();
		list.add("Monika");
		list.add("Monika");
		list.add("Rahul");
		list.add("Adam");
		
		ArrayList<String> list2 =new ArrayList<String>();
		list2.add("Sapna");
		list2.add("Monika");
		
		
		list.retainAll(list2);
		System.out.println(list);
		
		//	list.add(null);
		list.add("");
		list.forEach(a->{
			System.out.println(a);
		});
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Collections.sort(list);
		for(String nm : list)
		{
			System.out.println(nm);
		}
		list.removeIf(str->str.contains("Monika"));
		System.out.println(list);
		
		// Different ways to iterate list
		ListIterator<String> itreverse = list.listIterator();
		
		while(itreverse.hasPrevious())
		{
			System.out.println(itreverse.previous());
			
		}
		
		
		
		it.forEachRemaining(a->{
			System.out.println(a);
		});
		
		Student s1 = new Student(1,"Monika");
		Student s3 = new Student(1,"Monika");
		Student s2 = new Student(2,"Dina");
		System.out.println("Test interview"+ s1.equals(s3));
		ArrayList<Student> so= new ArrayList<Student>();
		so.add(s2);
		so.add(s1);
		
		so.forEach(s->System.out.println(s.name+":"+s.rollno));
		
		
	}

}

class Student
{ 
	int rollno;
	String name;
	Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name= name;
		
	}
}
