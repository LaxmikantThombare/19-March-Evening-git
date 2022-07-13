package generalization;

public class Vodafone implements TRAI
{

	@Override
	public void call() {
		System.out.println("3 per min");		
	}

	@Override
	public void msg() {
		System.out.println("250 per day");		
	}

	@Override
	public void data() {
		System.out.println("3 gb day");		
	}
	public void myvodafone()
	{
		System.out.println("my vodafone method");

	}
}
