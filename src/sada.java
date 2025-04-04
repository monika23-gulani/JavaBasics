import java.util.Scanner;

public class sada {

    public static void main(String args) {
    }
    

    public static void main(String[] args) {
   
    	int temp =9;
    	int data = 8;
    	System.out.println(9&8);

    	
    	Class a = new sada().getClass();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'done' to finish):");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                
                if (number > largest) {
                    secondLargest = largest;
                    largest = number;
                } else if (number > secondLargest && number != largest) {
                    secondLargest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        scanner.close();
    }
}

class Student1
{
	
}