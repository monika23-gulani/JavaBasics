class Address {
	String city, state, zipcode;

	Address(String city, String state, String zipcode) {
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
}

class Employee1 {
	int id;
	String name;
	Address add;
	
	Employee1(int id,String name,Address add1)
	{
		this.id = id;
		this.name = name;
		this.add=add1;
	}
	
	public void display()
	{
		System.out.println("Id:"+id+"name:"+name);
		System.out.println("Address:"+add.city+" "+add.state+" "+add.zipcode);
	}

}

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address("Indore", "MP", "452001");
		Address a2 = new Address("Guna", "MP", "452001");
		
		Employee1 emp1 = new Employee1(1, "Monika", a1);
		
		Employee1 emp2 = new Employee1(1, "Monika", a2);
		
		emp1.display();
		emp2.display();
	}

}
