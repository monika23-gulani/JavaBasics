
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4; // Number of rows
		int num = 1; // Start number

		for (int i = 1; i <= rows; i++) {
			int start = num; // Store the start value for the row
			num += 4; // Each row has 4 numbers

			if (i % 2 != 0) {
				// Print in increasing order
				for (int j = start; j < num; j++) {
					System.out.print(j + " ");
				}
			} else {
				// Print in reverse order
				for (int j = num - 1; j >= start; j--) {
					System.out.print(j + " ");
				}
			}
			System.out.println(); 
		}
	}
}
