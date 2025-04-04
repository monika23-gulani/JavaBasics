
import java.time.Duration;
import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "A sign in attempt requires further verification because we did not recognize your device.";
		char[] text1 = text.toCharArray();
		for (int i = text.length() - 1; i >= 0; i--)
            System.out.print(text1[i]);
    }

}
