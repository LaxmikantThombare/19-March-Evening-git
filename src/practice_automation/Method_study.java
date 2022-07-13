package practice_automation;

public class Method_study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo();	       //to call static method from same class we call it by mathod name
		
		Method_study obj=new Method_study();
		obj.demo1();
		
		
		
		Methodstudyfrom_anotherclass.demo2();   //classname.methodname  --//to call static method from another class
		
		Methodstudyfrom_anotherclass obj1=new Methodstudyfrom_anotherclass();
		obj1.demo3();
		
	}

	public static void demo()                  //
	{
		System.out.println("this is my demo static study");
	}
	
	public void demo1()
	{
		System.out.println("this is my demo1 non_static study");
		
	}
	
	
	
	
}
