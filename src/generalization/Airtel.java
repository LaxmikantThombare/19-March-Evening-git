package generalization;

public class Airtel implements TRAI
{

	@Override
	public void call() 
	{
		System.out.println("05 per min");
	}

	@Override
	public void msg() 
	{
		System.out.println("100 per day");

	}

	@Override
	public void data()
	{
		System.out.println("1 gb day");

	}
	 
	public void myairtel()
	{
		System.out.println("my airtel method");

	}
	
	

}
