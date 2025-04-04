
public class stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Mahendra Singh Dhoni";
		StringBuilder result = new StringBuilder();

		String[] words = name.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i < words.length - 1) {
				result.append(words[i].charAt(0)).append(".");
			} else {
				result.append(words[i]); // Append full last name
			}
		}

		System.out.println(result);
	}

}
