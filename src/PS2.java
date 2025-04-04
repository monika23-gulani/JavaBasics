import org.testng.annotations.Test;

public class PS2 extends PS1 {

	@Test
	public void testRun() {
		int num = 3;
		// TODO Auto-generated method stub
		test();
		PS3 obj = new PS3(num);
		System.out.println(obj.increment());
		System.out.println(obj.decrement());
		System.out.println(obj.multipleBy3());

	}

}
