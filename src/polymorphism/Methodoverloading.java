package polymorphism;

public class Methodoverloading {

	public static void main(String[] args) {
// declering multiple method with same method name but with 
		//differnt arguments in a same class is called method overloading
		
		Methodoverloading mo =new Methodoverloading();
		mo.add();
		mo.add(90,89);
		//mo.add(10,10,10);
		
	}

	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("sum is"+sum);
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		{
		System.out.println("sum is"+sum);
		}
	
	
	//public void add(int a,int b,int c)
	{
		
		System.out.println("sum is"+sum);
	}
	
}
}