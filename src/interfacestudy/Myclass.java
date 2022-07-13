package interfacestudy;

public class Myclass implements myinterface {

	public static void main(String[] args)
	{
      Myclass s= new Myclass();
      s.test();
      s.test1();
      s.mymethod();
     // a= a+10;  //final value can't be update
      System.out.println("my value of a is "  +a);
      
	}

	@Override
	public void test() 
	{
	System.out.println("this is my method completed in implementation class");	
	}

	@Override
	public void test1() 
	{
		System.out.println("this is my method completed in implementation class");	

	}
     public void mymethod()
     {
    	 System.out.println("my");
     }
     
	
	
	
}
