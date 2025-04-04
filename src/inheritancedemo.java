//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle{  
	
	Vehicle(){
		System.out.println("Parent class constructor");
	}
  //defining a method  
  void run(){System.out.println("parent class menthod run is running");}  
}  
//Creating a child class  
class inheritancedemo extends Vehicle{  
	inheritancedemo(){
		//super();
		System.out.println("Child class constructor");
	}
  //defining the same method as in the parent class  
  void run(){System.out.println("child class run method is running safely");}  
  
  public static void main(String args[]){  
	  inheritancedemo obj = new inheritancedemo();//creating object  
  obj.run();//calling method  
  }  
}  