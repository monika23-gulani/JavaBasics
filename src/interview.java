
public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello@World!";
		String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(cleaned);

	}

}
