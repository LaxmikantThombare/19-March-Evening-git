package variabletypesstudy;

public class Globalvariablstudy {

	int a=10;
	static int b=20;
	
	
	
	public static void main(String[] args) {

		
	Globalvariablstudy st=new Globalvariablstudy();
	st.test();
	/*System.out.println("value of a is "+st.a);
	test1();
	System.out.println(" value of b is "+ b );*/
		
	Sample pt=new Sample();
	System.out.println("value from other class is "+Sample.q);
	System.out.println("value from other class1 is "+pt.p);
	
	
     
		int sub=800-st.a;	
		int sub1=900-b;
		
		System.out.println(sub);
		System.out.println(sub1);
	}
   public void test()
   {
	int a=10;
	
	int sum=a+10;
	int sub=b-10;
}
	public static void test1()
	{  
		//int sum=a+10; 
		int sub=b-10;
		
	}
}
	

