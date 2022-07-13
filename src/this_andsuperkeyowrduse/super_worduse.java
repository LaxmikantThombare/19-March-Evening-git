package this_andsuperkeyowrduse;

public class super_worduse extends This_use 
{
	int a=100; //non static global variable from sub class

	public static void main(String[] args) {

		super_worduse a=new super_worduse();
		a.sub();
		
	}
     public void sub()
     {
    	 int a=900;
 		int sub=a-700; //using ;local variable
 		System.out.println("sub is" +sub);
 		System.out.println("value of a from this use class is" +super.a);
     }
}
