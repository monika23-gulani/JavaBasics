class Parenttst
{
	static void method(Parenttst p)
	{
		if(p instanceof Downcastingdem)
		{
			Downcastingdem d = (Downcastingdem) p;
		System.out.println("ok downcasting performed");
		}
	}
}

abstract class ab extends Parenttst
{
	
}
public class Downcastingdem extends Parenttst{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parenttst p = new Downcastingdem();
		Downcastingdem.method(p);
	}

}
